
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.haipadev.simplysulphur.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.haipadev.simplysulphur.block.SulphurOreBlock;
import net.haipadev.simplysulphur.block.SulphurBlockBlock;
import net.haipadev.simplysulphur.block.CharcoalBlockBlock;
import net.haipadev.simplysulphur.SimplySulphurMod;

public class SimplySulphurModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SimplySulphurMod.MODID);
	public static final RegistryObject<Block> SULPHUR_ORE = REGISTRY.register("sulphur_ore", () -> new SulphurOreBlock());
	public static final RegistryObject<Block> SULPHUR_BLOCK = REGISTRY.register("sulphur_block", () -> new SulphurBlockBlock());
	public static final RegistryObject<Block> CHARCOAL_BLOCK = REGISTRY.register("charcoal_block", () -> new CharcoalBlockBlock());
}
