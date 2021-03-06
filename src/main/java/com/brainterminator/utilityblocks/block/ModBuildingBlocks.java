package com.brainterminator.utilityblocks.block;

import com.brainterminator.utilityblocks.UtilityBlocks;
import com.brainterminator.utilityblocks.block.custom.ConnectableLampWallBlock;
import com.brainterminator.utilityblocks.block.custom.ConnectableLeafWallBlock;
import com.brainterminator.utilityblocks.block.custom.ConnectableWallBlock;
import com.brainterminator.utilityblocks.block.custom.ModWallBlock;
import com.brainterminator.utilityblocks.item.ModCreativeModeTab;
import com.brainterminator.utilityblocks.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class ModBuildingBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, UtilityBlocks.MOD_ID);



    // VANILLA RESSOURCE WALLS - STONES

    public static final RegistryObject<Block> CONNECTABLE_STONE_WALL = registerBlock("connectable_stone_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_COBBLESTONE_WALL = registerBlock("connectable_cobblestone_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f)
                            .explosionResistance(6f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_DEEPSLATE_WALL = registerBlock("connectable_deepslate_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f)
                            .explosionResistance(6f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_COBBLED_DEEPSLATE_WALL = registerBlock("connectable_cobbled_deepslate_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f)
                            .explosionResistance(6f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_POLISHED_DEEPSLATE_WALL = registerBlock("connectable_polished_deepslate_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(2f)
                            .explosionResistance(6f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_GRANITE_WALL = registerBlock("connectable_granite_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_POLISHED_GRANITE_WALL = registerBlock("connectable_polished_granite_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_DIORITE_WALL = registerBlock("connectable_diorite_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_POLISHED_DIORITE_WALL = registerBlock("connectable_polished_diorite_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_ANDESITE_WALL = registerBlock("connectable_andesite_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_POLISHED_ANDESITE_WALL = registerBlock("connectable_polished_andesite_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.STONE)
                            .strength(1.5f)
                            .explosionResistance(6f)
                            .requiresCorrectToolForDrops()
                            .sound(SoundType.STONE)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    // VANILLA RESSOURCE WALLS - WOODS

    public static final RegistryObject<Block> CONNECTABLE_OAK_PLANK_WALL = registerBlock("connectable_oak_plank_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(2f)
                            .explosionResistance(3f)
                            .sound(SoundType.WOOD)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_SPRUCE_PLANK_WALL = registerBlock("connectable_spruce_plank_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(2f)
                            .explosionResistance(3f)
                            .sound(SoundType.WOOD)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_BIRCH_PLANK_WALL = registerBlock("connectable_birch_plank_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(2f)
                            .explosionResistance(3f)
                            .sound(SoundType.WOOD)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_JUNGLE_PLANK_WALL = registerBlock("connectable_jungle_plank_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(2f)
                            .explosionResistance(3f)
                            .sound(SoundType.WOOD)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_ACACIA_PLANK_WALL = registerBlock("connectable_acacia_plank_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(2f)
                            .explosionResistance(3f)
                            .sound(SoundType.WOOD)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_DARK_OAK_PLANK_WALL = registerBlock("connectable_dark_oak_plank_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(2f)
                            .explosionResistance(3f)
                            .sound(SoundType.WOOD)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_CRIMSON_PLANK_WALL = registerBlock("connectable_crimson_plank_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(2f)
                            .explosionResistance(3f)
                            .sound(SoundType.WOOD)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_WARPED_PLANK_WALL = registerBlock("connectable_warped_plank_wall",
            () -> new ConnectableWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(2f)
                            .explosionResistance(3f)
                            .sound(SoundType.WOOD)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    // VANILLA RESSOURCE WALLS - SPECIAL

    public static final RegistryObject<Block> CONNECTABLE_SEA_LANTERN_WALL = registerBlock("connectable_sea_lantern_wall",
            () -> new ConnectableLampWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD)
                            .strength(0.3f)
                            .explosionResistance(0.3f)
                            .lightLevel((state) -> state.getValue(ConnectableLampWallBlock.CLICKED) ? 15 : 0)
                            .sound(SoundType.GLASS)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> CONNECTABLE_OAK_LEAF_WALL = registerBlock("connectable_oak_leaf_wall",
            () -> new ConnectableLeafWallBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.LEAVES)
                            .strength(0.2f)
                            .explosionResistance(0.2f)
                            .sound(SoundType.GRASS)
                            .noOcclusion()
            ),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);


    // ADITIONAL GLASS STUFF

    public static final RegistryObject<Block> GLASS_BUTTON = registerBlock("glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
                    .noCollission()),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> GLASS_PRESSURE_PLATE = registerBlock("glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(0.3f)
                    .sound(SoundType.GLASS)),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> GLASS_DOOR = registerBlock("glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
                    .noOcclusion()),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> GLASS_TRAPDOOR = registerBlock("glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
                    .noOcclusion()),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);

    public static final RegistryObject<Block> GLASS_WALL = registerBlock("glass_wall",
            () -> new ModWallBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
                    .noOcclusion()),
            ModCreativeModeTab.BUILDING_BLOCKS_TAB);






    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab,
                                                                     String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)){
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

