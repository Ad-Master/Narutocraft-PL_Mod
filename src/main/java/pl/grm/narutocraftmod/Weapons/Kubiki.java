package pl.grm.narutocraftmod.Weapons;

import net.minecraft.item.ItemSword;

import pl.grm.narutocraftmod.NarutoCraftMod;
import pl.grm.narutocraftmod.Libs.Materials;

public class Kubiki extends ItemSword {
	public Kubiki(int i) {
		super(Materials.metalshinobi);

		this.setUnlocalizedName("Kubiki");
		this.setTextureName("narutocraftmod:Kubikiribocho");
		this.setCreativeTab(NarutoCraftMod.mTabNarutoCraftMod);

	}
}