package net.brain.utilityblocks.item.custom;

import net.brain.utilityblocks.block.ModBlocks;
import net.brain.utilityblocks.item.ModItems;
import net.brain.utilityblocks.sound.ModSounds;
import net.brain.utilityblocks.util.InventoryUtil;
import net.brain.utilityblocks.util.ModTags;
import net.minecraft.Util;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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
                    pContext.getLevel().playSound(player, positionClicked, ModSounds.DOWSING_ROD_FOUND_ORE.get(), SoundSource.BLOCKS, 1, 0.001f);

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
        player.sendMessage(new TextComponent(oreLocation(blockPos, WhichValuableBlock(blockBelow))), player.getUUID());
    }

    private boolean isValuableBlock(Block block){
        return Registry.BLOCK.getHolderOrThrow(Registry.BLOCK.getResourceKey(block).get()).is(ModTags.Blocks.DOWSING_ROD_VALUABLES);
    }
    private int WhichValuableBlock(Block block){
        if(block == Blocks.IRON_ORE || block == Blocks.DEEPSLATE_IRON_ORE) return 1;
        if(block == Blocks.GOLD_ORE || block == Blocks.DEEPSLATE_GOLD_ORE) return 2;
        if(block == Blocks.DIAMOND_ORE || block == Blocks.DEEPSLATE_DIAMOND_ORE) return 3;
        if(block == Blocks.LAPIS_ORE || block == Blocks.DEEPSLATE_LAPIS_ORE) return 4;
        if(block == Blocks.EMERALD_ORE || block == Blocks.DEEPSLATE_EMERALD_ORE) return 5;
        if(block == ModBlocks.UTILIUM_ORE.get() || block == ModBlocks.DEEPSLATE_UTILIUM_ORE.get()) return 6;
        return 0;
    }

    private void addNbtToDataTablet(Player player, BlockPos pos, Block blockBelow) {
        ItemStack dataTablet =
                player.getInventory().getItem(InventoryUtil.getFirstInventoryIndex(player, ModItems.UTILIUM_RUNE.get()));

        if(!dataTablet.hasTag()) {
            CompoundTag nbtData = new CompoundTag();
            nbtData.putString("utilityblocks.last_ore", oreLocation(pos, WhichValuableBlock(blockBelow)));
            nbtData.putString("utilityblocks.last_ore_x", String.valueOf(pos.getX()));
            nbtData.putString("utilityblocks.last_ore_y", String.valueOf(pos.getY()));
            nbtData.putString("utilityblocks.last_ore_z", String.valueOf(pos.getZ()));


            dataTablet.setTag(nbtData);
        }
        else{
            CompoundTag nbtData = dataTablet.getTag();
            nbtData.putString("utilityblocks.last_ore", oreLocation(pos, WhichValuableBlock(blockBelow)));
            nbtData.putString("utilityblocks.last_ore_x", String.valueOf(pos.getX()));
            nbtData.putString("utilityblocks.last_ore_y", String.valueOf(pos.getY()));
            nbtData.putString("utilityblocks.last_ore_z", String.valueOf(pos.getZ()));

            dataTablet.setTag(nbtData);
        }
    }

    public String oreLocation(BlockPos pos, int valuableID){
        if(valuableID==1){
            return "Found Iron Ore at " + "(" + pos.getX() + "," + pos.getY() + "," + pos.getZ() + ")";
        }
        if(valuableID==2){
            return "Found Gold Ore at " + "(" + pos.getX() + "," + pos.getY() + "," + pos.getZ() + ")";
        }
        if(valuableID==3){
            return "Found Diamond Ore at " + "(" + pos.getX() + "," + pos.getY() + "," + pos.getZ() + ")";
        }
        if(valuableID==4){
            return "Found Lapis Ore at " + "(" + pos.getX() + "," + pos.getY() + "," + pos.getZ() + ")";
        }
        if(valuableID==5){
            return "Found Emerald Ore at " + "(" + pos.getX() + "," + pos.getY() + "," + pos.getZ() + ")";
        }
        if(valuableID==6){
            return "Found Utilium Ore at " + "(" + pos.getX() + "," + pos.getY() + "," + pos.getZ() + ")";
        }
        return "";

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
