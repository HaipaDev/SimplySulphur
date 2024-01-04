
package net.haipadev.simplysulphur.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SulphurItem extends Item {
	public SulphurItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
