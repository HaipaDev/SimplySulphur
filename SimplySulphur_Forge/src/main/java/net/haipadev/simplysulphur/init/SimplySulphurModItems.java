
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.haipadev.simplysulphur.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.haipadev.simplysulphur.item.SulphurItem;
import net.haipadev.simplysulphur.SimplySulphurMod;

public class SimplySulphurModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SimplySulphurMod.MODID);
	public static final RegistryObject<Item> SULPHUR_ORE = block(SimplySulphurModBlocks.SULPHUR_ORE);
	public static final RegistryObject<Item> SULPHUR = REGISTRY.register("sulphur", () -> new SulphurItem());
	public static final RegistryObject<Item> SULPHUR_BLOCK = block(SimplySulphurModBlocks.SULPHUR_BLOCK);
	public static final RegistryObject<Item> CHARCOAL_BLOCK = block(SimplySulphurModBlocks.CHARCOAL_BLOCK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
