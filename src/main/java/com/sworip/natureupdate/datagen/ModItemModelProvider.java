package com.sworip.natureupdate.datagen;

import com.sworip.natureupdate.NatureUpdateMod;
import com.sworip.natureupdate.block.ModBlocks;
import com.sworip.natureupdate.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, NatureUpdateMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //------------------*[ TREES ]*------------------

        //------------------*[ SAPLINGS ]*------------------
        saplingItem(ModBlocks.EBONY_SAPLING);
        saplingItem(ModBlocks.PINE_SAPLING);
        //------------------*[ BERRY ]*------------------
        basicItem(ModItems.GOJI_BERRY.get());
        //------------------*[ NON BLOCKS ]*------------------
        //---*[ Ebony Planks ]*---
        buttonItem(ModBlocks.EBONY_PLANKS_BUTTON, ModBlocks.EBONY_PLANKS);
        fenceItem(ModBlocks.EBONY_PLANKS_FENCE, ModBlocks.EBONY_PLANKS);
        wallItem(ModBlocks.EBONY_PLANKS_WALL, ModBlocks.EBONY_PLANKS);
        basicItem(ModBlocks.EBONY_PLANKS_DOOR.asItem());
        //---*[ Ebony Log ]*---
        buttonItem(ModBlocks.EBONY_LOG_BUTTON, ModBlocks.EBONY_LOG);
        fenceItem(ModBlocks.EBONY_LOG_FENCE, ModBlocks.EBONY_LOG);
        wallItem(ModBlocks.EBONY_LOG_WALL, ModBlocks.EBONY_LOG);
        basicItem(ModBlocks.EBONY_LOG_DOOR.asItem());
        //---*[ Stripped Ebony Log ]*---
        buttonItem(ModBlocks.STRIPPED_EBONY_LOG_BUTTON, ModBlocks.STRIPPED_EBONY_LOG);
        fenceItem(ModBlocks.STRIPPED_EBONY_LOG_FENCE, ModBlocks.STRIPPED_EBONY_LOG);
        wallItem(ModBlocks.STRIPPED_EBONY_LOG_WALL, ModBlocks.STRIPPED_EBONY_LOG);
        basicItem(ModBlocks.STRIPPED_EBONY_LOG_DOOR.asItem());
    }

    private ItemModelBuilder saplingItem(DeferredBlock<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(NatureUpdateMod.MOD_ID,"block/" + item.getId().getPath()));
    }

    public void buttonItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(NatureUpdateMod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void fenceItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(NatureUpdateMod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }

    public void wallItem(DeferredBlock<?> block, DeferredBlock<Block> baseBlock) {
        this.withExistingParent(block.getId().getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(NatureUpdateMod.MOD_ID,
                        "block/" + baseBlock.getId().getPath()));
    }
}
