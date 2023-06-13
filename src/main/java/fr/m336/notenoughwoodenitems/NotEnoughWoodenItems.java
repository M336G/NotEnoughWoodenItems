package fr.m336.notenoughwoodenitems;

import fr.m336.notenoughwoodenitems.item.ModItemGroup;
import fr.m336.notenoughwoodenitems.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotEnoughWoodenItems implements ModInitializer {
	public static final String MOD_ID = "notenoughwoodenitems";
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("notenoughwoodenitems");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
	}
}