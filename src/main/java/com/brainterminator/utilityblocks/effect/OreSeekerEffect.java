package com.brainterminator.utilityblocks.effect;

import com.brainterminator.utilityblocks.item.ModItems;
import com.brainterminator.utilityblocks.sound.ModSounds;
import com.brainterminator.utilityblocks.util.InventoryUtil;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public class OreSeekerEffect extends MobEffect {
    protected OreSeekerEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        if(pLivingEntity instanceof Player player){
            if(InventoryUtil.hasPlayerStackInInventory(player, ModItems.UTILIUM_RUNE.get())){
                ItemStack dataTablet =
                        player.getInventory().getItem(InventoryUtil.getFirstInventoryIndex(player, ModItems.UTILIUM_RUNE.get()));

                if(dataTablet.hasTag()) {
                    if(dataTablet.getTag().contains("utilityblocks.last_ore")) {
                        CompoundTag nbtData = dataTablet.getTag();
                        player.teleportTo(
                                Integer.parseInt(nbtData.getString("utilityblocks.last_ore_x")),
                                Integer.parseInt(nbtData.getString("utilityblocks.last_ore_y")),
                                Integer.parseInt(nbtData.getString("utilityblocks.last_ore_z"))
                        );
                    }
                }
                else{
                    pLivingEntity.playSound(ModSounds.DOWSING_ROD_FOUND_ORE.get(),1,1);
                }
            }
        }
        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }


}
