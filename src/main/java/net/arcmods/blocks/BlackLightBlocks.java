package net.arcmods.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlackLightBlocks {

    public static final Block TYRONE_O_LANTERN = new Block(FabricBlockSettings.create().strength(1.0f).luminance(15));
    

    public static void register() {

        //block
        Registry.register(Registries.BLOCK, new Identifier("blacklight", "tyrone_o_lantern"), TYRONE_O_LANTERN);

        //blockitem
        Registry.register(Registries.ITEM, new Identifier("blacklight", "tyrone_o_lantern"), new BlockItem(TYRONE_O_LANTERN, new FabricItemSettings()));
  
    }
}
