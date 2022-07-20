package com.brainterminator.utilityblocks.integration;

import com.brainterminator.utilityblocks.UtilityBlocks;
import com.brainterminator.utilityblocks.recipe.AstralProjectorRecipe;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;
import java.util.Objects;

@JeiPlugin
public class JEIUtilityblocksPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(UtilityBlocks.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                AstralProjectorRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
        List<AstralProjectorRecipe> recipes = rm.getAllRecipesFor(AstralProjectorRecipe.Type.INSTANCE);
        registration.addRecipes(new RecipeType<>(AstralProjectorRecipeCategory.UID, AstralProjectorRecipe.class), recipes);
    }
}
