package net.leah.fancydelight.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.leah.fancydelight.FancyDelight;
import net.leah.fancydelight.block.ModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ESTROGEN_WAFFLE = registerItem("estrogen_waffle",
            new Item(new FabricItemSettings().food(ModFoodComponents.ESTROGEN_WAFFLE)));
    public static final Item UDON_NOODLES = registerItem("udon_noodles",
            new BlockItem(ModBlocks.UDON_NOODLES_BLOCK, new FabricItemSettings().food(ModFoodComponents.UDON_NOODLES)));
    public static final Item KATSU_CURRY = registerItem("katsu_curry",
            new Item(new FabricItemSettings().food(ModFoodComponents.KATSU_CURRY)));
    public static final Item PRETZEL = registerItem("pretzel",
            new Item(new FabricItemSettings().food(ModFoodComponents.PRETZEL)));
    public static final Item SUSHI = registerItem("sushi",
            new Item(new FabricItemSettings().food(ModFoodComponents.SUSHI)));
    public static final Item PULLA = registerItem("pulla",
            new Item(new FabricItemSettings().food(ModFoodComponents.PULLA)));
    public static final Item WIDE_BREAD = registerItem("wide_bread",
            new Item(new FabricItemSettings().food(ModFoodComponents.PULLA)));
    public static final Item CLAM_CHOWDER = registerItem("clam_chowder",
            new Item(new FabricItemSettings().food(ModFoodComponents.PULLA)));
    public static final Item ICE_CREAM = registerItem("ice_cream",
            new Item(new FabricItemSettings().food(ModFoodComponents.PULLA)));
    public static final Item CHOCOLATE_LAVA_CAKE = registerItem("chocolate_lava_cake",
            new BlockItem(ModBlocks.CHOCOLATE_LAVA_CAKE_BLOCK,new FabricItemSettings()));
    public static final Item ESTROGEN_BURGER = registerItem("estrogen_burger",
            new Item(new FabricItemSettings().food(ModFoodComponents.PULLA)));

    public static final Item PESTO_PASTA = registerItem("pesto_pasta",
            new Item(new FabricItemSettings().food(ModFoodComponents.PULLA)));

    public static final Item CHOCOLATE_BAR = registerItem("chocolate_bar",
            new Item(new FabricItemSettings().food(ModFoodComponents.PULLA)));

    public static final Item RICE_PUDDING = registerItem("rice_pudding",
            new Item(new FabricItemSettings().food(ModFoodComponents.PULLA)));

    public static final Item FRIED_RICE = registerItem("fried_rice",
            new Item(new FabricItemSettings().food(ModFoodComponents.PULLA)));

    public static final Item FLOUR = registerItem("flour",
            new Item(new FabricItemSettings()));





    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {


    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FancyDelight.MOD_ID, name), item);
    }
    public static void registerModItems() {
        FancyDelight.LOGGER.info("Registering Mod items for" + FancyDelight.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToIngredientItemGroup);

    }
}
