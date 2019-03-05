package com.aang23.uselessclientutilities.modules.skinswitcher;

import net.minecraftforge.fml.common.eventhandler.EventBus;

public class SkinSwitcher {
	public static int timeout = 0;

	public static void initSkinSwitcher(EventBus eventbus) {
		System.out.println("[UselessClientUtilities] Loading module SkinSwitcher");
		eventbus.register(new KeyEvent());
		eventbus.register(new TickEvent());
	}
}
