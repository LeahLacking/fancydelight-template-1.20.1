package net.leah.fancydelight;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.leah.fancydelight.datagen.ModBlockTagProvider;
import net.leah.fancydelight.datagen.ModItemTagProvider;
import net.leah.fancydelight.datagen.ModModelProvider;

public class FancyDelightDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelProvider:: new);
		pack.addProvider(ModBlockTagProvider:: new);
		pack.addProvider(ModItemTagProvider:: new);

	}
}
