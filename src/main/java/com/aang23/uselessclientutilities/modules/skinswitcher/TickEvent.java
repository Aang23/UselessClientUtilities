package com.aang23.uselessclientutilities.modules.skinswitcher;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

public class TickEvent {

	@SubscribeEvent
	public void Tick(ClientTickEvent event) {
		if (SkinSwitcher.timeout > 0)
			SkinSwitcher.timeout--;
	}
}