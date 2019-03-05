package com.aang23.uselessclientutilities.modules.freecam;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class TickEvent {
	@SubscribeEvent
	public void Tick(ClientTickEvent event) {
		if (FreeCam.timeout > 0)
			FreeCam.timeout--;
	}
}