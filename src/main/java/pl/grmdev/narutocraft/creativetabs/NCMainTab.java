package pl.grmdev.narutocraft.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import pl.grmdev.narutocraft.jutsu.JutsuParams;
import pl.grmdev.narutocraft.player.ExtendedProperties;

/**
 * Create Creative Tab
 */
public class NCMainTab extends CreativeTabs {

	private int iconJutsuID = JutsuParams.SHARINGAN.getJutsuID();

	/**
	 * @param id
	 *            Creative Tab Id
	 * @param unlocalizedName
	 *            Tab Name
	 */
	public NCMainTab(int id, String unlocalizedName) {
		super(id, unlocalizedName);
	}

	@Override
	public Item getTabIconItem() {
		if (ExtendedProperties.jutsuList.containsKey(iconJutsuID)) {
			Item item = (Item) ExtendedProperties.jutsuList.get(iconJutsuID);
			return item;
		}
		return Items.apple;
	}

	@Override
	public String getTranslatedTabLabel() {
		return "NarutoCraft";
	}
}