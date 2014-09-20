package pl.grm.narutocraft.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import pl.grm.narutocraft.NarutoCraft;
import pl.grm.narutocraft.items.DScroll;
import pl.grm.narutocraft.items.FScroll;
import pl.grm.narutocraft.items.KScroll;
import pl.grm.narutocraft.items.NScroll;
import pl.grm.narutocraft.items.RScroll;
import pl.grm.narutocraft.items.SScroll;
import pl.grm.narutocraft.libs.Materials;
import cpw.mods.fml.common.registry.GameRegistry;

public class RegItems extends NarutoCraft {
	/** Zwoj - scroll **/
	public static Item			FZwoj		= new FScroll();
	
	public static Item			KZwoj		= new KScroll();
	
	public static Item			DZwoj		= new DScroll();
	public static Item			SZwoj		= new SScroll();
	public static Item			RZwoj		= new RScroll();
	public static Item			NZwoj		= new NScroll();
	
	public static ArmorMaterial	Bushido		= Materials.armorBUSHIDO;
	public static ArmorMaterial	Anbu		= Materials.armorANBU;
	public static ArmorMaterial	Kiri		= Materials.armorKIRI;
	public static ArmorMaterial	Suna		= Materials.armorSUNA;
	public static ArmorMaterial	Akatsuki	= Materials.armorAKATSUKI;
	
	// public static int renderBushidoArmor = proxy.addArmor("Bushido");
	// public static Item = new (id+);
	
	public static void registerItem(Item item, String name) {
		GameRegistry.registerItem(item, name);
	}
	
	public static void regItemsList() {
		
		// registerItem(, "");
		registerItem(FZwoj, "FZwoj");
		registerItem(KZwoj, "KZwoj");
		registerItem(DZwoj, "DZwoj");
		registerItem(SZwoj, "SZwoj");
		registerItem(RZwoj, "RZwoj");
		registerItem(NZwoj, "NZwoj");
		// registerItem(, "");
	}
}
