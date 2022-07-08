package net.brain.utilityblocks.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> UTILIUM_ORE_PLACED = PlacementUtils.register("utilium_ore_placed",
            ModConfiguredFeatures.UTILIUM_ORE, ModOrePlacement.commonOrePlacement(15,
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-80), VerticalAnchor.belowTop(80))));

    public static final Holder<PlacedFeature> UTILIUM_PLACED = PlacementUtils.register("utilium_placed",
            ModConfiguredFeatures.UTILIUM_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0,0.01f, 1)));
}
