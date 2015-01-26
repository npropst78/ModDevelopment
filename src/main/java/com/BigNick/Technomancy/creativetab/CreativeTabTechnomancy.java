package com.BigNick.Technomancy.creativetab;

import com.BigNick.Technomancy.init.ModItems;
import com.BigNick.Technomancy.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;



public class CreativeTabTechnomancy {

    public static final CreativeTabs TM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {
            return ModItems.itemWand;
        }
    };
}
