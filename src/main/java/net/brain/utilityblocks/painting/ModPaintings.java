package net.brain.utilityblocks.painting;

import net.brain.utilityblocks.UtilityBlocks;
import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<Motive> PAINTING_MOTIVES =
            DeferredRegister.create(ForgeRegistries.PAINTING_TYPES, UtilityBlocks.MOD_ID);

    public static final RegistryObject<Motive> DJIMMI =
             PAINTING_MOTIVES.register("djimmi", () -> new Motive(32,32));


    public static void register(IEventBus eventBus){
        PAINTING_MOTIVES.register(eventBus);
    }
}
