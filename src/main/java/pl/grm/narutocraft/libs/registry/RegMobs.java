package pl.grm.narutocraft.libs.registry;

import pl.grm.narutocraft.NarutoCraftMod;
import pl.grm.narutocraft.mobs.bijuu.EntityKyuubi;
import cpw.mods.fml.common.registry.EntityRegistry;

public class RegMobs extends NarutoCraftMod {
	public static void RegMobsList() {
		//EntityRegistry.registerGlobalEntityID(Entity.class, "Entity", 1);
    	EntityRegistry.registerGlobalEntityID(EntityKyuubi.class, "EntityKyuubi", 4809, 2, 2);
	}
}
