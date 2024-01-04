
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.haipadev.simplysulphur.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.haipadev.simplysulphur.SimplySulphurMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SimplySulphurModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SimplySulphurMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(SimplySulphurModBlocks.SULPHUR_BLOCK.get().asItem());
			tabData.accept(SimplySulphurModBlocks.CHARCOAL_BLOCK.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(SimplySulphurModItems.SULPHUR.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(SimplySulphurModBlocks.SULPHUR_ORE.get().asItem());
		}
	}
}
