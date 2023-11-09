package net.bluesapphy.stardewdelight.item;

import net.bluesapphy.stardewdelight.StardewDelight;
import net.bluesapphy.stardewdelight.block.SDBlockRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class SDItemGroup {

    public static final ItemGroup STARDEW_DELIGHT = Registry.register(Registries.ITEM_GROUP,
            new Identifier(StardewDelight.MOD_ID,"hazelnut"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.hazelnut"))
                    .icon(()-> new ItemStack(SDItemRegistry.HAZELNUT)).entries((displayContext, entries) -> {
                     entries.add(SDItemRegistry.HAZELNUT);
                     entries.add(SDItemRegistry.PARSNIP);
                     entries.add(SDItemRegistry.PARSNIP_SEEDS);


                     entries.add(SDBlockRegistry.HAZELNUT_BAG);
                     entries.add(SDBlockRegistry.WILD_PARSNIP);

                    }).build());
    public static void registerItemGroups(){
        StardewDelight.LOGGER.info("Registering Item Groups for "+ StardewDelight.MOD_ID);
    }
}
