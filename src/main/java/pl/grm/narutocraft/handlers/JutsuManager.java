package pl.grm.narutocraft.handlers;

import java.util.*;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.nbt.*;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.common.registry.GameRegistry;
import pl.grm.narutocraft.jutsu.*;
import pl.grm.narutocraft.libs.config.References;
import pl.grm.narutocraft.player.ExtendedProperties;

public class JutsuManager {

	public static JutsuManager instance = new JutsuManager();
	private Jutsu jutsu;
	private Iterator<int[]> iterator;
	private List<int[]> activeJutsus = new ArrayList<int[]>();

	public JutsuManager() {
		if (ExtendedProperties.jutsuList == null) {
			ExtendedProperties.jutsuList = new HashMap<Integer, IJutsu>();
		}
	}

	/**
	 * Iterate over JutsuEnum and calls regitster method
	 */
	public static void regJutsusList() {
		for (JutsuParams jutsuE : JutsuParams.values()) {
			if (jutsuE != JutsuParams.NONE) {
				Jutsu jutsu = (Jutsu) jutsuE.getJutsu();
				if (jutsu != null) {
					try {
					registerJutsu(jutsu);
					}
					catch (ClassCastException e) {
						System.out.println("Cannot register jutsu " + jutsuE.getName());
						e.printStackTrace();
					}
				}
			}
		}
	}

	/**
	 * Add jutsu to GameRegistry.
	 * 
	 * @param jutsuE
	 */
	private static void registerJutsu(Jutsu jutsu) {
		ExtendedProperties.jutsuList.put(jutsu.getJutsuProps().getID(), jutsu);
		GameRegistry.registerItem(jutsu, jutsu.getJutsuProps().getUnlocalizedName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(jutsu, 0,
 new ModelResourceLocation(
				References.ModTexturePath + jutsu.getJutsuProps().getUnlocalizedName(), "inventory"));

	}

	/**
	 * Called on game save
	 * 
	 * @param compound
	 */
	public void writeToNBT(NBTTagCompound compound) {
		NBTTagList jutsuList = new NBTTagList();
		this.activeJutsus = ExtendedProperties.activeJutsus;
		if (!this.activeJutsus.isEmpty()) {
			for (int[] jutsu : activeJutsus) {
				NBTTagCompound tag = new NBTTagCompound();
				tag.setIntArray("Jutsu:" + jutsu[0], jutsu);
				jutsuList.appendTag(tag);
			}
		}
		compound.setTag("JutsuManager", jutsuList);
	}

	/**
	 * Called when game has loaded
	 * 
	 * @param compound
	 */
	public void readFromNBT(NBTTagCompound compound) {
		NBTTagList jutsus = compound.getTagList("JutsuManager", Constants.NBT.TAG_COMPOUND);
		int amount = jutsus.tagCount();
		if (jutsus != null) {
			for (int i = 0; i < amount; i++) {
				NBTTagCompound jutsu = jutsus.getCompoundTagAt(i);
				this.activeJutsus.add(jutsu.getIntArray("Jutsu:" + i));
			}
		}
		ExtendedProperties.activeJutsus = this.activeJutsus;
	}

	/**
	 * Called on every PLayerTick to update all Jutsu effects.
	 */
	public synchronized void iterateOverJutsus() {
		this.activeJutsus = ExtendedProperties.activeJutsus;
		if (!this.activeJutsus.isEmpty()) {
			this.iterator = this.activeJutsus.iterator();
			while (this.iterator.hasNext()) {
				this.iterator.next();
				if (this.jutsu.isActive()) {
					this.jutsu.onJutsuUpdate();
				} else {
					this.jutsu.setActive(false);
				}
			}
		}
	}

	/**
	 * Called after read from NBT.
	 */
	public synchronized void loadJutsuEffectsOnPlayer() {
		if (!ExtendedProperties.activeJutsus.isEmpty()) {
			while (this.iterator.hasNext()) {
				this.activeJutsus.iterator().next();
				if (this.jutsu.isActive()) {
					this.jutsu.onJutsuUpdate();
				} else {
					this.jutsu.setActive(false);
				}
			}
		}
	}

	public IJutsu getJutsu(int id) {
		IJutsu component = ExtendedProperties.jutsuList.get(id);
		return component;
	}

	public IJutsu getJutsu(String name) {
		int ID = JutsuParams.getByName(name).getJutsuID();
		if (ID == 0) { return null; }
		return ExtendedProperties.jutsuList.get(ID);
	}
}