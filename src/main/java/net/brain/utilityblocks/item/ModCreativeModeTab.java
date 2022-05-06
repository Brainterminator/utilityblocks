package net.brain.utilityblocks.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab UTILITY_BLOCKS_TAB = new CreativeModeTab("utilityblocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.UTILIUM.get());
        }
    };
}