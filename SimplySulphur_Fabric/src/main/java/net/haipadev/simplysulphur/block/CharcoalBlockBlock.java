
package net.haipadev.simplysulphur.block;

import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.RenderType;

import net.haipadev.simplysulphur.init.SimplySulphurModBlocks;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.List;
import java.util.Collections;

public class CharcoalBlockBlock extends Block {
	public static BlockBehaviour.Properties PROPERTIES = BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().sound(SoundType.STONE).strength(1f, 6f).requiresCorrectToolForDrops();

	public CharcoalBlockBlock() {
		super(PROPERTIES);
		FlammableBlockRegistry.getDefaultInstance().add(this, 5, 0);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Environment(EnvType.CLIENT)
	public static void clientInit() {
		BlockRenderLayerMap.INSTANCE.putBlock(SimplySulphurModBlocks.CHARCOAL_BLOCK, RenderType.solid());
	}
}
