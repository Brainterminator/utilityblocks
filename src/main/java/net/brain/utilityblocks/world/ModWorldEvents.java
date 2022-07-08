package net.brain.utilityblocks.world;

import net.brain.utilityblocks.UtilityBlocks;
import net.brain.utilityblocks.world.gen.ModFlowerGeneration;
import net.brain.utilityblocks.world.gen.ModOreGeneration;
import net.brain.utilityblocks.world.gen.ModTreeGeneration;
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
