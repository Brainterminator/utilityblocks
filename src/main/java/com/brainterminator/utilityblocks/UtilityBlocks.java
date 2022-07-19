package com.brainterminator.utilityblocks;

import com.brainterminator.utilityblocks.item.ModItems;
import com.brainterminator.utilityblocks.potion.ModPotions;
import com.brainterminator.utilityblocks.recipe.ModRecipes;
import com.mojang.logging.LogUtils;
import com.brainterminator.utilityblocks.block.ModBlocks;
import com.brainterminator.utilityblocks.block.ModBuildingBlocks;
import com.brainterminator.utilityblocks.entity.ModBlockEntities;
import com.brainterminator.utilityblocks.effect.ModEffects;
import com.brainterminator.utilityblocks.painting.ModPaintings;
import com.brainterminator.utilityblocks.screen.AstralProjectorScreen;
import com.brainterminator.utilityblocks.screen.ModMenuTypes;
import com.brainterminator.utilityblocks.sound.ModSounds;
import com.brainterminator.utilityblocks.util.BetterBrewingRecipe;
import com.brainterminator.utilityblocks.util.ModItemProperties;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(UtilityBlocks.MOD_ID)
public class UtilityBlocks
{
    public static final String MOD_ID = "utilityblocks";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public UtilityBlocks()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.register(eventBus);
        ModItems.register(eventBus);
        ModBuildingBlocks.register(eventBus);

        ModPaintings.register(eventBus);
        ModSounds.register(eventBus);

        ModEffects.register(eventBus);
        ModPotions.register(eventBus);

        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        ModRecipes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }


    private void clientSetup(final FMLClientSetupEvent event) {
        ModItemProperties.addCustomItemProperties();

        ItemBlockRenderTypes.setRenderLayer(ModBuildingBlocks.GLASS_DOOR.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBuildingBlocks.GLASS_WALL.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBuildingBlocks.GLASS_BUTTON.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBuildingBlocks.GLASS_PRESSURE_PLATE.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(ModBuildingBlocks.GLASS_TRAPDOOR.get(), RenderType.translucent());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.LAVENDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_LAVENDER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.UTILIUM_PLANT.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.UTILIUM_LEAVES.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.UTILIUM_SAPLING.get(), RenderType.cutout());

        MenuScreens.register(ModMenuTypes.ASTRAL_PROJECTOR_MENU.get(), AstralProjectorScreen::new);

    }

    private void setup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LAVENDER.getId(), ModBlocks.POTTED_LAVENDER);

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    ModItems.UTILIUM_RUNE.get(), ModPotions.ORE_SEEKER_POTION.get()));

            BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.AWKWARD,
                    Items.WHEAT, ModPotions.BEER.get()));
        });
    }


}
