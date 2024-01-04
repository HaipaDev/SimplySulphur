
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.haipadev.simplysulphur.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.haipadev.simplysulphur.block.SulphurOreBlock;
import net.haipadev.simplysulphur.block.SulphurBlockBlock;
import net.haipadev.simplysulphur.block.CharcoalBlockBlock;
import net.haipadev.simplysulphur.SimplySulphurMod;

public class SimplySulphurModBlocks {
	public static Block SULPHUR_ORE;
	public static Block SULPHUR_BLOCK;
	public static Block CHARCOAL_BLOCK;

	public static void load() {
		SULPHUR_ORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SimplySulphurMod.MODID, "sulphur_ore"), new SulphurOreBlock());
		SULPHUR_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SimplySulphurMod.MODID, "sulphur_block"), new SulphurBlockBlock());
		CHARCOAL_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(SimplySulphurMod.MODID, "charcoal_block"), new CharcoalBlockBlock());
	}

	public static void clientLoad() {
		SulphurOreBlock.clientInit();
		SulphurBlockBlock.clientInit();
		CharcoalBlockBlock.clientInit();
	}
}
