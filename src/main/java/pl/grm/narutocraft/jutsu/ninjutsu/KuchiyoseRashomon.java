package pl.grm.narutocraft.jutsu.ninjutsu;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import pl.grm.narutocraft.jutsu.IJutsu;
import pl.grm.narutocraft.jutsu.Jutsu;

public class KuchiyoseRashomon extends Jutsu implements IJutsu {

	public KuchiyoseRashomon() {
		this.setUnlocalizedName("Kuchiyose Rashomon");
		this.setTextureName(jutsuLoc + "Kuchiyose Rashomon");
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		if (!world.isRemote) {

		}
		return stack;
	}
	public void uploadEffects() {
		// TODO Auto-generated method stub

	}
	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setActive(boolean par) {
		// TODO Auto-generated method stub

	}
	@Override
	public void onJutsuUpdate() {
		// TODO Auto-generated method stub

	}

	public void consumeChackra(int value) {
		// TODO Auto-generated method stub

	}

}