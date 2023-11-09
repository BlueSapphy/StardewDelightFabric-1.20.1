package net.bluesapphy.stardewdelight.world.feature;

import net.bluesapphy.stardewdelight.StardewDelight;
import net.bluesapphy.stardewdelight.block.SDBlockRegistry;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class SDConfiguredFeatures {

    public static RegistryKey<ConfiguredFeature<?, ?>> WILD_PARSNIP = registerConfiguredKey("wild_parsnip");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        var placedFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.PLACED_FEATURE);


        register(context, WILD_PARSNIP, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(SDBlockRegistry.WILD_PARSNIP)))));

    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerConfiguredKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(StardewDelight.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
