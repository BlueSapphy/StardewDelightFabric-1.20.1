package net.bluesapphy.stardewdelight.item;

import net.bluesapphy.stardewdelight.StardewDelight;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemRegistry {

    public static final Item HAZELNUT = registerItem("hazelnut", new Item(new FabricItemSettings().food(FoodComponents.HAZELNUT)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(StardewDelight.MOD_ID, name), item);

        }

    public static void registerItemRegistry() {
        StardewDelight.LOGGER.info("Registering Items for" + StardewDelight.MOD_ID);


    }
}
