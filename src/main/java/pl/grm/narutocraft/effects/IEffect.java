package pl.grm.narutocraft.effects;

import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;

/**
 * Interface of all effects
 */
public interface IEffect {
	public int ID = 0;
	public int duration = 0;
	public int amplifier = 0;
	public boolean ended = false;
	List<ItemStack> curativeItems = null;

	public abstract PotionEffect getEffect();
	public int getID();
	public int getDuration();
	public int getAmplifier();
	public List<ItemStack> getCurativeItems();
	public abstract void action();
	public abstract void startEffect();
	public abstract void endEffect();
	public abstract void onEffectUpdate();
	public abstract boolean isEnded();
}
