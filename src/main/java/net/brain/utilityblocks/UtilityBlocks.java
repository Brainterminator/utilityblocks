package net.brain.utilityblocks;

import com.mojang.logging.LogUtils;
import net.brain.utilityblocks.block.ModBlocks;
import net.brain.utilityblocks.block.ModBuildingBlocks;
import net.brain.utilityblocks.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(UtilityBlocks.MOD_ID)
public class UtilityBlocks
{
    public static final String MOD_ID = "utilityblocks";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public UtilityBlocks()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModBuildingBlocks.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }


    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_WALL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_BUTTON.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_PRESSURE_PLATE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_TRAPDOOR.get(), RenderType.translucent());

    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }


}
