package pl.grm.narutocraftmod.jutsu;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Hirudora extends Jutsu {

	public Hirudora(int i) {
		this.setUnlocalizedName("Hirudora");
		this.setTextureName("narutocraftmod:Hirudora");
}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		if (!world.isRemote) {

		}
		return stack;
	}

}