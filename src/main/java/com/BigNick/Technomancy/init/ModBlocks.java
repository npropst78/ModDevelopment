package com.BigNick.Technomancy.init;

import com.BigNick.Technomancy.block.BlockDiffSides;
import com.BigNick.Technomancy.block.BlockMachina;
import com.BigNick.Technomancy.block.BlockTM;
import com.BigNick.Technomancy.block.BlockSidesTM;
import com.BigNick.Technomancy.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockTM machinaBlock = new BlockMachina();
    public static final BlockSidesTM diffSides = new BlockDiffSides();

    public static void init() {
        GameRegistry.registerBlock(machinaBlock, "machinaBlock");
        GameRegistry.registerBlock(diffSides, "diffSides");
    }
}
