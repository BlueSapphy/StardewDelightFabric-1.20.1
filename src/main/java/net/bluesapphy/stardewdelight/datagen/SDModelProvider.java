package net.bluesapphy.stardewdelight.datagen;

import net.bluesapphy.stardewdelight.block.ParsnipCropBlock;
import net.bluesapphy.stardewdelight.block.SDBlockRegistry;
import net.bluesapphy.stardewdelight.item.SDItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class SDModelProvider extends FabricModelProvider {


    public SDModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCrop(SDBlockRegistry.PARSNIP_CROP, ParsnipCropBlock.AGE, 0, 1, 2, 3);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(SDItemRegistry.HAZELNUT, Models.GENERATED);
        itemModelGenerator.register(SDItemRegistry.PARSNIP, Models.GENERATED);
        itemModelGenerator.register(SDItemRegistry.PARSNIP_SEEDS, Models.GENERATED);

    }
}
