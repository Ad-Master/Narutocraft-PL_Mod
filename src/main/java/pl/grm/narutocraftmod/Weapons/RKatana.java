package pl.grm.narutocraftmod.Weapons;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import pl.grm.narutocraftmod.NarutoCraftMod;
import pl.grm.narutocraftmod.Blocks.Materials;

public class RKatana extends ItemSword {
	public static Item RyuuKatana;
	public static Object instance;
	
	public RKatana (int i) {
		super(Materials.stal);
		
		RyuuKatana = new ItemSword(Materials.stal);
		
		this.setUnlocalizedName("Ryuu Katana");
		this.setTextureName("narutocraftmod:RyuuKatana");
		this.setCreativeTab(NarutoCraftMod.mTabNarutoCraftMod);

	}
}