package net.bluesapphy.stardewdelight.util;

import net.bluesapphy.stardewdelight.item.SDItemRegistry;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class SDLootTableModifiers {
    private static final Identifier OAK_LEAVES_ID =
            new Identifier("minecraft", "blocks/oak_leaves");
    private static final Identifier DARK_OAK_LEAVES_ID =
            new Identifier("minecraft", "blocks/dark_oak_leaves");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(OAK_LEAVES_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f)) // Drops 35% of the time
                        .with(ItemEntry.builder(SDItemRegistry.HAZELNUT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());

            }
            if(DARK_OAK_LEAVES_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f)) // Drops 35% of the time
                        .with(ItemEntry.builder(SDItemRegistry.HAZELNUT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 3.0f)).build());

                tableBuilder.pool(poolBuilder.build());

            }


        });
    }


}
