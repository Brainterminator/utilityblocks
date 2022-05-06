package net.brain.utilityblocks.item;

import net.brain.utilityblocks.UtilityBlocks;
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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
