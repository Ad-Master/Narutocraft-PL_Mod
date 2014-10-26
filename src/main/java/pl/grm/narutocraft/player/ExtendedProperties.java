package pl.grm.narutocraft.player;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import pl.grm.narutocraft.ProxyCommon;
import pl.grm.narutocraft.handlers.JutsuManager;
import pl.grm.narutocraft.jutsu.IJutsu;

public class ExtendedProperties implements IExtendedEntityProperties {
	public final static String			EXT_PROP_NAME	= "NCPLExtPlayer";
	private final EntityPlayer			player;
	/** Jutsu Manager Instance */
	private JutsuManager				jManager		= JutsuManager.instance;
	@Deprecated
	public PlayerSkillsAtrributes		psa				= new PlayerSkillsAtrributes();
	private NinjaAtrributes				ninAttrs		= new NinjaAtrributes();
	private NinjaStats					ninStats		= new NinjaStats();
	@Deprecated
	// TODO take to stats
	private int							maxChakra, maxChakraCap = 500, chakraBase = 50;
	private static final int			CHAKRA_WATCHER	= 20;
	public static List<int[]>			activeJutsus	= new ArrayList<int[]>();
	public static Map<Integer, IJutsu>	jutsuList;
	@Deprecated
	// TODO move to stats
	public boolean						ninjaRun		= false;
	
	public ExtendedProperties(EntityPlayer player) {
		this.player = player;
		this.maxChakra = chakraBase;
		this.player.getDataWatcher().addObject(CHAKRA_WATCHER, this.maxChakra);
	}
	
	public static ExtendedProperties For(EntityLivingBase living) {
		return (ExtendedProperties) living.getExtendedProperties("NarutoCraftExProps");
	}
	
	@Override
	public void init(Entity entity, World world) {
		
	}
	
	@Override
	public final void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = new NBTTagCompound();
		
		this.jManager.writeToNBT(properties);
		properties.setInteger("CurrentChakra",
				this.player.getDataWatcher().getWatchableObjectInt(CHAKRA_WATCHER));
		properties.setInteger("MaxChakra", this.maxChakra);
		// this.ninAttrs.writoToNBT(properties);
		// this.ninStats.writoToNBT(properties);
		properties.setIntArray("psaStats", this.psa.getValues()); // TODO delete
																	// when new
																	// ready
		
		compound.setTag(EXT_PROP_NAME, properties);
	}
	
	@Override
	public final void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		
		this.jManager.readFromNBT(properties);
		this.player.getDataWatcher().updateObject(CHAKRA_WATCHER,
				properties.getInteger("CurrentChakra"));
		this.maxChakra = properties.getInteger("MaxChakra");
		// this.ninAttrs.readFromNBT(properties);
		// this.ninStats.readFromNBT(properties);
		this.psa.setValues(properties.getIntArray("psaStats")); // TODO delete
																// when new
																// ready
		
	}
	
	public static final void loadProxyData(EntityPlayer player) {
		ExtendedProperties playerData = ExtendedProperties.get(player);
		NBTTagCompound savedData = ProxyCommon.getEntityData(getSaveKey(player));
		if (savedData != null) {
			playerData.loadNBTData(savedData);
		}
	}
	
	public static final void saveProxyData(EntityPlayer player) {
		NBTTagCompound savedData = new NBTTagCompound();
		ExtendedProperties.get(player).saveNBTData(savedData);
		ProxyCommon.storeEntityData(getSaveKey(player), savedData);
	}
	
	public static final void register(EntityPlayer player) {
		player.registerExtendedProperties(ExtendedProperties.EXT_PROP_NAME, new ExtendedProperties(
				player));
	}
	
	private static final String getSaveKey(EntityPlayer player) {
		return player.getCommandSenderName() + ":" + EXT_PROP_NAME;
	}
	
	public void updateMoveSpeed() {
		PlayerCapabilities pc = player.capabilities;
		try {
			Field walkSpeed = PlayerCapabilities.class.getDeclaredField("walkSpeed");
			walkSpeed.setAccessible(true);
			walkSpeed.setFloat(pc,
					MathHelper.clamp_float(0.45F + ((float) psa.getAgility() / 31), 0.04f, 1.5f));
		}
		catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	
	public void resetMoveSpeed() {
		PlayerCapabilities pc = player.capabilities;
		try {
			Field walkSpeed = PlayerCapabilities.class.getDeclaredField("walkSpeed");
			walkSpeed.setAccessible(true);
			walkSpeed.setFloat(pc, 0.1f);
		}
		catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
		catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
		catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Consumes chakra
	 *
	 * @param value
	 * @return sufficient
	 */
	public final boolean consumeChakra(int value) {
		boolean sufficient = value <= getCurrentChakra();
		setCurrentChakra(getCurrentChakra() - value);
		return sufficient;
	}
	
	/**
	 * Add amount of chakra to currentChakra.
	 *
	 * @param amount
	 */
	public final void regenChakra(int amount) {
		setCurrentChakra(getCurrentChakra() + amount);
	}
	
	/**
	 * Sets currentChakra to maxChakra.
	 */
	public final void replenishChakra() {
		this.player.getDataWatcher().updateObject(CHAKRA_WATCHER, this.maxChakra);
	}
	
	public final int getCurrentChakra() {
		return this.player.getDataWatcher().getWatchableObjectInt(CHAKRA_WATCHER);
	}
	
	/**
	 * Sets current Chakra to value
	 * 
	 * @param value
	 */
	public final void setCurrentChakra(int value) {
		this.player.getDataWatcher().updateObject(CHAKRA_WATCHER,
				value > 0 ? (value < this.maxChakra ? value : this.maxChakra) : 0);
	}
	
	/**
	 * Sets the max chakra the player can have
	 * 
	 * @param amount
	 *            what number + maxChakraBonus the max chakra will be NOTE: only
	 *            works if overridden
	 * @param overrideBaseValue
	 *            this will use the amount if true, else it will only update the
	 *            baseChakra + bonus Chakra
	 **/
	public final void setMaxChakra(int amount, boolean overrideBaseValue) {
		if (overrideBaseValue)
			this.maxChakra = MathHelper.clamp_int(amount + psa.getMaxChakraMod(), 0, maxChakraCap);
		else
			this.maxChakra = MathHelper.clamp_int(chakraBase + psa.getMaxChakraMod(), 0,
					maxChakraCap);
	}
	
	public final int getMaxChakra() {
		return this.maxChakra;
	}
	
	/** Force set the maxChakra + bonus **/
	public final void setMaxChakra(int amount) {
		setMaxChakra(amount, true);
	}
	
	/** This is basically an update max chakra method **/
	public final void setMaxChakra(boolean overrideBaseValue) {
		setMaxChakra(0, false);
	}
	
	public static final ExtendedProperties get(EntityPlayer player) {
		return (ExtendedProperties) player.getExtendedProperties(EXT_PROP_NAME);
	}
}