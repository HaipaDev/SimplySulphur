
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.haipadev.simplysulphur.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber
public class SimplySulphurModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == SimplySulphurModBlocks.CHARCOAL_BLOCK.get().asItem())
			event.setBurnTime(16200);
		else if (itemstack.getItem() == SimplySulphurModItems.SULPHUR.get())
			event.setBurnTime(3000);
		else if (itemstack.getItem() == SimplySulphurModBlocks.SULPHUR_BLOCK.get().asItem())
			event.setBurnTime(32000);
		else if (itemstack.getItem() == Items.LAVA_BUCKET)
			event.setBurnTime(39000);
	}
}
