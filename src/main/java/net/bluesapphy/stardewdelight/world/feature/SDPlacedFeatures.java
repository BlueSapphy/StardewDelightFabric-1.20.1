package net.bluesapphy.stardewdelight.world.feature;

import net.bluesapphy.stardewdelight.StardewDelight;
import net.bluesapphy.stardewdelight.block.SDBlockRegistry;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.List;

public class SDPlacedFeatures {

    public static RegistryKey<PlacedFeature> WILD_PARSNIP_PLACED = registerPlacedKey("wild_parsnip_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, WILD_PARSNIP_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(SDConfiguredFeatures.WILD_PARSNIP),
                RarityFilterPlacementModifier.of(12), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());


    }



    public static RegistryKey<PlacedFeature> registerPlacedKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(StardewDelight.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
