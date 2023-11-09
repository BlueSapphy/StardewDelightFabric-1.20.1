package net.bluesapphy.stardewdelight.datagen;

import net.bluesapphy.stardewdelight.block.ParsnipCropBlock;
import net.bluesapphy.stardewdelight.block.SDBlockRegistry;
import net.bluesapphy.stardewdelight.item.SDItemRegistry;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class SDLootTableProvider extends FabricBlockLootTableProvider {
    protected SDLootTableProvider (FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(SDBlockRegistry.HAZELNUT_BAG);


        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(SDBlockRegistry.PARSNIP_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(ParsnipCropBlock.AGE, 3));
        addDrop(SDBlockRegistry.PARSNIP_CROP, cropDrops(SDBlockRegistry.PARSNIP_CROP, SDItemRegistry.PARSNIP, SDItemRegistry.PARSNIP_SEEDS, builder));

    }
}
