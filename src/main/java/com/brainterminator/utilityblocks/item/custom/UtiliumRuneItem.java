package com.brainterminator.utilityblocks.item.custom;
import net.minecraft.Util;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public class UtiliumRuneItem extends Item {
    @Nullable
    private String descriptionId;
    public UtiliumRuneItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        //this.resetRune(pPlayer.getItemInHand(pUsedHand));
        return super.use(pLevel, pPlayer, pUsedHand);
    }

    @Override
    public boolean isFoil(ItemStack pStack) {
        if(pStack.hasTag()){
            return pStack.getTag().contains("utilityblocks.last_ore") || pStack.isEnchanted();
        }
        else return pStack.isEnchanted();
    }


    public void resetRune(ItemStack stack){
        if(stack.hasTag()) {
            stack.getTag().remove("utilityblocks.last_ore");
            stack.getTag().remove("utilityblocks.last_ore_x");
            stack.getTag().remove("utilityblocks.last_ore_y");
            stack.getTag().remove("utilityblocks.last_ore_z");
        }
    }


    /*
    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents,
                                TooltipFlag pIsAdvanced) {
        if(pStack.hasTag()) {
            String currentOre = pStack.getTag().getString("utilityblocks.last_ore");
            pTooltipComponents.add(new TextComponent(currentOre));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
    */

    @Override
    public Component getDescription() {
        return new TranslatableComponent(this.getDescriptionId());
    }

    @Override
    public String getDescriptionId() {
        return super.getDescriptionId();
    }

    @Override
    protected String getOrCreateDescriptionId() {
        if (this.descriptionId == null) {
            return "Utilium Rune";
        }

        return this.descriptionId;
    }

    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        if(pStack.hasTag()){
            this.setDescriptionId(pStack.getTag().getString("utilityblocks.last_ore"));
        } else this.setDescriptionId(Util.makeDescriptionId("item", Registry.ITEM.getKey(this)));
    }

    void setDescriptionId(String pDescriptionId){
        this.descriptionId = pDescriptionId;
    }
}