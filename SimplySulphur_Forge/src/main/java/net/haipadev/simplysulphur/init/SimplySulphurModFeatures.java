
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.haipadev.simplysulphur.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.haipadev.simplysulphur.world.features.ores.SulphurOreFeature;
import net.haipadev.simplysulphur.SimplySulphurMod;

@Mod.EventBusSubscriber
public class SimplySulphurModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SimplySulphurMod.MODID);
	public static final RegistryObject<Feature<?>> SULPHUR_ORE = REGISTRY.register("sulphur_ore", SulphurOreFeature::new);
}
