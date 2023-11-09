package net.bluesapphy.stardewdelight;

import net.bluesapphy.stardewdelight.block.SDBlockRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class StardewDelightClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(SDBlockRegistry.PARSNIP_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SDBlockRegistry.WILD_PARSNIP, RenderLayer.getCutout());
    }
}
