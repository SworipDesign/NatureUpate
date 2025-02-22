package com.sworip.natureupdate.block;

import com.sworip.natureupdate.NatureUpdateMod;
import com.sworip.natureupdate.block.crops.BroccoliCropBlock;
import com.sworip.natureupdate.block.crops.CornCropBlock;
import com.sworip.natureupdate.block.crops.TomatoCropBlock;
import com.sworip.natureupdate.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(NatureUpdateMod.MOD_ID);
    //------------------*[ CROPS ]*------------------
    public static final DeferredBlock<Block> TOMATO_CROP = BLOCKS.register("tomato_crop",
            () -> new TomatoCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
    public static final DeferredBlock<Block> CORN_CROP = BLOCKS.register("corn_crop",
            () -> new CornCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
    public static final DeferredBlock<Block> BROCCOLI_CROP = BLOCKS.register("broccoli_crop",
            () -> new BroccoliCropBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHEAT)));
    //------------------*[ WOODS ]*------------------
    public static final DeferredBlock<Block> EBONY_LOG = registerBlock("ebony_log",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops()
                    .strength(1f).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> STRIPPED_EBONY_LOG = registerBlock("stripped_ebony_log",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops()
                    .strength(1f).ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> EBONY_PLANKS = registerBlock("ebony_planks",
            () -> new Block(BlockBehaviour.Properties.of().requiresCorrectToolForDrops()
                    .strength(1f).ignitedByLava().sound(SoundType.WOOD)));
    //---*[ Ebony Planks Non Blocks ]*---
    public static final DeferredBlock<StairBlock> EBONY_PLANKS_STAIRS = registerBlock("ebony_planks_stairs",
            () -> new StairBlock(ModBlocks.EBONY_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of()
                        .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> EBONY_PLANKS_SLAB = registerBlock("ebony_planks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<PressurePlateBlock> EBONY_PLANKS_PRESSURE_PLATE = registerBlock("ebony_planks_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.DARK_OAK, BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<ButtonBlock> EBONY_PLANKS_BUTTON = registerBlock("ebony_planks_button",
            () -> new ButtonBlock(BlockSetType.DARK_OAK, 20, BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().noCollission().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> EBONY_PLANKS_FENCE = registerBlock("ebony_planks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> EBONY_PLANKS_FENCE_GATE = registerBlock("ebony_planks_fence_gate",
            () -> new FenceGateBlock(WoodType.DARK_OAK, BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> EBONY_PLANKS_WALL = registerBlock("ebony_planks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<DoorBlock> EBONY_PLANKS_DOOR = registerBlock("ebony_planks_door",
            () -> new DoorBlock(BlockSetType.DARK_OAK, BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().noOcclusion().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<TrapDoorBlock> EBONY_PLANKS_TRAPDOOR = registerBlock("ebony_planks_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.DARK_OAK, BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().noOcclusion().ignitedByLava().sound(SoundType.WOOD)));

    //---*[ Ebony Log Non Blocks ]*---
    public static final DeferredBlock<StairBlock> EBONY_LOG_STAIRS = registerBlock("ebony_log_stairs",
            () -> new StairBlock(ModBlocks.EBONY_LOG.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> EBONY_LOG_SLAB = registerBlock("ebony_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<PressurePlateBlock> EBONY_LOG_PRESSURE_PLATE = registerBlock("ebony_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.DARK_OAK, BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<ButtonBlock> EBONY_LOG_BUTTON = registerBlock("ebony_log_button",
            () -> new ButtonBlock(BlockSetType.DARK_OAK, 20, BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().noCollission().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> EBONY_LOG_FENCE = registerBlock("ebony_log_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> EBONY_LOG_FENCE_GATE = registerBlock("ebony_log_fence_gate",
            () -> new FenceGateBlock(WoodType.DARK_OAK, BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> EBONY_LOG_WALL = registerBlock("ebony_log_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<DoorBlock> EBONY_LOG_DOOR = registerBlock("ebony_log_door",
            () -> new DoorBlock(BlockSetType.DARK_OAK, BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().noOcclusion().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<TrapDoorBlock> EBONY_LOG_TRAPDOOR = registerBlock("ebony_log_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.DARK_OAK, BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().noOcclusion().ignitedByLava().sound(SoundType.WOOD)));

    //---*[ Stripped Ebony Log Non Blocks ]*---
    public static final DeferredBlock<StairBlock> STRIPPED_EBONY_LOG_STAIRS = registerBlock("stripped_ebony_log_stairs",
            () -> new StairBlock(ModBlocks.STRIPPED_EBONY_LOG.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<SlabBlock> STRIPPED_EBONY_LOG_SLAB = registerBlock("stripped_ebony_log_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<PressurePlateBlock> STRIPPED_EBONY_LOG_PRESSURE_PLATE = registerBlock("stripped_ebony_log_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.DARK_OAK, BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<ButtonBlock> STRIPPED_EBONY_LOG_BUTTON = registerBlock("stripped_ebony_log_button",
            () -> new ButtonBlock(BlockSetType.DARK_OAK, 20, BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().noCollission().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceBlock> STRIPPED_EBONY_LOG_FENCE = registerBlock("stripped_ebony_log_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<FenceGateBlock> STRIPPED_EBONY_LOG_FENCE_GATE = registerBlock("stripped_ebony_log_fence_gate",
            () -> new FenceGateBlock(WoodType.DARK_OAK, BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<WallBlock> STRIPPED_EBONY_LOG_WALL = registerBlock("stripped_ebony_log_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<DoorBlock> STRIPPED_EBONY_LOG_DOOR = registerBlock("stripped_ebony_log_door",
            () -> new DoorBlock(BlockSetType.DARK_OAK, BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().noOcclusion().ignitedByLava().sound(SoundType.WOOD)));
    public static final DeferredBlock<TrapDoorBlock> STRIPPED_EBONY_LOG_TRAPDOOR = registerBlock("stripped_ebony_log_trapdoor",
            () -> new TrapDoorBlock(BlockSetType.DARK_OAK, BlockBehaviour.Properties.of()
                    .strength(1f).requiresCorrectToolForDrops().noOcclusion().ignitedByLava().sound(SoundType.WOOD)));

//    public static final DeferredBlock<Block> EBONY_ORE = registerBlock("ebony_ore",
//            () -> new DropExperienceBlock(UniformInt.of(2, 4),
//                    BlockBehaviour.Properties.of().strength(3f).requiresCorrectToolForDrops().sound(SoundType.STONE)));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}