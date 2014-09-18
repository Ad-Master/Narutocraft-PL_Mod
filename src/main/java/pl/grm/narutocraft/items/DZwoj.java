package pl.grm.narutocraft.items;

import net.minecraft.item.Item;
import pl.grm.narutocraft.NarutoCraft;
import pl.grm.narutocraft.libs.References;

public class DZwoj extends Item {

	public DZwoj() {
		this.setUnlocalizedName("DZwoj");
		this.setTextureName(References.ModTexturePath + "Zwoj Doton");
		this.setCreativeTab(NarutoCraft.mTabNarutoCraft);
		this.maxStackSize = 64;
	}

}
