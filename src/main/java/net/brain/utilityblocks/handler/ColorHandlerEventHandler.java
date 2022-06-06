package net.brain.utilityblocks.handler;

import net.brain.utilityblocks.block.ModBuildingBlocks;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.FoliageColor;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.api.distmarker.Dist;

@EventBusSubscriber(value = Dist.CLIENT, bus = Bus.MOD)
public class ColorHandlerEventHandler {


    @SubscribeEvent
    public static void registerBlockColors(ColorHandlerEvent.Block event){
        event.getBlockColors().register((p_92626_, p_92627_, p_92628_, p_92629_) -> {
            return p_92627_ != null && p_92628_ != null ? BiomeColors.getAverageFoliageColor(p_92627_, p_92628_) : FoliageColor.getDefaultColor();
        }, ModBuildingBlocks.CONNECTABLE_OAK_LEAF_WALL.get());
    }

    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event){
        event.getItemColors().register(new ItemColor() {
            @Override
            public int getColor(ItemStack pStack, int pTintIndex) {
                return FoliageColor.getDefaultColor();
            }
        }, ModBuildingBlocks.CONNECTABLE_OAK_LEAF_WALL.get());
    }
}
