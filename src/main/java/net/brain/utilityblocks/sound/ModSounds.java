package net.brain.utilityblocks.sound;

import net.brain.utilityblocks.UtilityBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.CompassItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Random;

public class ModSounds {

    private static Random random = new Random();
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, UtilityBlocks.MOD_ID);

    public static final RegistryObject<SoundEvent> DOWSING_ROD_FOUND_ORE =
            registerSoundEvent("dowsing_rod_found_ore");

    public static final RegistryObject<SoundEvent> PYRAMID_PERIL =
            registerSoundEvent("pyramid_peril");

    public static final RegistryObject<SoundEvent> FLIP_SWITCH =
            registerSoundEvent("flip_switch");
    public static final RegistryObject<SoundEvent> UTILIUM_BREAK =
            registerSoundEvent("utilium_break");
    public static final RegistryObject<SoundEvent> UTILIUM_STEP =
            registerSoundEvent("utilium_step");
    public static final RegistryObject<SoundEvent> UTILIUM_PLACE =
            registerSoundEvent("utilium_place");
    public static final RegistryObject<SoundEvent> UTILIUM_HIT =
            registerSoundEvent("utilium_hit");
    public static final RegistryObject<SoundEvent> UTILIUM_FALL =
            registerSoundEvent("utilium_fall");

    public static final ForgeSoundType UTILIUM = new ForgeSoundType(1f, -2000, ModSounds.UTILIUM_BREAK,
            ModSounds.UTILIUM_STEP, ModSounds.UTILIUM_PLACE, ModSounds.UTILIUM_HIT, ModSounds.UTILIUM_FALL);
    public static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(UtilityBlocks.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
