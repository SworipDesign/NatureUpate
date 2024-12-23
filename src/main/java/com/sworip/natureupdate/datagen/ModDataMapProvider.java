package com.sworip.natureupdate.datagen;

import com.sworip.natureupdate.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.Compostable;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    protected ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather() {
        this.builder(NeoForgeDataMaps.COMPOSTABLES)
                .add(ModItems.TOMATO.getId(), new Compostable(0.25f), false)
                .add(ModItems.TOMATO_SEEDS.getId(), new Compostable(0.15f), false)
                .add(ModItems.CORN.getId(), new Compostable(0.25f), false)
                .add(ModItems.CORN_SEEDS.getId(), new Compostable(0.15f), false)
                .add(ModItems.BROCCOLI.getId(), new Compostable(0.25f), false)
                .add(ModItems.BROCCOLI_SEEDS.getId(), new Compostable(0.15f), false);
    }
}
