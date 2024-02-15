package net.leah.fancydelight;

import net.fabricmc.api.ModInitializer;

import net.leah.fancydelight.block.ModBlocks;
import net.leah.fancydelight.item.ModItemGroups;
import net.leah.fancydelight.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FancyDelight implements ModInitializer {


	public static final String MOD_ID = "fancydelight";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlock();

		LOGGER.info("Hello Fabric world!");
	}
}