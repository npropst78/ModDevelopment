package com.BigNick.Technomancy.handler;

import com.BigNick.Technomancy.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;
import java.sql.Ref;


public class ConfigHandler  {

    public static Configuration configuration;
    public static boolean testValue = false;

    public static void init(File configFile) {

        // Create the Config
        if (configuration == null){
            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }

    //handles the information that is changed from the config file
    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){

        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            //Sync the config
            loadConfiguration();
        }

    }

    private static void loadConfiguration() {
        testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "Exammple Value");

        if (configuration.hasChanged()) {
            configuration.save();
        }
    }


}
