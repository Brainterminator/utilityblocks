package com.brainterminator.utilityblocks.util.modcolor;

import net.minecraft.client.renderer.chunk.RenderChunkRegion;
import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.biome.Biome;

public class ModFoliageColor {
        private static int[] pixels = new int[65536];

        public static void init(int[] pFoliageBuffer) {
            pixels = pFoliageBuffer;
        }

        public static int get(BlockAndTintGetter btGetter, BlockPos pos) {
             if (btGetter instanceof  RenderChunkRegion renderChunkRegion){
                Level level = renderChunkRegion.level;
                var biome = level.getBiome(pos).value();
                return getBiomeBasedColor(biome);
            } else{
                return getDefaultColor();
            }
        }

        public static int getBiomeBasedColor(Biome biome){
            double pTemperature=(double) Mth.clamp(biome.climateSettings.temperature, 0.0F, 1.0F);
            double pHumidity=(double)Mth.clamp(biome.climateSettings.downfall, 0.0F, 1.0F);
            int i = (int)((1.0D - pTemperature) * 255.0D);
            int j = (int)((1.0D - pHumidity) * 255.0D);
            int k = j << 8 | i;
            return k >= pixels.length ? getDefaultColor() : pixels[k];
        }

        public static int getDefaultColor() {
            return 11075584;
        }
}
