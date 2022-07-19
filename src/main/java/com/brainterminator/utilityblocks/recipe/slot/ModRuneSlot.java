package com.brainterminator.utilityblocks.recipe.slot;

import com.brainterminator.utilityblocks.item.ModItems;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import org.jetbrains.annotations.NotNull;

public class ModRuneSlot extends SlotItemHandler {
    public ModRuneSlot(IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace(@NotNull ItemStack stack) {
        if(stack.is(ModItems.UTILIUM_RUNE.get())){
            return true;
        } else{
            return false;
        }
    }
}
