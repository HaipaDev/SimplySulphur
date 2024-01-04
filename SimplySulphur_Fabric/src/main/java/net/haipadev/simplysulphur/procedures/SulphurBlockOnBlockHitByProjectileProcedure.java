package net.haipadev.simplysulphur.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class SulphurBlockOnBlockHitByProjectileProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LargeFireball || entity instanceof Arrow && entity.isOnFire()) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.BLOCK);
		}
	}
}
