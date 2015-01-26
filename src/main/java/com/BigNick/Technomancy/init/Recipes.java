package com.BigNick.Technomancy.init;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Recipes {

    public static void init() {

        //Creates a Shaped Recipe that takes in the letters used to create a shape inside of the crafting table.
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemSword), " g "," g "," s ",'g', "ingotGold", 's', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.itemWand), "ggg","ggg"," s ",'g', "blockGold", 's', "ingotIron"));


        //Creates a recipe that will take the items in any order regardless of placement inside of the crafting table.
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.machinaBlock), "stickWood", new ItemStack(ModItems.itemWand), "ingotIron"));


    }
}
