package pl.grm.narutocraftmod.Libs.Registry;

import cpw.mods.fml.common.registry.EntityRegistry;
import pl.grm.narutocraftmod.NarutoCraftMod;
import pl.grm.narutocraftmod.Entities.EntityKunai;
import pl.grm.narutocraftmod.Entities.EntitySenbon;
import pl.grm.narutocraftmod.Entities.EntityWKunai;
import pl.grm.narutocraftmod.Mobs.Bijuu.EntityKyuubi;

public class RegEntities extends NarutoCraftMod {
	public static void RegEntitiesList() {
    	int id =0;
    	EntityRegistry.registerModEntity(EntityKunai.class, "Kunai", id, NarutoCraftMod.instance, 80, 1, true); id++;
    	EntityRegistry.registerModEntity(EntityWKunai.class, "WKunai", id, NarutoCraftMod.instance, 80, 1, true); id++;
    	EntityRegistry.registerModEntity(EntitySenbon.class, "Senbon", id, NarutoCraftMod.instance, 80, 1, true); id++;
    	
    	EntityRegistry.registerModEntity(EntityKyuubi.class, "Kyuubi", id, NarutoCraftMod.instance, 80, 1, true); id++;
    	//EntityRegistry.addSpawn(EntityKyuubi.class, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.biomeList);//change the values to vary the spawn rarity, biome, etc.              
    	
	}
}
