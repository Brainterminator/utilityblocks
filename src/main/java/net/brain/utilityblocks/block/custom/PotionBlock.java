package net.brain.utilityblocks.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class PotionBlock extends Block {
    MobEffect mobEffect;
    int duration;
    int amplifier;
    public PotionBlock(Properties properties, MobEffect effect, int pDuration, int pAmplifier) {
        super(properties);
        mobEffect=effect;
        duration=pDuration;
        amplifier=pAmplifier;
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if(!pLevel.isClientSide()) {
            if(pEntity instanceof LivingEntity) {
                LivingEntity livingEntity = ((LivingEntity) pEntity);
                livingEntity.addEffect(new MobEffectInstance(mobEffect, duration, amplifier));
            }
        }


        super.stepOn(pLevel, pPos, pState, pEntity);
    }
}