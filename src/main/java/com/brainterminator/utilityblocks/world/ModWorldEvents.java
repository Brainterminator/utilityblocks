package com.brainterminator.utilityblocks.world;

import com.brainterminator.utilityblocks.UtilityBlocks;
import com.brainterminator.utilityblocks.world.gen.ModFlowerGeneration;
import com.brainterminator.utilityblocks.world.gen.ModOreGeneration;
import com.brainterminator.utilityblocks.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = UtilityBlocks.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
        ModTreeGeneration.generateTrees(event);
        ModFlowerGeneration.generateFlowers(event);
    }
}
