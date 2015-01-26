package com.BigNick.Technomancy;

        import com.BigNick.Technomancy.handler.ConfigHandler;
        import com.BigNick.Technomancy.init.ModBlocks;
        import com.BigNick.Technomancy.init.ModItems;
        import com.BigNick.Technomancy.init.Recipes;
        import com.BigNick.Technomancy.proxy.CommonProxy;
        import com.BigNick.Technomancy.reference.Reference;
        import com.BigNick.Technomancy.utility.LogHelper;
        import cpw.mods.fml.common.FMLCommonHandler;
        import cpw.mods.fml.common.Mod;
        import cpw.mods.fml.common.SidedProxy;
        import cpw.mods.fml.common.event.FMLInitializationEvent;
        import cpw.mods.fml.common.event.FMLPostInitializationEvent;
        import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class Technomancy {

    @Mod.Instance(Reference.MOD_ID)
    public static Technomancy instance;


    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // Network Handling, Mod Config, Block Registering and Items
        proxy.preInit();

        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        ModItems.init();
        ModBlocks.init();

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event){
        //GUI, Tile entities, Crafting recipes, general events etc...
        proxy.init();


        Recipes.init();

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        //Wrap up for your mod after things load, i.e. other mods
        proxy.postInit();

    }
}
