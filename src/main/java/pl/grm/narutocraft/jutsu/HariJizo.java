package pl.grm.narutocraft.jutsu;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class HariJizo extends Jutsu {

	public HariJizo(int i) {
		this.setUnlocalizedName("HariJizo");
		this.setTextureName(jutsuLoc + "HariJizo");
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		if (!world.isRemote) {

		}
		return stack;
	}

}