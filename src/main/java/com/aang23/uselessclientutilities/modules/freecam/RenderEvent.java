package com.aang23.uselessclientutilities.modules.freecam;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RenderEvent {
	FakeClientPlayer fakePlayer = null;
	static int x, y, z;
	static int prevx, prevy, prevz;
	float prevyaw, prevpitch;
	static boolean enabled = false;

	@SubscribeEvent
	public void onPreRenderGame(RenderGameOverlayEvent.Pre event) {
		if (enabled) {
			if (fakePlayer == null) {
				fakePlayer = new FakeClientPlayer(Minecraft.getMinecraft().player.world);
			}

			fakePlayer.setLocationAndAngles(x, y, z, Minecraft.getMinecraft().player.rotationYaw,
					Minecraft.getMinecraft().player.rotationPitch);

			fakePlayer.prevRotationPitch = prevpitch;
			fakePlayer.prevRotationYaw = prevyaw;
			fakePlayer.rotationYawHead = Minecraft.getMinecraft().player.rotationYawHead;
			fakePlayer.prevPosX = prevx;
			fakePlayer.prevPosY = prevy;
			fakePlayer.prevPosZ = prevz;
			Minecraft.getMinecraft().setRenderViewEntity(fakePlayer);

			prevx = x;
			prevy = y;
			prevz = z;
			prevpitch = Minecraft.getMinecraft().player.rotationPitch;
			prevyaw = Minecraft.getMinecraft().player.rotationYaw;
		} else {
			Minecraft.getMinecraft().setRenderViewEntity(Minecraft.getMinecraft().player);
		}
	}
}
