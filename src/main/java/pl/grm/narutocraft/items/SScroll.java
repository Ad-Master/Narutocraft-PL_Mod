package pl.grm.narutocraft.items;

import net.minecraft.item.Item;
import pl.grm.narutocraft.NarutoCraft;
import pl.grm.narutocraft.libs.References;

public class SScroll extends Item {
	
	public SScroll() {
		this.setUnlocalizedName("SZwoj");
		this.setTextureName(References.ModTexturePath + "Zwoj Suiton");
		this.setCreativeTab(NarutoCraft.mTabNarutoCraft);
		this.maxStackSize = 64;
	}
	
}
