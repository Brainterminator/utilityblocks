package net.brain.utilityblocks.recipe;

import net.brain.utilityblocks.UtilityBlocks;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, UtilityBlocks.MOD_ID);

    public static final RegistryObject<RecipeSerializer<AstralProjectorRecipe>> ASTRAL_PROJECTION_SERIALIZER =
            SERIALIZERS.register("astral_projection", () -> AstralProjectorRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}