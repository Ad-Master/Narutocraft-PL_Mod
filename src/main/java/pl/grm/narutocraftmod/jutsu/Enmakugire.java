package pl.grm.narutocraftmod.jutsu;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


public class Enmakugire extends Jutsu {

	public Enmakugire(int i) {
		this.setUnlocalizedName("Enmakugire");
		this.setTextureName("narutocraftmod: Enmakugire");
}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		if (!world.isRemote) {

		}
		return stack;
	}

}