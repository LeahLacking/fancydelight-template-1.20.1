package net.leah.fancydelight.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.leah.fancydelight.FancyDelight;
import net.leah.fancydelight.block.custom.ChocolateLavaCakeBlock;
import net.leah.fancydelight.block.custom.UdonNoodlesBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block UDON_NOODLES_BLOCK = registerBlock("udon_noodles_block",
            new UdonNoodlesBlock(FabricBlockSettings.copyOf(Blocks.CAKE).nonOpaque()));
    public static final Block CHOCOLATE_LAVA_CAKE_BLOCK = registerBlock("chocolate_lava_cake_block",
            new ChocolateLavaCakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE).nonOpaque()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FancyDelight.MOD_ID, name), block);
    }
    private static Item registerBlockItem (String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FancyDelight.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));


    }

    public static void registerModBlock() {
        FancyDelight.LOGGER.info("Registering ModBlocks for "+ FancyDelight.MOD_ID);
    }
}


