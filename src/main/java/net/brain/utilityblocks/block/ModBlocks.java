package net.brain.utilityblocks.block;

import net.brain.utilityblocks.UtilityBlocks;
import net.brain.utilityblocks.item.ModCreativeModeTab;
import net.brain.utilityblocks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, UtilityBlocks.MOD_ID);

    public static final RegistryObject<Block> UTILIUM_BLOCK = registerBlock("utilium_block",
    () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
            .strength(0.5f)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> UTILIUM_ORE = registerBlock("utilium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(0.8f)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);

    public static final RegistryObject<Block> DEEPSLATE_UTILIUM_ORE = registerBlock("deepslate_utilium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f)),
            ModCreativeModeTab.UTILITY_BLOCKS_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
