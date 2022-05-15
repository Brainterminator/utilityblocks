package net.brain.utilityblocks.item;

import net.brain.utilityblocks.UtilityBlocks;
import net.brain.utilityblocks.item.custom.DowsingRodItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, UtilityBlocks.MOD_ID);

    public static final RegistryObject<Item> UTILIUM = ITEMS.register("utilium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB)));

    public static final RegistryObject<Item> UTILIUM_FRAGMENTS = ITEMS.register("utilium_fragments",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB)));

    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB).durability(16)));

    public static final RegistryObject<Item> RAW_TOASTY = ITEMS.register("raw_toasty",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB).food(ModFoods.RAW_TOASTY)));

    public static final RegistryObject<Item> TOASTY = ITEMS.register("toasty",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB).food(ModFoods.TOASTY)));

    public static final RegistryObject<Item> TOASTY_SANDWICH = ITEMS.register("toasty_sandwich",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB).food(ModFoods.TOASTY_SANDWICH)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
