package net.arcmods.blocks;

import net.arcmods.BlackLight;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlackLightBlocks {
    
    public static final Block TYRONE_O_LANTERN = new Block(FabricBlockSettings.create().strength(0f));

    public static void register() {

        //block
        Registry.register(Registry.BLOCK, new Identifier("blacklight", "tyrone_o_lantern"), TYRONE_O_LANTERN);

        //blockitem
        Registry.register(Registry.ITEM, new Identifier("blacklight", "tyrone_o_lantern"), new BlockItem(TYRONE_O_LANTERN, new FabricItemSettings().group(BlackLight.BLACK_LIGHT)));
    }
}
