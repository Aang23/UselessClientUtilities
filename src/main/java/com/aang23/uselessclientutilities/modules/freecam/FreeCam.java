package com.aang23.uselessclientutilities.modules.freecam;

import net.minecraftforge.fml.common.eventhandler.EventBus;

public class FreeCam {
	public static int timeout = 0;

	public static void initFreecam(EventBus eventbus) {
		System.out.println("[UselessClientUtilities] Loading module FreeCam");
		eventbus.register(new KeyPressEvent());
		eventbus.register(new TickEvent());
		eventbus.register(new RenderEvent());
	}
}