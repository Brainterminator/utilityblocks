package net.brain.utilityblocks.util.color;

import net.minecraft.server.packs.resources.ReloadableResourceManager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientReloadListenersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRegisterClientReloadListenersEvent {
    @SubscribeEvent
    public static void registerUtiliumFoliage(RegisterClientReloadListenersEvent event){
        event.registerReloadListener(new UtiliumFoliageColorReloadListener());
    }
}
