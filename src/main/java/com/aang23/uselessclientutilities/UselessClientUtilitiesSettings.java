package com.aang23.uselessclientutilities;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = UselessClientUtilities.modId)
public class UselessClientUtilitiesSettings {
    @Config.Comment("FreeCam Module")
    @Config.RequiresMcRestart
    public static boolean freeCamEnabled = true;

    @Config.Comment("SkinSwitcher Module")
    public static boolean skinSwitcherEnabled = true;

    @Mod.EventBusSubscriber(modid = UselessClientUtilities.modId)
    private static class Handler {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(UselessClientUtilities.modId)) {
                ConfigManager.sync(UselessClientUtilities.modId, Config.Type.INSTANCE);
            }
        }
    }
}