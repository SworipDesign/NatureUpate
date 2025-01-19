package com.sworip.natureupdate.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    //------------------*[ BERRY ]*------------------
    public static final FoodProperties GOJI_BERRY = new FoodProperties.Builder().nutrition(2).saturationModifier(0.15f).build();

//    public static final FoodProperties BROCCOLI = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
//            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.35f).build();
}