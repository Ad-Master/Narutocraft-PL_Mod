package pl.grmdev.narutocraft.libs;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import pl.grmdev.narutocraft.items.weapons.projectiles.entities.EntityExplodeKunai;
import pl.grmdev.narutocraft.items.weapons.projectiles.entities.EntityKunai;
import pl.grmdev.narutocraft.items.weapons.projectiles.entities.EntitySenbon;
import pl.grmdev.narutocraft.items.weapons.projectiles.entities.EntityShuriken;

public class DamSource extends DamageSource {

	public DamSource(String par1Str) {
		super(par1Str);
	}

	public static DamageSource causeKunaiDamage(EntityKunai entityKunai, Entity shootingEntity) {
		return (new EntityDamageSourceIndirect("kunai", entityKunai, shootingEntity)).setProjectile();
	}

	public static DamageSource causeSenbonDamage(EntitySenbon entitySenbon, Entity shootingEntity) {
		return (new EntityDamageSourceIndirect("senbon", entitySenbon, shootingEntity)).setProjectile();
	}

	public static DamageSource causeShurikenDamage(EntityShuriken entityShuriken, Entity shootingEntity) {
		return (new EntityDamageSourceIndirect("shuriken", entityShuriken, shootingEntity)).setProjectile();
	}

	public static DamageSource causeWKunaiDamage(EntityExplodeKunai entityWKunai, Entity shootingEntity) {
		return (new EntityDamageSourceIndirect("wkunai", entityWKunai, shootingEntity)).setProjectile();
	}

}
