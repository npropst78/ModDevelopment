package com.BigNick.Technomancy.client.gui;


import com.BigNick.Technomancy.handler.ConfigHandler;
import com.BigNick.Technomancy.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig {


    public ModGuiConfig(GuiScreen guiScreen) {

        //Sets up the Category for the config GUI inside of minecraft
        super(guiScreen,
                new ConfigElement(ConfigHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigHandler.configuration.toString())
               );

    }
}
