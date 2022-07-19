package com.brainterminator.utilityblocks.world.feature;

import com.brainterminator.utilityblocks.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_UTILIUM_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.UTILIUM_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_UTILIUM_ORE.get().defaultBlockState()));

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> UTILIUM_ORE = FeatureUtils.register("utilium_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_UTILIUM_ORES, 9));

    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> UTILIUM_TREE =
            FeatureUtils.register("utilium", Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                    BlockStateProvider.simple(ModBlocks.UTILIUM_LOG.get()),
                    new StraightTrunkPlacer( 3, 2, 2),
                    BlockStateProvider.simple(ModBlocks.UTILIUM_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0),3),
                    new TwoLayersFeatureSize(1,0,2)).build());

    public static final Holder<PlacedFeature> UTILIUM_CHECKED =
            PlacementUtils.register("utilium_checked", UTILIUM_TREE, PlacementUtils.filteredByBlockSurvival(ModBlocks.UTILIUM_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> UTILIUM_SPAWN =
            FeatureUtils.register("ebony_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(UTILIUM_CHECKED,
                            0.5F)), UTILIUM_CHECKED));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> LAVENDER =
            FeatureUtils.register("flower_lavender", Feature.FLOWER,
                    new RandomPatchConfiguration(32, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.LAVENDER.get())))));
}
