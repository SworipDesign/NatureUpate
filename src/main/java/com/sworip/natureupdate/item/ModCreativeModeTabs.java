package com.sworip.natureupdate.item;

import com.sworip.natureupdate.NatureUpdateMod;
import com.sworip.natureupdate.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NatureUpdateMod.MOD_ID);

    //------------------*[ NATURE ITEMS TAB  ]*------------------
    public static final Supplier<CreativeModeTab> NATURE_ITEMS_TAB = CREATIVE_MODE_TAB.register("nature_items_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CORN.get()))
            .title(Component.translatable("creativetab.natureupdate.nature_items"))
            .displayItems((itemDisplayParameters, output) -> {
                    //-----*[ Crops ]*-----
                    output.accept(ModItems.TOMATO);
                    output.accept(ModItems.CORN);
                    output.accept(ModItems.BROCCOLI);
                    //-----*[ Meals ]*-----

                    //-----*[ Seeds ]*-----
                    output.accept(ModItems.TOMATO_SEEDS);
                    output.accept(ModItems.CORN_SEEDS);
                    output.accept(ModItems.BROCCOLI_SEEDS);
                    //-----*[ Saplings ]*-----

                    //-----*[ Bushes ]*-----
            }).build());

    //------------------*[ NATURE BLOCKS TAB  ]*------------------
    public static final Supplier<CreativeModeTab> NATURE_BLOCK_TAB = CREATIVE_MODE_TAB.register("nature_blocks_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.EBONY_LOG))
            .title(Component.translatable("creativetab.natureupdate.nature_blocks"))
            .displayItems((itemDisplayParameters, output) -> {
                    //-----*[ Woods ]*-----
                    output.accept(ModBlocks.EBONY_LOG);
                    output.accept(ModBlocks.STRIPPED_EBONY_LOG);
                    output.accept(ModBlocks.EBONY_PLANKS);
                    //-----*[ Ebony Planks Non Blocks ]*-----
                    output.accept(ModBlocks.EBONY_PLANKS_STAIRS);
                    output.accept(ModBlocks.EBONY_PLANKS_SLAB);
                    output.accept(ModBlocks.EBONY_PLANKS_PRESSURE_PLATE);
                    output.accept(ModBlocks.EBONY_PLANKS_FENCE);
                    output.accept(ModBlocks.EBONY_PLANKS_FENCE_GATE);
                    output.accept(ModBlocks.EBONY_PLANKS_WALL);
                    output.accept(ModBlocks.EBONY_PLANKS_TRAPDOOR);
                    output.accept(ModBlocks.EBONY_PLANKS_DOOR);
                    //-----*[ Ebony Log Non Blocks ]*-----
                    output.accept(ModBlocks.EBONY_LOG_STAIRS);
                    output.accept(ModBlocks.EBONY_LOG_SLAB);
                    output.accept(ModBlocks.EBONY_LOG_PRESSURE_PLATE);
                    output.accept(ModBlocks.EBONY_LOG_FENCE);
                    output.accept(ModBlocks.EBONY_LOG_FENCE_GATE);
                    output.accept(ModBlocks.EBONY_LOG_WALL);
                    output.accept(ModBlocks.EBONY_LOG_TRAPDOOR);
                    output.accept(ModBlocks.EBONY_LOG_DOOR);
                    //-----*[ Stripped Ebony Log Non Blocks ]*-----
                    output.accept(ModBlocks.STRIPPED_EBONY_LOG_STAIRS);
                    output.accept(ModBlocks.STRIPPED_EBONY_LOG_SLAB);
                    output.accept(ModBlocks.STRIPPED_EBONY_LOG_PRESSURE_PLATE);
                    output.accept(ModBlocks.STRIPPED_EBONY_LOG_FENCE);
                    output.accept(ModBlocks.STRIPPED_EBONY_LOG_FENCE_GATE);
                    output.accept(ModBlocks.STRIPPED_EBONY_LOG_WALL);
                    output.accept(ModBlocks.STRIPPED_EBONY_LOG_TRAPDOOR);
                    output.accept(ModBlocks.STRIPPED_EBONY_LOG_DOOR);
            }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}