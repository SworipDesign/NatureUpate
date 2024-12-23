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

    //------------------*[ CROPS  ]*------------------
    public static final DeferredItem<Item> TOMATO = ITEMS.register("tomato",
        () -> new Item(new Item.Properties().food(ModFoodProperties.TOMATO)));
    public static final DeferredItem<Item> CORN = ITEMS.register("corn",
        () -> new Item(new Item.Properties().food(ModFoodProperties.CORN)));
    public static final DeferredItem<Item> BROCCOLI = ITEMS.register("broccoli",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BROCCOLI)));

    //------------------*[ MEALS  ]*------------------

    //------------------*[ SEEDS  ]*------------------
    public static final DeferredItem<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROCCOLI_SEEDS = ITEMS.register("broccoli_seeds",
            () -> new Item(new Item.Properties()));
    //------------------*[ SAPLINGS  ]*------------------

    //------------------*[ BUSHES  ]*------------------

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}