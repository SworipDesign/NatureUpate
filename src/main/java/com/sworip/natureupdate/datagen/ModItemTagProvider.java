package com.sworip.natureupdate.datagen;

import com.sworip.natureupdate.NatureUpdateMod;
import com.sworip.natureupdate.item.ModItems;
import com.sworip.natureupdate.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, NatureUpdateMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.COMPOSTABLE_ITEMS)
                .add(ModItems.TOMATO.get())
                .add(ModItems.CORN.get())
                .add(ModItems.BROCCOLI.get())
                .add(ModItems.TOMATO_SEEDS.get())
                .add(ModItems.CORN_SEEDS.get())
                .add(ModItems.BROCCOLI_SEEDS.get());
    }
}

