package com.sworip.natureupdate.datagen;

import com.sworip.natureupdate.NatureUpdateMod;
import com.sworip.natureupdate.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, NatureUpdateMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(net.minecraft.tags.BlockTags.CROPS).add(
                ModBlocks.TOMATO_CROP.get(),
                ModBlocks.CORN_CROP.get(),
                ModBlocks.BROCCOLI_CROP.get()
        );
        //------------------*[ MINEABLE ]*------------------
        tag(BlockTags.MINEABLE_WITH_AXE).add(
                //------------------*[ WOODS ]*------------------
                ModBlocks.EBONY_LOG.get(),
                ModBlocks.STRIPPED_EBONY_LOG.get(),
                ModBlocks.EBONY_PLANKS.get(),
                //------------------*[ NON BLOCKS ]*------------------
                //---*[ Ebony Planks ]*---
                ModBlocks.EBONY_PLANKS_STAIRS.get(),
                ModBlocks.EBONY_PLANKS_SLAB.get(),
                ModBlocks.EBONY_PLANKS_PRESSURE_PLATE.get(),
                ModBlocks.EBONY_PLANKS_FENCE.get(),
                ModBlocks.EBONY_PLANKS_FENCE_GATE.get(),
                ModBlocks.EBONY_PLANKS_TRAPDOOR.get(),
                ModBlocks.EBONY_PLANKS_WALL.get(),
                ModBlocks.EBONY_PLANKS_DOOR.get(),
                //---*[ Ebony Log ]*---
                ModBlocks.EBONY_LOG_STAIRS.get(),
                ModBlocks.EBONY_LOG_SLAB.get(),
                ModBlocks.EBONY_LOG_PRESSURE_PLATE.get(),
                ModBlocks.EBONY_LOG_FENCE.get(),
                ModBlocks.EBONY_LOG_FENCE_GATE.get(),
                ModBlocks.EBONY_LOG_TRAPDOOR.get(),
                ModBlocks.EBONY_LOG_WALL.get(),
                ModBlocks.EBONY_LOG_DOOR.get(),
                //---*[ Stripped Ebony Log ]*---
                ModBlocks.STRIPPED_EBONY_LOG_STAIRS.get(),
                ModBlocks.STRIPPED_EBONY_LOG_SLAB.get(),
                ModBlocks.STRIPPED_EBONY_LOG_PRESSURE_PLATE.get(),
                ModBlocks.STRIPPED_EBONY_LOG_FENCE.get(),
                ModBlocks.STRIPPED_EBONY_LOG_FENCE_GATE.get(),
                ModBlocks.STRIPPED_EBONY_LOG_TRAPDOOR.get(),
                ModBlocks.STRIPPED_EBONY_LOG_WALL.get(),
                ModBlocks.STRIPPED_EBONY_LOG_DOOR.get()
        );
        //------------------*[ NON BLOCKS ]*------------------
        //---*[ Fence ]*---
        tag(BlockTags.FENCES).add(
                ModBlocks.EBONY_PLANKS_FENCE.get(),
                ModBlocks.EBONY_LOG_FENCE.get(),
                ModBlocks.STRIPPED_EBONY_LOG_FENCE.get()
        );
        //---*[ Fence Gate ]*---
        tag(BlockTags.FENCE_GATES).add(
                ModBlocks.EBONY_PLANKS_FENCE_GATE.get(),
                ModBlocks.EBONY_LOG_FENCE_GATE.get(),
                ModBlocks.STRIPPED_EBONY_LOG_FENCE_GATE.get()
       );
        //---*[ Wall]*---
        tag(BlockTags.WALLS).add(
                ModBlocks.EBONY_PLANKS_WALL.get(),
                ModBlocks.EBONY_LOG_WALL.get(),
                ModBlocks.STRIPPED_EBONY_LOG_WALL.get()
        );

        //------------------*[ NEEDS TOOLS ]*------------------
//        tag(BlockTags.NEEDS_IRON_TOOL)

    }
}
