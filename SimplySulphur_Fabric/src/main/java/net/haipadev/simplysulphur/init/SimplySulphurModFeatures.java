
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.haipadev.simplysulphur.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.haipadev.simplysulphur.world.features.ores.SulphurOreFeature;
import net.haipadev.simplysulphur.SimplySulphurMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class SimplySulphurModFeatures {
	public static void load() {
		register("sulphur_ore", new SulphurOreFeature(), SulphurOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(BuiltInRegistries.FEATURE, new ResourceLocation(SimplySulphurMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(SimplySulphurMod.MODID, registryName)));
	}
}
