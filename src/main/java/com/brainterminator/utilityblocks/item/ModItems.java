package com.brainterminator.utilityblocks.item;

import com.brainterminator.utilityblocks.UtilityBlocks;
import com.brainterminator.utilityblocks.block.ModBlocks;
import com.brainterminator.utilityblocks.item.custom.UtiliumRuneItem;
import com.brainterminator.utilityblocks.item.custom.DowsingRodItem;
import com.brainterminator.utilityblocks.item.custom.ConfusionSwordItem;
import com.brainterminator.utilityblocks.item.custom.ModArmorItem;
import com.brainterminator.utilityblocks.sound.ModSounds;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, UtilityBlocks.MOD_ID);



    // RESOURCES


    public static final RegistryObject<Item> UTILIUM_FRAGMENTS = ITEMS.register("utilium_fragments",
            () -> new ItemNameBlockItem(ModBlocks.UTILIUM_PLANT.get(), new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB)));
    public static final RegistryObject<Item> UTILIUM = ITEMS.register("utilium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB)));


    // FOOD


    public static final RegistryObject<Item> RAW_TOASTY = ITEMS.register("raw_toasty",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB).food(ModFoods.RAW_TOASTY)));

    public static final RegistryObject<Item> TOASTY = ITEMS.register("toasty",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB).food(ModFoods.TOASTY)));

    public static final RegistryObject<Item> TOASTY_SANDWICH = ITEMS.register("toasty_sandwich",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB).food(ModFoods.TOASTY_SANDWICH)));


    //MISC



    public static final RegistryObject<Item> PYRAMID_PERIL_DISC = ITEMS.register("pyramid_peril_disc",
            () -> new RecordItem(4, ModSounds.PYRAMID_PERIL, new Item.Properties()
                    .stacksTo(1).tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB)));



    //TOOLS


    public static final RegistryObject<Item> UTILIUM_SWORD = ITEMS.register("utilium_sword",
            () -> new ConfusionSwordItem(ModTiers.UTILIUM, 3,-2.4F, new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB)));

    public static final RegistryObject<Item> UTILIUM_PICKAXE = ITEMS.register("utilium_pickaxe",
            () -> new PickaxeItem(ModTiers.UTILIUM, 1,-2.8f, new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB)));

    public static final RegistryObject<Item> UTILIUM_SHOVEL = ITEMS.register("utilium_shovel",
            () -> new ShovelItem(ModTiers.UTILIUM, 1.5f,-3.0f, new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB)));

    public static final RegistryObject<Item> UTILIUM_AXE = ITEMS.register("utilium_axe",
            () -> new AxeItem(ModTiers.UTILIUM, 6,-3.1f, new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB)));

    public static final RegistryObject<Item> UTILIUM_HOE = ITEMS.register("utilium_hoe",
            () -> new HoeItem(ModTiers.UTILIUM, -2,-1.0f, new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB)));

    public static final RegistryObject<Item> UTILIUM_BOW = ITEMS.register("utilium_bow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB).durability(1420)));

    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().durability(48).tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB)));

    public static final RegistryObject<Item> UTILIUM_RUNE = ITEMS.register("utilium_rune",
            () -> new UtiliumRuneItem(new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB).stacksTo(1)));


    //ARMOR


    public static final RegistryObject<Item> UTILIUM_HELMET = ITEMS.register("utilium_helmet",
            () -> new ModArmorItem(ModArmorMaterials.UTILIUM, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB)));

    public static final RegistryObject<Item> UTILIUM_CHESTPLATE = ITEMS.register("utilium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.UTILIUM, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB)));

    public static final RegistryObject<Item> UTILIUM_LEGGINGS = ITEMS.register("utilium_leggings",
            () -> new ArmorItem(ModArmorMaterials.UTILIUM, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB)));

    public static final RegistryObject<Item> UTILIUM_BOOTS = ITEMS.register("utilium_boots",
            () -> new ArmorItem(ModArmorMaterials.UTILIUM, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.UTILITY_BLOCKS_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
