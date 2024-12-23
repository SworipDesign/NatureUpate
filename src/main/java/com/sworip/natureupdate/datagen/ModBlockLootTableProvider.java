package com.sworip.natureupdate.datagen;

import com.sworip.natureupdate.block.ModBlocks;
import com.sworip.natureupdate.block.crops.TomatoCropBlock;
import com.sworip.natureupdate.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        //------------------*[ CROPS ]*------------------
        LootItemCondition.Builder lootItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.TOMATO_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(TomatoCropBlock.AGE, 3));
        this.add(ModBlocks.TOMATO_CROP.get(), this.createCropDrops(ModBlocks.TOMATO_CROP.get(),
                ModItems.TOMATO.get(), ModItems.TOMATO_SEEDS.get(), lootItemConditionBuilder));
        this.add(ModBlocks.CORN_CROP.get(), this.createCropDrops(ModBlocks.CORN_CROP.get(),
                ModItems.CORN.get(), ModItems.CORN_SEEDS.get(), lootItemConditionBuilder));
        this.add(ModBlocks.BROCCOLI_CROP.get(), this.createCropDrops(ModBlocks.BROCCOLI_CROP.get(),
                ModItems.BROCCOLI.get(), ModItems.BROCCOLI_SEEDS.get(), lootItemConditionBuilder));
        //------------------*[ WOODS ]*------------------
        dropSelf(ModBlocks.EBONY_LOG.get());
        dropSelf(ModBlocks.STRIPPED_EBONY_LOG.get());
        dropSelf(ModBlocks.EBONY_PLANKS.get());
        //------------------*[ NON BLOCKS ]*------------------
        //---*[ Ebony Planks ]*---
        dropSelf(ModBlocks.EBONY_PLANKS_STAIRS.get());
        add(ModBlocks.EBONY_PLANKS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.EBONY_PLANKS_SLAB.get()));
        dropSelf(ModBlocks.EBONY_PLANKS_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.EBONY_PLANKS_BUTTON.get());
        dropSelf(ModBlocks.EBONY_PLANKS_FENCE.get());
        dropSelf(ModBlocks.EBONY_PLANKS_FENCE_GATE.get());
        dropSelf(ModBlocks.EBONY_PLANKS_WALL.get());
        dropSelf(ModBlocks.EBONY_PLANKS_TRAPDOOR.get());
        add(ModBlocks.EBONY_PLANKS_DOOR.get(),
                block -> createDoorTable(ModBlocks.EBONY_PLANKS_DOOR.get()));
        //---*[ Ebony Log ]*---
        dropSelf(ModBlocks.EBONY_LOG_STAIRS.get());
        add(ModBlocks.EBONY_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.EBONY_LOG_SLAB.get()));
        dropSelf(ModBlocks.EBONY_LOG_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.EBONY_LOG_BUTTON.get());
        dropSelf(ModBlocks.EBONY_LOG_FENCE.get());
        dropSelf(ModBlocks.EBONY_LOG_FENCE_GATE.get());
        dropSelf(ModBlocks.EBONY_LOG_WALL.get());
        dropSelf(ModBlocks.EBONY_LOG_TRAPDOOR.get());
        add(ModBlocks.EBONY_LOG_DOOR.get(),
                block -> createDoorTable(ModBlocks.EBONY_LOG_DOOR.get()));
        //---*[ Stripped Ebony Log ]*---
        dropSelf(ModBlocks.STRIPPED_EBONY_LOG_STAIRS.get());
        add(ModBlocks.STRIPPED_EBONY_LOG_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.STRIPPED_EBONY_LOG_SLAB.get()));
        dropSelf(ModBlocks.STRIPPED_EBONY_LOG_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.STRIPPED_EBONY_LOG_BUTTON.get());
        dropSelf(ModBlocks.STRIPPED_EBONY_LOG_FENCE.get());
        dropSelf(ModBlocks.STRIPPED_EBONY_LOG_FENCE_GATE.get());
        dropSelf(ModBlocks.STRIPPED_EBONY_LOG_WALL.get());
        dropSelf(ModBlocks.STRIPPED_EBONY_LOG_TRAPDOOR.get());
        add(ModBlocks.STRIPPED_EBONY_LOG_DOOR.get(),
                block -> createDoorTable(ModBlocks.STRIPPED_EBONY_LOG_DOOR.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}