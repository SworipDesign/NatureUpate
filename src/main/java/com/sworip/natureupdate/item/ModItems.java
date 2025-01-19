package com.sworip.natureupdate.item;

import com.sworip.natureupdate.NatureUpdateMod;
import com.sworip.natureupdate.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NatureUpdateMod.MOD_ID);
    //------------------*[ BERRY ]*------------------
    public static final DeferredItem<Item> GOJI_BERRY = ITEMS.register("goji_berry",
            () -> new ItemNameBlockItem(ModBlocks.GOJI_BERRY_BUSH.get(), new Item.Properties().food(ModFoodProperties.GOJI_BERRY)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}