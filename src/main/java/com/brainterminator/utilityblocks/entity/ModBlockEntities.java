package com.brainterminator.utilityblocks.entity;

import com.brainterminator.utilityblocks.UtilityBlocks;
import com.brainterminator.utilityblocks.entity.custom.AstralProjectorEntity;
import com.brainterminator.utilityblocks.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, UtilityBlocks.MOD_ID);

    public static final RegistryObject<BlockEntityType<AstralProjectorEntity>> ASTRAL_PROJECTOR_ENTITY =
            BLOCK_ENTITIES.register("gem_cutting_station_block_entity", () ->
                    BlockEntityType.Builder.of(AstralProjectorEntity::new,
                            ModBlocks.ASTRAL_PROJECTOR.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
