package pl.grm.narutocraftmod.Powers;

import net.minecraft.item.Item;
import pl.grm.narutocraftmod.NarutoCraftMod;

public class Issen extends Item {

	public Issen(int i) {
		this.setUnlocalizedName("Issen");
		this.setTextureName("narutocraftmod:NoJutsu");
		this.setCreativeTab(NarutoCraftMod.mTabNarutoCraftMod);
		maxStackSize = 64;
	}

}