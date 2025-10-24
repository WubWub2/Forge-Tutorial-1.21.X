package net.wubwub.tutorialmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties KOHLRABI = new FoodProperties.Builder().nutrition(1).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.JUMP, 400, 30), 1f).build();
}
