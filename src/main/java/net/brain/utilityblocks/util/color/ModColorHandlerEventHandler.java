package net.brain.utilityblocks.util.color;

import net.brain.utilityblocks.block.ModBlocks;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.Level;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.api.distmarker.Dist;

@EventBusSubscriber(value = Dist.CLIENT, bus = Bus.MOD)
public class ModColorHandlerEventHandler {


    @SubscribeEvent
    public static void registerBlockColors(ColorHandlerEvent.Block event){
        event.getBlockColors().register((p_92626_, p_92627_, p_92628_, p_92629_) -> {
            return p_92627_ != null && p_92628_ != null ?
                    ModFoliageColor.getDefaultColor() : ModFoliageColor.getDefaultColor(); //Command in front of : ModFoliageColor.get(p_92627_,p_92628_)
        }, ModBlocks.UTILIUM_LEAVES.get());
    }

    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event){
        event.getItemColors().register(new ItemColor() {
            @Override
            public int getColor(ItemStack pStack, int pTintIndex) {
                return ModFoliageColor.getDefaultColor();
            }
        }, ModBlocks.UTILIUM_LEAVES.get());
    }
}