package com.sworip.natureupdate.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties TOMATO = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).build();
    public static final FoodProperties CORN = new FoodProperties.Builder().nutrition(4).saturationModifier(0.3f).build();
    public static final FoodProperties BROCCOLI = new FoodProperties.Builder().nutrition(6).saturationModifier(0.5f).build();

//    public static final FoodProperties BROCCOLI = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
//            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.35f).build();
}