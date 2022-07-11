package net.brain.utilityblocks.effect;

import net.brain.utilityblocks.UtilityBlocks;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, UtilityBlocks.MOD_ID);

    public static final RegistryObject<MobEffect> ORE_SEEKER = MOB_EFFECTS.register("ore_seeker",
            () -> new OreSeekerEffect(MobEffectCategory.BENEFICIAL, 6553800));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
