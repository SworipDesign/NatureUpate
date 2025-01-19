package com.sworip.natureupdate.worldgen.tree;

import com.sworip.natureupdate.NatureUpdateMod;
import com.sworip.natureupdate.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower EBONY = new TreeGrower(NatureUpdateMod.MOD_ID + ":ebony",
            Optional.empty(), Optional.of(ModConfiguredFeatures.EBONY_KEY), Optional.empty());
    public static final TreeGrower PINE = new TreeGrower(NatureUpdateMod.MOD_ID + ":pine",
            Optional.empty(), Optional.of(ModConfiguredFeatures.PINE_KEY), Optional.empty());
}
