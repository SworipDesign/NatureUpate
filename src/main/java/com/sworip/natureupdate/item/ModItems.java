package com.sworip.natureupdate.item;

import com.sworip.natureupdate.NatureUpdateMod;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NatureUpdateMod.MOD_ID);
    //------------------*[ SAPLINGS  ]*------------------

    //------------------*[ BUSH ]*------------------

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}