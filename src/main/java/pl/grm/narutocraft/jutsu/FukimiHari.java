package pl.grm.narutocraft.jutsu;

import java.util.Map;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import pl.grm.narutocraft.effects.IEffect;

public class FukimiHari extends Jutsu implements IJutsu {

	public FukimiHari() {
		this.setUnlocalizedName("Fukimi Hari");
		this.setTextureName(jutsuLoc + "Fukimi Hari");
	}
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world,
			EntityPlayer player) {
		if (!world.isRemote) {

		}
		return stack;
	}
	@Override
	public void uploadEffects() {
		// TODO Auto-generated method stub

	}
	@Override
	public Map<IJutsu, IEffect> getEffects() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setEffect(IEffect effect) {
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
	@Override
	public void consumeChackra(int value) {
		// TODO Auto-generated method stub

	}

}
