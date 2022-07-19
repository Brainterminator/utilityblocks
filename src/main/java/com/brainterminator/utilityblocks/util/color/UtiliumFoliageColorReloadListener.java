package com.brainterminator.utilityblocks.util.color;

import java.io.IOException;

import net.minecraft.client.resources.LegacyStuffWrapper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimplePreparableReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;

public class UtiliumFoliageColorReloadListener extends SimplePreparableReloadListener<int[]> {
    private static final ResourceLocation LOCATION = new ResourceLocation("utilityblocks:textures/colormap/utilium_foliage.png");

    /**
     * Performs any reloading that can be done off-thread, such as file IO
     */
    protected int[] prepare(ResourceManager pResourceManager, ProfilerFiller pProfiler) {
        try {
            return LegacyStuffWrapper.getPixels(pResourceManager, LOCATION);
        } catch (IOException ioexception) {
            throw new IllegalStateException("Failed to load foliage color texture", ioexception);
        }
    }

    protected void apply(int[] pObject, ResourceManager pResourceManager, ProfilerFiller pProfiler) {
        ModFoliageColor.init(pObject);
    }
}