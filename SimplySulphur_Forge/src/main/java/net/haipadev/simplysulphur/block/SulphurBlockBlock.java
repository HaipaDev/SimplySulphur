
package net.haipadev.simplysulphur.block;

import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.haipadev.simplysulphur.procedures.SulphurBlockWalkOnProcedure;
import net.haipadev.simplysulphur.procedures.SulphurBlockOnBlockHitByProjectileProcedure;
import net.haipadev.simplysulphur.procedures.SulphurBlockFlintAndSteelProcedure;
import net.haipadev.simplysulphur.procedures.SulphurBlockDestroyedByPlayerProcedure;
import net.haipadev.simplysulphur.procedures.SulphurBlockDestroyedByExplosionProcedure;

public class SulphurBlockBlock extends Block {
	public SulphurBlockBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.SHROOMLIGHT).strength(4f, 0f).requiresCorrectToolForDrops().noLootTable());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 25;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof PickaxeItem tieredItem)
			return tieredItem.getTier().getLevel() >= 2;
		return false;
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
		SulphurBlockWalkOnProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		SulphurBlockDestroyedByPlayerProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
		return retval;
	}

	@Override
	public void wasExploded(Level world, BlockPos pos, Explosion e) {
		super.wasExploded(world, pos, e);
		SulphurBlockDestroyedByExplosionProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		SulphurBlockWalkOnProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void onProjectileHit(Level world, BlockState blockstate, BlockHitResult hit, Projectile entity) {
		SulphurBlockOnBlockHitByProjectileProcedure.execute(world, hit.getBlockPos().getX(), hit.getBlockPos().getY(), hit.getBlockPos().getZ(), entity);
	}

	@Override
	public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
		super.use(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getLocation().x;
		double hitY = hit.getLocation().y;
		double hitZ = hit.getLocation().z;
		Direction direction = hit.getDirection();
		InteractionResult result = SulphurBlockFlintAndSteelProcedure.execute(world, x, y, z, entity);
		return result;
	}
}
