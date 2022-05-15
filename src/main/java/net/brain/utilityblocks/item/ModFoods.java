package net.brain.utilityblocks.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties RAW_TOASTY = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.3F).meat().build();
    public static final FoodProperties TOASTY = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.4F).meat().build();

    public static final FoodProperties TOASTY_SANDWICH = (new FoodProperties.Builder()).nutrition(6).saturationMod(1F).effect(new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 1), 1F).meat().build();

}
