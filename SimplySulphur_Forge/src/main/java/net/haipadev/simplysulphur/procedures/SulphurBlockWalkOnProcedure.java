package net.haipadev.simplysulphur.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class SulphurBlockWalkOnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == Blocks.MAGMA_BLOCK || (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == Blocks.MAGMA_BLOCK
				|| (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == Blocks.MAGMA_BLOCK || (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == Blocks.MAGMA_BLOCK
				|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == Blocks.MAGMA_BLOCK || (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == Blocks.MAGMA_BLOCK) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.BLOCK);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == Blocks.LAVA || (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == Blocks.LAVA
				|| (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == Blocks.LAVA || (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == Blocks.LAVA
				|| (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == Blocks.LAVA || (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == Blocks.LAVA) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 3, Level.ExplosionInteraction.BLOCK);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))).getBlock() == Blocks.FIRE && (new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x + 1, y + 0, z + 0))))) == Direction.WEST || (world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))).getBlock() == Blocks.FIRE && (new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(x - 1, y + 0, z + 0))))) == Direction.EAST || (world.getBlockState(BlockPos.containing(x + 0, y + 1, z + 0))).getBlock() == Blocks.FIRE
				|| (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == Blocks.FIRE || (world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))).getBlock() == Blocks.FIRE && (new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 1))))) == Direction.NORTH || (world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))).getBlock() == Blocks.FIRE && (new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(BlockPos.containing(x + 0, y + 0, z - 1))))) == Direction.SOUTH) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.BLOCK);
		}
	}
}
