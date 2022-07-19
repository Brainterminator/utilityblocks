package com.brainterminator.utilityblocks.event;

import com.brainterminator.utilityblocks.event.loot.DowsingRodInVillageAdditionModifier;
import com.brainterminator.utilityblocks.event.loot.MelonSeedsFromGrassAdditionModifier;
import com.brainterminator.utilityblocks.event.loot.UtiliumFragmentsFromZombieAdditionModifier;
import com.brainterminator.utilityblocks.UtilityBlocks;
import com.brainterminator.utilityblocks.recipe.AstralProjectorRecipe;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = UtilityBlocks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new MelonSeedsFromGrassAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(UtilityBlocks.MOD_ID,"melon_seeds_from_grass")),
                new DowsingRodInVillageAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(UtilityBlocks.MOD_ID,"dowsing_rod_in_village")),
                new UtiliumFragmentsFromZombieAdditionModifier.Serializer().setRegistryName
                        (new ResourceLocation(UtilityBlocks.MOD_ID,"utilium_fragments_from_zombie"))
        );
    }

    @SubscribeEvent
    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
        Registry.register(Registry.RECIPE_TYPE, AstralProjectorRecipe.Type.ID, AstralProjectorRecipe.Type.INSTANCE);
    }
}