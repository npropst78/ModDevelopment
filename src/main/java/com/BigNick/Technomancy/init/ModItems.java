package com.BigNick.Technomancy.init;

import com.BigNick.Technomancy.item.ItemSword;
import com.BigNick.Technomancy.item.ItemTM;
import com.BigNick.Technomancy.item.ItemWand;
import com.BigNick.Technomancy.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemTM itemWand = new ItemWand();
    public static final ItemTM itemSword = new ItemSword();


    public static void init() {
        GameRegistry.registerItem(itemWand, "magicWand");
        GameRegistry.registerItem(itemSword, "badassSword");
    }
}
