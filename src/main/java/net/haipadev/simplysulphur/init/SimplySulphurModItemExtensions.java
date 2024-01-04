
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.haipadev.simplysulphur.init;

import net.fabricmc.fabric.api.registry.FuelRegistry;

public class SimplySulphurModItemExtensions {
	public static void load() {
		FuelRegistry.INSTANCE.add(SimplySulphurModBlocks.CHARCOAL_BLOCK.asItem(), 16200);
		FuelRegistry.INSTANCE.add(SimplySulphurModItems.SULPHUR, 3000);
		FuelRegistry.INSTANCE.add(SimplySulphurModBlocks.SULPHUR_BLOCK.asItem(), 3200);
	}
}
