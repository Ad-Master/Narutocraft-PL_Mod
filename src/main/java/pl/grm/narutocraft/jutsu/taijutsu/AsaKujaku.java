package pl.grm.narutocraft.jutsu.taijutsu;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import pl.grm.narutocraft.jutsu.IJutsu;
import pl.grm.narutocraft.jutsu.Jutsu;

public class AsaKujaku extends Jutsu implements IJutsu {

	public AsaKujaku() {
		this.setUnlocalizedName("Asa Kujaku");
		this.setTextureName(jutsuLoc + "Asa Kujaku");
	}
	public void consumeChackra(int value) {
		// TODO Auto-generated method stub

	}
	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		if (!world.isRemote) {

		}
		return stack;
	}
	@Override
	public void onJutsuUpdate() {
		// TODO Auto-generated method stub

	}
	@Override
	public void setActive(boolean par) {
		// TODO Auto-generated method stub

	}

	public void uploadEffects() {
		// TODO Auto-generated method stub

	}

}