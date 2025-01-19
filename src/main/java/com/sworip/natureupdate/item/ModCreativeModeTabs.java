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
    //------------------*[ NATURE UPDATE TAB  ]*------------------
    public static final Supplier<CreativeModeTab> NATURE_UPDATE_TAB = CREATIVE_MODE_TAB.register("nature_update_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.EBONY_LOG))
            .title(Component.translatable("creativetab.natureupdate.nature_update"))
            .displayItems((itemDisplayParameters, output) -> {
                    //-----*[ Berry ]*-----
                    output.accept(ModItems.GOJI_BERRY);
                    //-----*[ Woods ]*-----
                    //Ebony
                    output.accept(ModBlocks.EBONY_LOG);
                    output.accept(ModBlocks.STRIPPED_EBONY_LOG);
                    output.accept(ModBlocks.EBONY_WOOD);
                    output.accept(ModBlocks.STRIPPED_EBONY_WOOD);
                    output.accept(ModBlocks.EBONY_PLANKS);
                    output.accept(ModBlocks.EBONY_LEAVES);
                    output.accept(ModBlocks.EBONY_SAPLING);
                    //Pine
                    output.accept(ModBlocks.PINE_LOG);
                    output.accept(ModBlocks.STRIPPED_PINE_LOG);
                    output.accept(ModBlocks.PINE_WOOD);
                    output.accept(ModBlocks.STRIPPED_PINE_WOOD);
                    output.accept(ModBlocks.PINE_PLANKS);
                    output.accept(ModBlocks.PINE_LEAVES);
                    output.accept(ModBlocks.PINE_SAPLING);
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