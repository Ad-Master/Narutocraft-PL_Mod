package pl.grm.narutocraftmod.jutsu;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Hadan extends Jutsu {

	public Hadan(int i) {
		this.setUnlocalizedName("Hadan");
		this.setTextureName(jutsuLoc + "Hadan");
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		if (!world.isRemote) {

		}
		return stack;
	}

}