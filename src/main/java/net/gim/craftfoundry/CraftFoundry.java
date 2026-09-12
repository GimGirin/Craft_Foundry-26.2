package net.gim.craftfoundry;

import net.fabricmc.api.ModInitializer;

import net.gim.craftfoundry.block.ModBlocks;
import net.gim.craftfoundry.creativemodetab.ModCreativeModeTabs;
import net.gim.craftfoundry.item.ModItems;
import net.minecraft.resources.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CraftFoundry implements ModInitializer {
	public static final String MOD_ID = "craftfoundry";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModCreativeModeTabs.registerModCreativeModeTabs();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
