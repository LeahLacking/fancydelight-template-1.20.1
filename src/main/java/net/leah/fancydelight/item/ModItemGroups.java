package net.leah.fancydelight.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.leah.fancydelight.FancyDelight;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
        public static final ItemGroup splintered_GROUP = Registry.register(Registries.ITEM_GROUP,
                new Identifier(FancyDelight.MOD_ID, "fancydelight"),
                FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fancydelight"))
                        .icon(() -> new ItemStack(ModItems.CHOCOLATE_LAVA_CAKE)).entries((displayContext, entries) -> {

                            entries.add(ModItems.ESTROGEN_WAFFLE);
                            entries.add(ModItems.ESTROGEN_BURGER);
                            entries.add(ModItems.UDON_NOODLES);
                            entries.add(ModItems.KATSU_CURRY);
                            entries.add(ModItems.PESTO_PASTA);
                            entries.add(ModItems.SUSHI);
                            entries.add(ModItems.PRETZEL);
                            entries.add(ModItems.FRIED_RICE);
                            entries.add(ModItems.PULLA);
                            entries.add(ModItems.WIDE_BREAD);
                            entries.add(ModItems.CLAM_CHOWDER);
                            entries.add(ModItems.ICE_CREAM);
                            entries.add(ModItems.CHOCOLATE_LAVA_CAKE);
                            entries.add(ModItems.CHOCOLATE_BAR);
                            entries.add(ModItems.RICE_PUDDING);
                            entries.add(ModItems.FLOUR);





                        }).build());

        public static void registerItemGroups() {
            FancyDelight.LOGGER.info("Registering Item Groups for "+FancyDelight.MOD_ID);
        }
    }

