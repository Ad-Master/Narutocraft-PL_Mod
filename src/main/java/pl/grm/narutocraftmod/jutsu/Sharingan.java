package pl.grm.narutocraftmod.jutsu;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Sharingan extends Jutsu {

	public Sharingan(int i) {
		super();
		this.setUnlocalizedName("Sharingan");
		this.setTextureName("narutocraftmod:Sharingan");
	}

	@Override
	public int getMaxItemUseDuration(ItemStack stack) {
		return 1;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		if (!world.isRemote) {

		}
		return stack;
	}

}
