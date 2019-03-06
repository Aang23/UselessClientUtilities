package com.aang23.uselessclientutilities;

import com.aang23.uselessclientutilities.modules.freecam.FreeCam;
import com.aang23.uselessclientutilities.modules.skinswitcher.SkinSwitcher;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.EventBus;

@Mod(modid = UselessClientUtilities.modId, name = UselessClientUtilities.name, version = UselessClientUtilities.version, acceptedMinecraftVersions = "[1.12.2]")
public class UselessClientUtilities {

    public static final String modId = "uselessclientutilities";
    public static final String name = "UselessClientUtilities";
    public static final String version = "1.0";
    public static int timeout = 0;
    @Mod.Instance(modId)
    public static UselessClientUtilities instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        EventBus eventbus = MinecraftForge.EVENT_BUS;
        if (UselessClientUtilitiesSettings.freeCamEnabled)
            FreeCam.initFreecam(eventbus);
        if (UselessClientUtilitiesSettings.skinSwitcherEnabled)
            SkinSwitcher.initSkinSwitcher(eventbus);
    }

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent e) {

    }
}