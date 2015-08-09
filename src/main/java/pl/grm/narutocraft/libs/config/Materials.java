package pl.grm.narutocraft.libs.config;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Materials to items and armors in mod.
 */
public class Materials {// TODO null ->texture name in armor materials

	// ("name",harvest level [0-3], number of uses [diamond 1561], strength
	// against blocks [8.0F], Strength entities [3.0F+4], enchantment [10])
	public static Item.ToolMaterial stal = EnumHelper.addToolMaterial("STAL", 1, 400, 4F, 0F, 2);
	public static Item.ToolMaterial stal2 = EnumHelper.addToolMaterial("STAL2", 1, 500, 4F, -1F, 2);
	public static Item.ToolMaterial stal3 = EnumHelper.addToolMaterial("STAL3", 1, 800, 4F, 0F, 2);
	public static Item.ToolMaterial stal4 = EnumHelper.addToolMaterial("STAL4", 1, 500, 4F, 0F, 2);
	public static Item.ToolMaterial stal5 = EnumHelper.addToolMaterial("STAL5",1, 9999, 4F, 0F, 2);
	public static Item.ToolMaterial stal6 = EnumHelper.addToolMaterial("STAL6", 1, 3000, 4F, 1F, 2);
	public static Item.ToolMaterial tytan = EnumHelper.addToolMaterial("TYTAN", 1, 300, 4F, 1F, 2);
	public static Item.ToolMaterial tytan2 = EnumHelper.addToolMaterial("TYTAN2", 1, 850, 4F, 1.5F, 2);
	public static Item.ToolMaterial tytan3 = EnumHelper.addToolMaterial("TYTAN3", 1, 350, 4F, 2F, 2);
	public static Item.ToolMaterial tytan4 = EnumHelper.addToolMaterial("TYTAN4", 1, 500, 4F, 2F, 2);
	public static Item.ToolMaterial tytan5 = EnumHelper.addToolMaterial("TYTAN5", 1, 250, 4F, 4F, 2);
	public static Item.ToolMaterial tytan6 = EnumHelper.addToolMaterial("TYTAN6", 1, 600, 4F, 3F, 2);
	public static Item.ToolMaterial smoczastal = EnumHelper.addToolMaterial("SMOCZASTAL", 1, 1500, 4F, 3.5F, 2);
	public static Item.ToolMaterial smoczastal2 = EnumHelper.addToolMaterial("SMOCZASTAL2", 1, 500, 4F, 4F, 2);
	public static Item.ToolMaterial smoczastal3 = EnumHelper.addToolMaterial("SMOCZASTAL3", 1, 1000, 4F, 5F, 2);
	public static Item.ToolMaterial smoczastal4 = EnumHelper.addToolMaterial("SMOCZASTAL4", 1, 750, 4F, 6F, 2);
	public static Item.ToolMaterial metalshinobi = EnumHelper.addToolMaterial("METALSHINOBI", 1, 9999, 4F, 6F, 2);
	public static Item.ToolMaterial metalshinobi2 = EnumHelper.addToolMaterial("METALSHINOBI2", 1, 1600, 4F, 7F, 2);
	public static Item.ToolMaterial metalshinobi3 = EnumHelper.addToolMaterial("METALSHINOBI3", 1, 2000, 4F, 8F, 2);
	public static Item.ToolMaterial metalshinobi4 = EnumHelper.addToolMaterial("METALSHINOBI4", 1, 9999, 4F, 7F, 2);
	public static Item.ToolMaterial metalshinobi5 = EnumHelper.addToolMaterial("METALSHINOBI5", 1, 9999, 4F, 5F, 2);
	public static Item.ToolMaterial metalshinobi6 = EnumHelper.addToolMaterial("METALSHINOBI6", 1, 9999, 4F, 4F, 2);
	public static Item.ToolMaterial metalsamurajow = EnumHelper.addToolMaterial("METALSAMURAJOW", 1, 9999, 4F, 11F, 2);
	public static Item.ToolMaterial kamien = EnumHelper.addToolMaterial("KAMIEN", 1, 2500, 4F, 9F, 2);

	public static ArmorMaterial armorBUSHIDO = EnumHelper.addArmorMaterial("armorBUSHIDO", "narutocraft:textures/models/armors/BushidoArmor_layer_1.png", 33, new int[]{5, 12, 9, 5},
			15);
	public static ArmorMaterial armorANBU = EnumHelper.addArmorMaterial("armorANBU", "narutocraft:textures/models/armors/AnbuArmor_layer_1.png", 40, new int[]{6, 12, 9, 5}, 10);
	public static ArmorMaterial armorKIRI = EnumHelper.addArmorMaterial("armorKIRI","narutocraft:textures/models/armors/KiriArmor_layer_1.png" , 45, new int[]{3, 8, 6, 3}, 10);
	public static ArmorMaterial armorSUNA = EnumHelper.addArmorMaterial("armorSUNA", "narutocraft:textures/models/armors/SunaArmor_layer_1.png", 46, new int[]{3, 8, 6, 3}, 10);
	public static ArmorMaterial armorAKATSUKI = EnumHelper.addArmorMaterial("armorAKATSUKI", "narutocraft:textures/models/armors/AkatsukiaArmor1_layer_1.png", 47,
			new int[]{8, 20, 15, 8}, 10);
	public static ArmorMaterial armorIWA = EnumHelper.addArmorMaterial("armorIWA", "narutocraft:textures/models/armors/IwaArmor_layer_1.png", 48, new int[]{3, 8, 6, 3}, 10);
	public static ArmorMaterial armorKONOHA = EnumHelper
			.addArmorMaterial("KONOHA", null, 48, new int[]{3, 8, 6, 3}, 10);
	public static ArmorMaterial armorOTO = EnumHelper.addArmorMaterial("armorOTO", "narutocraft:textures/models/armors/OtoArmor_layer_1.png", 48, new int[]{3, 8, 6, 3}, 10);
	public static ArmorMaterial armorOLD = EnumHelper.addArmorMaterial("armorOLD","narutocraft:textures/models/armors/OldArmor_layer_1.png" , 48, new int[]{11, 28, 21, 11}, 10);
	public static ArmorMaterial armorKUMO = EnumHelper.addArmorMaterial("armorKUMO", "narutocraft:textures/models/armors/KumoArmor_layer_1.png", 48, new int[]{3, 8, 6, 3}, 10);
	public static ArmorMaterial armorRYUU = EnumHelper.addArmorMaterial("armorRYUU", "narutocraft:textures/models/armors/RyuArmor_layer_1.png", 48, new int[]{5, 12, 9, 5}, 10);

}
