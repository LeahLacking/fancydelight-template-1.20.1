package net.leah.fancydelight;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.leah.fancydelight.block.ModBlocks;
import net.leah.fancydelight.item.ModItemGroups;
import net.leah.fancydelight.item.ModItems;
import net.minecraft.client.render.RenderLayer;

public class FancyDelightClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        ModBlocks.registerModBlock();
        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.UDON_NOODLES_BLOCK, RenderLayer.getCutout());
    }
}
