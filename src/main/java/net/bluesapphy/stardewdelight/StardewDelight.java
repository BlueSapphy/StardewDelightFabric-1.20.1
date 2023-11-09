package net.bluesapphy.stardewdelight;

import net.bluesapphy.stardewdelight.block.SDBlockRegistry;
import net.bluesapphy.stardewdelight.item.SDItemGroup;
import net.bluesapphy.stardewdelight.item.SDItemRegistry;
import net.bluesapphy.stardewdelight.util.SDLootTableModifiers;
import net.bluesapphy.stardewdelight.world.SDFeatureGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StardewDelight implements ModInitializer {
	public static final String MOD_ID = "stardewdelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		SDItemGroup.registerItemGroups();

		SDItemRegistry.registerItemRegistry();
		SDBlockRegistry.registerSDBlockRegistry();
		SDLootTableModifiers.modifyLootTables();
		SDFeatureGeneration.generateFeature();

	}
}