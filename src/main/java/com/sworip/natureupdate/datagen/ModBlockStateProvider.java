package com.sworip.natureupdate.datagen;

import com.sworip.natureupdate.NatureUpdateMod;
import com.sworip.natureupdate.block.ModBlocks;
import com.sworip.natureupdate.block.crops.BroccoliCropBlock;
import com.sworip.natureupdate.block.crops.CornCropBlock;
import com.sworip.natureupdate.block.crops.TomatoCropBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CropBlock;
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
        //------------------*[ CROPS ]*------------------
        makeCrop(((CropBlock) ModBlocks.TOMATO_CROP.get()), "tomato_crop_stage", "tomato_crop_stage");
        //------------------*[ WOODS ]*------------------
        blockWithItem(ModBlocks.EBONY_LOG);
        blockWithItem(ModBlocks.STRIPPED_EBONY_LOG);
        blockWithItem(ModBlocks.EBONY_PLANKS);
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

    public void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((TomatoCropBlock) block).getAgeProperty()),
                    ResourceLocation.fromNamespaceAndPath(NatureUpdateMod.MOD_ID, "block/" + textureName + state.getValue(((TomatoCropBlock) block).getAgeProperty()))).renderType("cutout"));
                new ConfiguredModel(models().crop(modelName + state.getValue(((CornCropBlock) block).getAgeProperty()),
                    ResourceLocation.fromNamespaceAndPath(NatureUpdateMod.MOD_ID, "block/" + textureName + state.getValue(((CornCropBlock) block).getAgeProperty()))).renderType("cutout"));
                new ConfiguredModel(models().crop(modelName + state.getValue(((BroccoliCropBlock) block).getAgeProperty()),
                    ResourceLocation.fromNamespaceAndPath(NatureUpdateMod.MOD_ID, "block/" + textureName + state.getValue(((BroccoliCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
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
