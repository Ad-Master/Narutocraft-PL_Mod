package pl.grm.narutocraft.player;

/**
 * Other statistics than attributes like level of player, base level, etc.
 * <p>
 * When base value than its name = " ".
 */
public enum StatsSettings {
	ARMOR_BASE(" ", "armor_base", 4),
	ARMOR_MAX(" ", "armor_max", 80),
	CHAKRA_BASE(" ", "chakra_base", 50),
	CHAKRA_MAX(" ", "chakra_max", 10000),
	CHAKRA_REGEN_TICK("  ", "chakra_regentick", 1 / 2),
	DAMAGE_BASE(" ", "damage_base", 1),
	DAMAGE_MAX(" ", "damage_max", 1000),
	HP_BASE(" ", "hp_base", 10),
	HP_MAX("Max HP", "hp_max", 20000),
	HP_REGEN_TICK(" ", "hp_regen_tick", 1 / 2),
	LEVELUP_POINT(" ", "levelup_point", 5),
	NINJA_LEVEL_MAX("Max ", "ninja_level_max", 200),
	RESISTANCE_MAX("Max ", "resistance_max", 80);

	private String name;
	private int baseValue;
	private String sName;
	public static int chakraBase = 50;
	public static int maxChakraCap = 500;
	public static int ninjaXpLevelUpCap = 15;
	public static int skillPointsPerLevel = 5;

	private StatsSettings(String name, String sName, int baseValue) {
		this.name = name;
		this.sName = sName;
		this.baseValue = baseValue;
	}

	public String getName() {
		return name;
	}

	public int getBaseValue() {
		return baseValue;
	}

	public String getSName() {
		return sName;
	}
}
