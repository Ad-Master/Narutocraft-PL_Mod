package pl.grm.narutocraftmod.Weapons;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import pl.grm.narutocraftmod.NarutoCraftMod;
import pl.grm.narutocraftmod.Libs.Materials;

public class KBushido extends ItemSword {
	public KBushido (int i) {
		super(Materials.tytan2);

		this.setUnlocalizedName("KBushido");
		this.setTextureName("narutocraftmod:Katana Bushido");
		this.setCreativeTab(NarutoCraftMod.mTabNarutoCraftMod);

	}
}