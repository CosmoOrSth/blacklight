package net.arcmods;

import net.arcmods.blocks.BlackLightBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlackLight implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("blacklight");

	@Override
	public void onInitialize() {

		LOGGER.info("Main loaded");

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
			content.addAfter(Items.PEARLESCENT_FROGLIGHT, BlackLightBlocks.TYRONE_O_LANTERN);
		});

		BlackLightBlocks.register();

	}
}