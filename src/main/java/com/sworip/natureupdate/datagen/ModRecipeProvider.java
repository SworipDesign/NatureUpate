package com.sworip.natureupdate.datagen;

import com.sworip.natureupdate.NatureUpdateMod;
import com.sworip.natureupdate.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        //------------------*[ LISTS ]*------------------
        List<ItemLike> NEW_CHARCOALS = List.of(ModBlocks.EBONY_LOG,
                ModBlocks.STRIPPED_EBONY_LOG);
//
        //------------------*[ CRAFTING RECIPES ]*------------------
//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.EBONY_BLOCK.get())
//                .pattern("BBB")
//                .pattern("BBB")
//                .pattern("BBB")
//                .define('B', ModItems.EBONY.get())
//                .unlockedBy("has_ebony", has(ModItems.EBONY)).save(recipeOutput);

//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.EBONY.get(), 9)
//                .requires(ModBlocks.EBONY_BLOCK)
//                .unlockedBy("has_ebony_block", has(ModBlocks.EBONY_BLOCK)).save(recipeOutput);

        //------------------*[ NON BLOCKS RECIPES ]*------------------
        //---*[ Ebony Planks ]*---
        stairBuilder(ModBlocks.EBONY_PLANKS_STAIRS.get(), Ingredient.of(ModBlocks.EBONY_PLANKS)).group("ebony")
                .unlockedBy("has_ebony_planks", has(ModBlocks.EBONY_PLANKS)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EBONY_PLANKS_SLAB.get(), ModBlocks.EBONY_PLANKS.get());
        buttonBuilder(ModBlocks.EBONY_PLANKS_BUTTON.get(), Ingredient.of(ModBlocks.EBONY_PLANKS.get())).group("ebony")
                .unlockedBy("has_ebony_planks", has(ModBlocks.EBONY_PLANKS.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.EBONY_PLANKS_PRESSURE_PLATE.get(), ModBlocks.EBONY_PLANKS.get());
        fenceBuilder(ModBlocks.EBONY_PLANKS_FENCE.get(), Ingredient.of(ModBlocks.EBONY_PLANKS.get())).group("ebony")
                .unlockedBy("has_ebony_planks", has(ModBlocks.EBONY_PLANKS.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.EBONY_PLANKS_FENCE_GATE.get(), Ingredient.of(ModBlocks.EBONY_PLANKS.get())).group("ebony")
                .unlockedBy("has_ebony_planks", has(ModBlocks.EBONY_PLANKS.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EBONY_PLANKS_WALL.get(), ModBlocks.EBONY_PLANKS.get());
        doorBuilder(ModBlocks.EBONY_PLANKS_DOOR.get(), Ingredient.of(ModBlocks.EBONY_PLANKS.get())).group("ebony")
                .unlockedBy("has_ebony_planks", has(ModBlocks.EBONY_PLANKS.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.EBONY_PLANKS_TRAPDOOR.get(), Ingredient.of(ModBlocks.EBONY_PLANKS.get())).group("ebony")
                .unlockedBy("has_ebony_planks", has(ModBlocks.EBONY_PLANKS.get())).save(recipeOutput);
        //---*[ Ebony Log ]*---
        stairBuilder(ModBlocks.EBONY_LOG_STAIRS.get(), Ingredient.of(ModBlocks.EBONY_LOG)).group("ebony")
                .unlockedBy("has_ebony_log", has(ModBlocks.EBONY_LOG)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EBONY_LOG_SLAB.get(), ModBlocks.EBONY_LOG.get());
        buttonBuilder(ModBlocks.EBONY_LOG_BUTTON.get(), Ingredient.of(ModBlocks.EBONY_LOG.get())).group("ebony")
                .unlockedBy("has_ebony_log", has(ModBlocks.EBONY_LOG.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.EBONY_LOG_PRESSURE_PLATE.get(), ModBlocks.EBONY_LOG.get());
        fenceBuilder(ModBlocks.EBONY_LOG_FENCE.get(), Ingredient.of(ModBlocks.EBONY_LOG.get())).group("ebony")
                .unlockedBy("has_ebony_log", has(ModBlocks.EBONY_LOG.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.EBONY_LOG_FENCE_GATE.get(), Ingredient.of(ModBlocks.EBONY_LOG.get())).group("ebony")
                .unlockedBy("has_ebony_log", has(ModBlocks.EBONY_LOG.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EBONY_LOG_WALL.get(), ModBlocks.EBONY_LOG.get());
        doorBuilder(ModBlocks.EBONY_LOG_DOOR.get(), Ingredient.of(ModBlocks.EBONY_LOG.get())).group("ebony")
                .unlockedBy("has_ebony_log", has(ModBlocks.EBONY_LOG.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.EBONY_LOG_TRAPDOOR.get(), Ingredient.of(ModBlocks.EBONY_LOG.get())).group("ebony")
                .unlockedBy("has_ebony_log", has(ModBlocks.EBONY_LOG.get())).save(recipeOutput);
        //---*[ Stripped Ebony Log ]*---
        stairBuilder(ModBlocks.STRIPPED_EBONY_LOG_STAIRS.get(), Ingredient.of(ModBlocks.STRIPPED_EBONY_LOG)).group("ebony")
                .unlockedBy("has_stripped_ebony_log", has(ModBlocks.STRIPPED_EBONY_LOG)).save(recipeOutput);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_EBONY_LOG_SLAB.get(), ModBlocks.STRIPPED_EBONY_LOG.get());
        buttonBuilder(ModBlocks.STRIPPED_EBONY_LOG_BUTTON.get(), Ingredient.of(ModBlocks.STRIPPED_EBONY_LOG.get())).group("ebony")
                .unlockedBy("has_stripped_ebony_log", has(ModBlocks.STRIPPED_EBONY_LOG.get())).save(recipeOutput);
        pressurePlate(recipeOutput, ModBlocks.STRIPPED_EBONY_LOG_PRESSURE_PLATE.get(), ModBlocks.STRIPPED_EBONY_LOG.get());
        fenceBuilder(ModBlocks.STRIPPED_EBONY_LOG_FENCE.get(), Ingredient.of(ModBlocks.STRIPPED_EBONY_LOG.get())).group("ebony")
                .unlockedBy("has_stripped_ebony_log", has(ModBlocks.STRIPPED_EBONY_LOG.get())).save(recipeOutput);
        fenceGateBuilder(ModBlocks.STRIPPED_EBONY_LOG_FENCE_GATE.get(), Ingredient.of(ModBlocks.STRIPPED_EBONY_LOG.get())).group("ebony")
                .unlockedBy("has_stripped_ebony_log", has(ModBlocks.STRIPPED_EBONY_LOG.get())).save(recipeOutput);
        wall(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_EBONY_LOG_WALL.get(), ModBlocks.STRIPPED_EBONY_LOG.get());
        doorBuilder(ModBlocks.STRIPPED_EBONY_LOG_DOOR.get(), Ingredient.of(ModBlocks.STRIPPED_EBONY_LOG.get())).group("ebony")
                .unlockedBy("has_stripped_ebony_log", has(ModBlocks.STRIPPED_EBONY_LOG.get())).save(recipeOutput);
        trapdoorBuilder(ModBlocks.STRIPPED_EBONY_LOG_TRAPDOOR.get(), Ingredient.of(ModBlocks.STRIPPED_EBONY_LOG.get())).group("ebony")
                .unlockedBy("has_ebony_planks", has(ModBlocks.STRIPPED_EBONY_LOG.get())).save(recipeOutput);
          //------------------*[ SMELTERS RECIPES]*-----------------
        itemSmelting(recipeOutput, NEW_CHARCOALS, RecipeCategory.MISC, Items.CHARCOAL, 0.15f, 200, "charcoal");

//        itemSmelting(recipeOutput, EBONY_SMELTABLES, RecipeCategory.MISC, ModItems.EBONY.get(), 0.25f, 200, "ebony");
//        itemBlasting(recipeOutput, EBONY_SMELTABLES, RecipeCategory.MISC, ModItems.EBONY.get(), 0.25f, 100, "ebony");
//        itemSmoking(recipeOutput, EBONY_SMELTABLES, RecipeCategory.MISC, ModItems.EBONY.get(), 0.25f, 100, "ebony");
    }

    //------------------*[ SMELTING ]*------------------
    protected static void itemSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        itemCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }
    //------------------*[ BLASTING ]*------------------
//    protected static void itemBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
//                                      float pExperience, int pCookingTime, String pGroup) {
//        itemCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
//                pExperience, pCookingTime, pGroup, "_from_blasting");
//    }
    //------------------*[ SMOKING ]*------------------
    protected static void itemSmoking(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        itemCooking(recipeOutput, RecipeSerializer.SMOKING_RECIPE, SmokingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smoking");
    }

    protected static <T extends AbstractCookingRecipe> void itemCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, NatureUpdateMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
