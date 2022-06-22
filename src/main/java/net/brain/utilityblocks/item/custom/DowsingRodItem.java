package net.brain.utilityblocks.item.custom;

import net.brain.utilityblocks.item.ModItems;
import net.brain.utilityblocks.util.InventoryUtil;
import net.brain.utilityblocks.util.ModTags;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DowsingRodItem extends Item {
    public DowsingRodItem(Properties pProperties) {
        super(pProperties);
    }

    @Override

    public InteractionResult useOn(UseOnContext pContext) {
        if(true){
            BlockPos positionClicked = pContext.getClickedPos();
            Player player =pContext.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= positionClicked.getY() + +64; i++) {
                Block blockBelow = pContext.getLevel().getBlockState(positionClicked.below(i)).getBlock();

                if(isValuableBlock(blockBelow)) {
                    if(pContext.getLevel().isClientSide())outputValuableCoordinates(positionClicked.below(i), player, blockBelow);
                    foundBlock = true;

                    if(InventoryUtil.hasPlayerStackInInventory(player, ModItems.UTILIUM_RUNE.get())) {
                        addNbtToDataTablet(player, positionClicked.below(i), blockBelow);
                    }

                    break;
                }
            }
            if(!foundBlock && pContext.getLevel().isClientSide()) {
                player.sendMessage(new TranslatableComponent("item.utilityblocks.dowsing_rod.no_valuables"),
                        player.getUUID());
            }
        }
        pContext.getItemInHand().hurtAndBreak(1,pContext.getPlayer(),
                (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return super.useOn(pContext);
    }

    private void outputValuableCoordinates(BlockPos blockPos, Player player, Block blockBelow) {
        player.sendMessage(new TextComponent("Found " + blockBelow.asItem().getRegistryName().toString() + " at " +
                "(" + blockPos.getX() + "," + blockPos.getY() + "," + blockPos.getZ() + ")"), player.getUUID());
    }

    private boolean isValuableBlock(Block block){
        return Registry.BLOCK.getHolderOrThrow(Registry.BLOCK.getResourceKey(block).get()).is(ModTags.Blocks.DOWSING_ROD_VALUABLES);
    }

    private void addNbtToDataTablet(Player player, BlockPos pos, Block blockBelow) {
        ItemStack dataTablet =
                player.getInventory().getItem(InventoryUtil.getFirstInventoryIndex(player, ModItems.UTILIUM_RUNE.get()));

        if(!dataTablet.hasTag()) {
            CompoundTag nbtData = new CompoundTag();
            nbtData.putString("utilityblocks.last_ore", "Found " + blockBelow.asItem().getRegistryName().toString() + " at (" +
                    pos.getX() + ", " + pos.getY() + ", " + pos.getZ() + ")");

            dataTablet.setTag(nbtData);
        }
        else{
            CompoundTag nbtData = dataTablet.getTag();
            nbtData.putString("utilityblocks.last_ore", "Found " + blockBelow.asItem().getRegistryName().toString() + " at (" +
                    pos.getX() + ", " + pos.getY() + ", " + pos.getZ() + ")");

            dataTablet.setTag(nbtData);
        }
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent("tooltip.utilityblocks.dowsing_rod.tooltip.shift"));
        } else {
            pTooltipComponents.add(new TranslatableComponent("tooltip.utilityblocks.dowsing_rod.tooltip"));
        }
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 200;
    }
}
