package net.haipadev.simplysulphur.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.util.RandomSource;
import net.minecraft.core.BlockPos;

import net.haipadev.simplysulphur.init.SimplySulphurModBlocks;

public class SulphurFlintandsteelProcedure {
	public static InteractionResult execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return InteractionResult.PASS;
		double portalX = 0;
		double portalY = 0;
		double portalZ = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SimplySulphurModBlocks.SULPHUR_ORE.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.FLINT_AND_STEEL) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 1, Level.ExplosionInteraction.BLOCK);
				return InteractionResult.SUCCESS;
			}
		}
		return InteractionResult.PASS;
	}
}
