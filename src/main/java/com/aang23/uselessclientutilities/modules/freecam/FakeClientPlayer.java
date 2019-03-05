package com.aang23.uselessclientutilities.modules.freecam;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import net.minecraft.world.World;

public class FakeClientPlayer extends EntityLivingBase {

	public FakeClientPlayer(World world) {
		super(world);// , "fakeClientPlayer");
	}

	@Override
	public Iterable<ItemStack> getArmorInventoryList() {
		return null;
	}

	@Override
	public ItemStack getItemStackFromSlot(EntityEquipmentSlot slotIn) {
		return null;
	}

	@Override
	public void setItemStackToSlot(EntityEquipmentSlot slotIn, ItemStack stack) {

	}

	@Override
	public EnumHandSide getPrimaryHand() {
		return null;
	}
}