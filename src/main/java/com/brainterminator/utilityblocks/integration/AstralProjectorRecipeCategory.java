package com.brainterminator.utilityblocks.integration;

import com.brainterminator.utilityblocks.UtilityBlocks;
import com.brainterminator.utilityblocks.block.ModBlocks;
import com.brainterminator.utilityblocks.recipe.AstralProjectorRecipe;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.checkerframework.checker.guieffect.qual.UI;

import javax.annotation.Nonnull;

public class AstralProjectorRecipeCategory implements IRecipeCategory<AstralProjectorRecipe> {

    public static final ResourceLocation UID = new ResourceLocation(UtilityBlocks.MOD_ID, "astral_projection");
    public static final ResourceLocation TEXTURE = new ResourceLocation(UtilityBlocks.MOD_ID, "textures/gui/astral_projector_gui.png");
    private final IDrawable background;
    private final  IDrawable icon;

    public AstralProjectorRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(ModBlocks.ASTRAL_PROJECTOR.get()));
    }

    @Override
    public Component getTitle() {
        return new TextComponent("Astral Projector");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public ResourceLocation getUid() {
        return UID;
    }

    @Override
    public Class<? extends AstralProjectorRecipe> getRecipeClass() {
        return AstralProjectorRecipe.class;
    }

    @Override
    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull AstralProjectorRecipe recipe, @Nonnull IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 34, 43).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.INPUT, 57, 18).addIngredients(recipe.getIngredients().get(1));
        builder.addSlot(RecipeIngredientRole.INPUT, 103, 18).addIngredients(recipe.getIngredients().get(2));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 60).addItemStack(recipe.getResultItem());

    }
}
