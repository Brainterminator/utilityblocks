package net.brain.utilityblocks.block;

import net.brain.utilityblocks.block.custom.ModWallBlock;
import net.brain.utilityblocks.block.custom.PotionBlock;
import net.brain.utilityblocks.UtilityBlocks;
import net.brain.utilityblocks.item.ModCreativeModeTab;
import net.brain.utilityblocks.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffects;
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

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, UtilityBlocks.MOD_ID);

    public static final RegistryObject<Block> UTILIUM_BLOCK = registerBlock("utilium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(5f)
                    .sound(SoundType.METAL)),
                ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> UTILIUM_ORE = registerBlock("utilium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(5f)
                    .sound(SoundType.STONE)),
                ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> DEEPSLATE_UTILIUM_ORE = registerBlock("deepslate_utilium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(9f)
                    .sound(SoundType.STONE)),
                ModCreativeModeTab.UTILITY_BLOCKS_TAB);




    public static final RegistryObject<Block> SPEEDUP_BLOCK_1 = registerBlock("speedup_block_1",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .friction(0.55f)
                    .strength(0.5f)
                    .sound(SoundType.STONE)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> SPEEDUP_BLOCK_2 = registerBlock("speedup_block_2",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .friction(0.50f)
                    .strength(0.5f)
                    .sound(SoundType.STONE)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> SPEEDUP_BLOCK_3 = registerBlock("speedup_block_3",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .friction(0.45f)
                    .strength(0.5f)
                    .sound(SoundType.STONE)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> SPEEDUP_BLOCK_4 = registerBlock("speedup_block_4",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .friction(0.40f)
                    .strength(0.5f)
                    .sound(SoundType.STONE)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> SPEEDUP_BLOCK_5 = registerBlock("speedup_block_5",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .friction(0.35f)
                    .strength(0.5f)
                    .sound(SoundType.STONE)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> SPEEDUP_BLOCK_6 = registerBlock("speedup_block_6",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .friction(0.30f)
                    .strength(0.5f)
                    .sound(SoundType.STONE)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);


    public static final RegistryObject<Block> SLINGSHOT_BLOCK_1 = registerBlock("slingshot_block_1",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .friction(5f)
                    .strength(1f)
                    .sound(SoundType.STONE)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB, "tooltip.utilityblocks.block.slingshot_block_1");


    public static final RegistryObject<Block> JUMPUP_BLOCK_1 = registerBlock("jumpup_block_1",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .jumpFactor( 2F)
                    .strength(0.5f)
                    .sound(SoundType.STONE)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> JUMPUP_BLOCK_2 = registerBlock("jumpup_block_2",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .jumpFactor( 2.5F)
                    .strength(0.5f)
                    .sound(SoundType.STONE)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> JUMPUP_BLOCK_3 = registerBlock("jumpup_block_3",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .jumpFactor( 3F)
                    .strength(0.5f)
                    .sound(SoundType.STONE)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> JUMPUP_BLOCK_4 = registerBlock("jumpup_block_4",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .jumpFactor( 3.5F)
                    .strength(0.5f)
                    .sound(SoundType.STONE)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> JUMPUP_BLOCK_5 = registerBlock("jumpup_block_5",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .jumpFactor( 4F)
                    .strength(0.5f)
                    .sound(SoundType.STONE)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> JUMPUP_BLOCK_6 = registerBlock("jumpup_block_6",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .jumpFactor( 4.5F)
                    .strength(0.5f)
                    .sound(SoundType.STONE)
                    .noOcclusion()),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);


/*
    public static final RegistryObject<Block> INVISIBILITY_BLOCK = registerBlock("invisibility_block",
            () -> new PotionBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5f)
                    ,MobEffects.INVISIBILITY,300,1),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> CONFUSION_BLOCK = registerBlock("confusion_block",
            () -> new PotionBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.5f)
                    ,MobEffects.CONFUSION,300,1),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);
*/

    public static final RegistryObject<Block> BEAMUP_BLOCK = registerBlock("beamup_block",
            () -> new PotionBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f)
                    .sound(SoundType.STONE)
                    ,MobEffects.LEVITATION,60,80),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB, "tooltip.utilityblocks.block.beamup_block");



    public static final RegistryObject<Block> UTILIUM_STAIRS = registerBlock("utilium_stairs",
            () -> new StairBlock(() -> ModBlocks.UTILIUM_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(5f)
                    .sound(SoundType.METAL)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> UTILIUM_SLAB = registerBlock("utilium_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(5f)
                    .sound(SoundType.METAL)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> UTILIUM_FENCE = registerBlock("utilium_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(5f)
                    .sound(SoundType.METAL)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> UTILIUM_FENCE_GATE = registerBlock("utilium_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(5f)
                    .sound(SoundType.METAL)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> UTILIUM_WALL = registerBlock("utilium_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(5f)
                    .sound(SoundType.METAL)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);


    public static final RegistryObject<Block> GLASS_BUTTON = registerBlock("glass_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
                    .noCollission()),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> GLASS_PRESSURE_PLATE = registerBlock("glass_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(0.3f)
                    .sound(SoundType.GLASS)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> GLASS_DOOR = registerBlock("glass_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
                    .noOcclusion()),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> GLASS_TRAPDOOR = registerBlock("glass_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.GLASS)
                   .strength(0.3f)
                  .sound(SoundType.GLASS)
                   .noOcclusion()),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> GLASS_WALL = registerBlock("glass_wall",
            () -> new ModWallBlock(BlockBehaviour.Properties.of(Material.GLASS)
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
                    .noOcclusion()),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);


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