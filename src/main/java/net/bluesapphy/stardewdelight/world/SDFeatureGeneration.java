package net.bluesapphy.stardewdelight.world;

import net.bluesapphy.stardewdelight.world.feature.SDPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class SDFeatureGeneration {

    public static void generateFeature() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, SDPlacedFeatures.WILD_PARSNIP_PLACED);

    }


    private static void generatePlantTemp(int lessTemp, int greatTemp, RegistryKey<PlacedFeature> feature) {
        BiomeModifications.addFeature((context) -> context.getBiome().getTemperature() < lessTemp && context.getBiome().getTemperature() > greatTemp,
                GenerationStep.Feature.VEGETAL_DECORATION, feature);
    }
}
