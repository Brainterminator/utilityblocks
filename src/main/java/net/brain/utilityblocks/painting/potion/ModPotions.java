package net.brain.utilityblocks.painting.potion;

import net.brain.utilityblocks.UtilityBlocks;
import net.brain.utilityblocks.effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS
            = DeferredRegister.create(ForgeRegistries.POTIONS, UtilityBlocks.MOD_ID);

    public static final RegistryObject<Potion> ORE_SEEKER_POTION = POTIONS.register("ore_seeker_potion",
            () -> new Potion(new MobEffectInstance(ModEffects.ORE_SEEKER.get(),40,0)));

    public static final RegistryObject<Potion> BEER = POTIONS.register("beer",
            () -> new Potion(new MobEffectInstance(MobEffects.CONFUSION,2400,0)));

    public static void register(IEventBus eventBus) {
        POTIONS.register(eventBus);
    }
}
