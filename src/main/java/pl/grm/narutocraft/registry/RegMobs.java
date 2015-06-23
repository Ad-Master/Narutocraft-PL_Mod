package pl.grm.narutocraft.registry;

import java.util.logging.Logger;

import net.minecraftforge.fml.common.registry.EntityRegistry;
import pl.grm.narutocraft.NarutoCraft;
import pl.grm.narutocraft.libs.config.References;
import pl.grm.narutocraft.mobs.bijuu.EntityKyuubi;

public class RegMobs extends NarutoCraft {

	public static void regMobsList() {
		Logger logger = Logger.getLogger(References.MODID);
		// EntityRegistry.registerGlobalEntityID(Entity.class, "Entity", 1);
		boolean finished = false;
		int id = 0;
		do {
			try {
				EntityRegistry.registerGlobalEntityID(EntityKyuubi.class, "EntityKyuubi", id, 2, 2);
				finished = true;
			}
			catch (IllegalArgumentException e) {
				logger.warning(e.getMessage());
				id++;
				if (id > 255) {
					finished = true;
				}
			}
		}
		while (!finished);
	}
}
