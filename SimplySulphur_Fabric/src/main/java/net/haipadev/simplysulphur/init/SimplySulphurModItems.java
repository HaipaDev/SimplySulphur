/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.haipadev.simplysulphur.init;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.haipadev.simplysulphur.item.SulphurItem;
import net.haipadev.simplysulphur.SimplySulphurMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class SimplySulphurModItems {
	public static Item SULPHUR_ORE;
	public static Item SULPHUR;
	public static Item SULPHUR_BLOCK;
	public static Item CHARCOAL_BLOCK;

	public static void load() {
		SULPHUR_ORE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SimplySulphurMod.MODID, "sulphur_ore"), new BlockItem(SimplySulphurModBlocks.SULPHUR_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(content -> content.accept(SULPHUR_ORE));
		SULPHUR = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SimplySulphurMod.MODID, "sulphur"), new SulphurItem());
		SULPHUR_BLOCK = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SimplySulphurMod.MODID, "sulphur_block"), new BlockItem(SimplySulphurModBlocks.SULPHUR_BLOCK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(SULPHUR_BLOCK));
		CHARCOAL_BLOCK = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SimplySulphurMod.MODID, "charcoal_block"), new BlockItem(SimplySulphurModBlocks.CHARCOAL_BLOCK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(content -> content.accept(CHARCOAL_BLOCK));
	}

	public static void clientLoad() {
	}
}
