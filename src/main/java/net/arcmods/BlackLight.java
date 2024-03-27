package net.arcmods;

import net.arcmods.blocks.BlackLightBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlackLight implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("blacklight");

	public static final ItemGroup BLACK_LIGHT = FabricItemGroup.builder()
    .icon(() -> new ItemStack(BlackLightBlocks.TYRONE_O_LANTERN))
    .displayName(Text.translatable("itemGroup.tutorial.test_group"))
    	.entries((context, entries) -> {
    		entries.add(BlackLightBlocks.TYRONE_O_LANTERN);
    	})
    	.build();

	@Override
	public void onInitialize() {

			ItemGroupEvents.modifyEntriesEvent(BLACK_LIGHT).register((content) -> content.add(BlackLightBlocks.TYRONE_O_LANTERN));

		    Registry.register(Registries.ITEM_GROUP, new Identifier("blacklight", "black_light"), BLACK_LIGHT);

		LOGGER.info("Main loaded");

	}
}