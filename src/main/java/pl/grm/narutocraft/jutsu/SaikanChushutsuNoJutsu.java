package pl.grm.narutocraft.jutsu;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SaikanChushutsuNoJutsu extends Jutsu {

	public SaikanChushutsuNoJutsu(int i) {
		this.setUnlocalizedName("Saikan Chushutsu No Jutsu");
		this.setTextureName(jutsuLoc + "Saikan Chushutsu No Jutsu");
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		if (!world.isRemote) {

		}
		return stack;
	}

}