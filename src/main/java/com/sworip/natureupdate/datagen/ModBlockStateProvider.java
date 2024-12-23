package com.sworip.natureupdate.datagen;

import com.sworip.natureupdate.NatureUpdateMod;
import com.sworip.natureupdate.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, NatureUpdateMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //------------------*[ BUSH ]*------------------

        //------------------*[ WOODS ]*------------------
        //---*[ Ebony ]*---
        logBlock(((RotatedPillarBlock) ModBlocks.EBONY_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.EBONY_WOOD.get()), blockTexture(ModBlocks.EBONY_LOG.get()), blockTexture(ModBlocks.EBONY_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_EBONY_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_EBONY_WOOD.get()), blockTexture(ModBlocks.STRIPPED_EBONY_LOG.get()), blockTexture(ModBlocks.STRIPPED_EBONY_LOG.get()));

        blockItem(ModBlocks.EBONY_LOG);
        blockItem(ModBlocks.EBONY_WOOD);
        blockItem(ModBlocks.STRIPPED_EBONY_LOG);
        blockItem(ModBlocks.STRIPPED_EBONY_WOOD);

        blockWithItem(ModBlocks.EBONY_PLANKS);

        leavesBlock(ModBlocks.EBONY_LEAVES);
        saplingBlock(ModBlocks.EBONY_SAPLING);
        //------------------*[ NON BLOCKS ]*------------------
        //---*[ Ebony Planks ]*---
        stairsBlock(ModBlocks.EBONY_PLANKS_STAIRS.get(), blockTexture(ModBlocks.EBONY_PLANKS.get()));
        slabBlock(ModBlocks.EBONY_PLANKS_SLAB.get(), blockTexture(ModBlocks.EBONY_PLANKS.get()), blockTexture(ModBlocks.EBONY_PLANKS.get()));
        buttonBlock(ModBlocks.EBONY_PLANKS_BUTTON.get(), blockTexture(ModBlocks.EBONY_PLANKS.get()));
        pressurePlateBlock(ModBlocks.EBONY_PLANKS_PRESSURE_PLATE.get(), blockTexture(ModBlocks.EBONY_PLANKS.get()));
        fenceBlock(ModBlocks.EBONY_PLANKS_FENCE.get(), blockTexture(ModBlocks.EBONY_PLANKS.get()));
        fenceGateBlock(ModBlocks.EBONY_PLANKS_FENCE_GATE.get(), blockTexture(ModBlocks.EBONY_PLANKS.get()));
        wallBlock(ModBlocks.EBONY_PLANKS_WALL.get(), blockTexture(ModBlocks.EBONY_PLANKS.get()));
        doorBlockWithRenderType(ModBlocks.EBONY_PLANKS_DOOR.get(), modLoc("block/ebony_planks_door_bottom"), modLoc("block/ebony_planks_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.EBONY_PLANKS_TRAPDOOR.get(), modLoc("block/ebony_planks_trapdoor"), true, "cutout");
        blockItem(ModBlocks.EBONY_PLANKS_STAIRS);
        blockItem(ModBlocks.EBONY_PLANKS_SLAB);
        blockItem(ModBlocks.EBONY_PLANKS_PRESSURE_PLATE);
        blockItem(ModBlocks.EBONY_PLANKS_FENCE_GATE);
        blockItem(ModBlocks.EBONY_PLANKS_TRAPDOOR, "_bottom");
        //---*[ Ebony Log ]*---
        stairsBlock(ModBlocks.EBONY_LOG_STAIRS.get(), blockTexture(ModBlocks.EBONY_LOG.get()));
        slabBlock(ModBlocks.EBONY_LOG_SLAB.get(), blockTexture(ModBlocks.EBONY_LOG.get()), blockTexture(ModBlocks.EBONY_LOG.get()));
        buttonBlock(ModBlocks.EBONY_LOG_BUTTON.get(), blockTexture(ModBlocks.EBONY_LOG.get()));
        pressurePlateBlock(ModBlocks.EBONY_LOG_PRESSURE_PLATE.get(), blockTexture(ModBlocks.EBONY_LOG.get()));
        fenceBlock(ModBlocks.EBONY_LOG_FENCE.get(), blockTexture(ModBlocks.EBONY_LOG.get()));
        fenceGateBlock(ModBlocks.EBONY_LOG_FENCE_GATE.get(), blockTexture(ModBlocks.EBONY_LOG.get()));
        wallBlock(ModBlocks.EBONY_LOG_WALL.get(), blockTexture(ModBlocks.EBONY_LOG.get()));
        doorBlockWithRenderType(ModBlocks.EBONY_LOG_DOOR.get(), modLoc("block/ebony_log_door_bottom"), modLoc("block/ebony_log_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.EBONY_LOG_TRAPDOOR.get(), modLoc("block/ebony_log_trapdoor"), true, "cutout");
        blockItem(ModBlocks.EBONY_LOG_STAIRS);
        blockItem(ModBlocks.EBONY_LOG_SLAB);
        blockItem(ModBlocks.EBONY_LOG_PRESSURE_PLATE);
        blockItem(ModBlocks.EBONY_LOG_FENCE_GATE);
        blockItem(ModBlocks.EBONY_LOG_TRAPDOOR, "_bottom");
        //---*[ Stripped Ebony Log ]*---
        stairsBlock(ModBlocks.STRIPPED_EBONY_LOG_STAIRS.get(), blockTexture(ModBlocks.STRIPPED_EBONY_LOG.get()));
        slabBlock(ModBlocks.STRIPPED_EBONY_LOG_SLAB.get(), blockTexture(ModBlocks.STRIPPED_EBONY_LOG.get()), blockTexture(ModBlocks.STRIPPED_EBONY_LOG.get()));
        buttonBlock(ModBlocks.STRIPPED_EBONY_LOG_BUTTON.get(), blockTexture(ModBlocks.STRIPPED_EBONY_LOG.get()));
        pressurePlateBlock(ModBlocks.STRIPPED_EBONY_LOG_PRESSURE_PLATE.get(), blockTexture(ModBlocks.STRIPPED_EBONY_LOG.get()));
        fenceBlock(ModBlocks.STRIPPED_EBONY_LOG_FENCE.get(), blockTexture(ModBlocks.STRIPPED_EBONY_LOG.get()));
        fenceGateBlock(ModBlocks.STRIPPED_EBONY_LOG_FENCE_GATE.get(), blockTexture(ModBlocks.STRIPPED_EBONY_LOG.get()));
        wallBlock(ModBlocks.STRIPPED_EBONY_LOG_WALL.get(), blockTexture(ModBlocks.STRIPPED_EBONY_LOG.get()));
        doorBlockWithRenderType(ModBlocks.STRIPPED_EBONY_LOG_DOOR.get(), modLoc("block/stripped_ebony_log_door_bottom"), modLoc("block/stripped_ebony_log_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.STRIPPED_EBONY_LOG_TRAPDOOR.get(), modLoc("block/stripped_ebony_log_trapdoor"), true, "cutout");
        blockItem(ModBlocks.STRIPPED_EBONY_LOG_STAIRS);
        blockItem(ModBlocks.STRIPPED_EBONY_LOG_SLAB);
        blockItem(ModBlocks.STRIPPED_EBONY_LOG_PRESSURE_PLATE);
        blockItem(ModBlocks.STRIPPED_EBONY_LOG_FENCE_GATE);
        blockItem(ModBlocks.STRIPPED_EBONY_LOG_TRAPDOOR, "_bottom");
    }

    private void saplingBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("natureupdate:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("natureupdate:block/" + deferredBlock.getId().getPath() + appendix));
    }
}
