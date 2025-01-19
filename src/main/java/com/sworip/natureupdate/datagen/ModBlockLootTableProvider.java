package com.sworip.natureupdate.datagen;

import com.sworip.natureupdate.block.ModBlocks;
import com.sworip.natureupdate.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {

    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        //------------------*[ BUSH ]*------------------
        this.add(ModBlocks.GOJI_BERRY_BUSH.get(), block -> this.applyExplosionDecay(
                block, LootTable.lootTable().withPool(LootPool.lootPool().when(
                            LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.GOJI_BERRY_BUSH.get())
                                    .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3))
                    ).add(LootItem.lootTableItem(ModItems.GOJI_BERRY.get()))
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                    .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                ).withPool(LootPool.lootPool().when(
                            LootItemBlockStatePropertyCondition.hasBlockStateProperties(ModBlocks.GOJI_BERRY_BUSH.get())
                                    .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2))
                    ).add(LootItem.lootTableItem(ModItems.GOJI_BERRY.get()))
                    .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                    .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )));
        //------------------*[ WOODS ]*------------------
        //---*[ Ebony ]*---
        dropSelf(ModBlocks.EBONY_LOG.get());
        dropSelf(ModBlocks.STRIPPED_EBONY_LOG.get());
        dropSelf(ModBlocks.EBONY_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_EBONY_WOOD.get());
        dropSelf(ModBlocks.EBONY_PLANKS.get());
        dropSelf(ModBlocks.EBONY_SAPLING.get());
        this.add(ModBlocks.EBONY_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.EBONY_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        //---*[ Pine ]*---
        dropSelf(ModBlocks.PINE_LOG.get());
        dropSelf(ModBlocks.STRIPPED_PINE_LOG.get());
        dropSelf(ModBlocks.PINE_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_PINE_WOOD.get());
        dropSelf(ModBlocks.PINE_PLANKS.get());
        dropSelf(ModBlocks.PINE_SAPLING.get());
        this.add(ModBlocks.PINE_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.PINE_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
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