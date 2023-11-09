package net.bluesapphy.stardewdelight.block;

import com.nhoryzon.mc.farmersdelight.block.WildCropBlock;
import com.nhoryzon.mc.farmersdelight.block.WildPatchBlock;
import net.bluesapphy.stardewdelight.StardewDelight;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class SDBlockRegistry {
    public static final Block HAZELNUT_BAG = registerBlock("hazelnut_bag",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL)));
    public static final Block PARSNIP_CROP = Registry.register(Registries.BLOCK, new Identifier(StardewDelight.MOD_ID,"parsnip_crop"),
            new ParsnipCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block WILD_PARSNIP = Registry.register(Registries.BLOCK, new Identifier(StardewDelight.MOD_ID,"wild_parsnip"),
            new WildPatchBlock());





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(StardewDelight.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(StardewDelight.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));

    }

    public static void registerSDBlockRegistry() {
        StardewDelight.LOGGER.info("Registering ModBlocks for" + StardewDelight.MOD_ID);
    }

}