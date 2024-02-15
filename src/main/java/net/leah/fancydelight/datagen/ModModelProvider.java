package net.leah.fancydelight.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.leah.fancydelight.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) { //generates the Block models and textures






    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) { //generates the item models
        itemModelGenerator.register(ModItems.ESTROGEN_WAFFLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.PRETZEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PULLA, Models.GENERATED);
        itemModelGenerator.register(ModItems.KATSU_CURRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUSHI, Models.GENERATED);
        itemModelGenerator.register(ModItems.UDON_NOODLES, Models.GENERATED);
        itemModelGenerator.register(ModItems.ICE_CREAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAVA_CAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLAM_CHOWDER, Models.GENERATED);
        itemModelGenerator.register(ModItems.WIDE_BREAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.ESTROGEN_BURGER, Models.GENERATED);




    }
}

