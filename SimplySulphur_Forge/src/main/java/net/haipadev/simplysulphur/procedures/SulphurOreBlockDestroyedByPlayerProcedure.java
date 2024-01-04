package net.haipadev.simplysulphur.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import net.haipadev.simplysulphur.init.SimplySulphurModItems;
import net.haipadev.simplysulphur.init.SimplySulphurModBlocks;

public class SulphurOreBlockDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("minecraft:pickaxes")))) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).isDamageableItem()) {
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					{
						ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
						if (_ist.hurt(1, RandomSource.create(), null)) {
							_ist.shrink(1);
							_ist.setDamageValue(0);
						}
					}
				}
			}
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem().isCorrectToolForDrops(SimplySulphurModBlocks.SULPHUR_ORE.get().defaultBlockState())) {
				if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(SimplySulphurModBlocks.SULPHUR_ORE.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.BLOCK_FORTUNE, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)) != 0) {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(SimplySulphurModItems.SULPHUR.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(SimplySulphurModItems.SULPHUR.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				} else {
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(SimplySulphurModItems.SULPHUR.get()));
						entityToSpawn.setPickUpDelay(10);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 1, Level.ExplosionInteraction.BLOCK);
			}
		} else {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 1, Level.ExplosionInteraction.BLOCK);
		}
	}
}
