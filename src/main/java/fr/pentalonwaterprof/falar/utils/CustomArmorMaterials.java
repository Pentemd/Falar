package fr.pentalonwaterprof.falar.utils;

import fr.pentalonwaterprof.falar.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum CustomArmorMaterials implements IArmorMaterial {
    AMETHYST_ARMOR("falar:amethyst", 28,new int[]{3,6,7,3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5f, 0.05f, () -> {
        return Ingredient.fromItems(ModItems.AMETHYST_INGOT.get());
    }),
    TITANE_ARMOR("falar:titane", 30, new int[]{3, 7, 8, 3}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,1.7f, 0.07f, () ->
            {return Ingredient.fromItems(ModItems.TITANE_INGOT.get());
    }),
    PALADIUM_ARMOR("falar:paladium", 35, new int[]{4, 7, 8 ,4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2f, 0.11f, () -> {
        return Ingredient.fromItems(ModItems.PALADIUM_INGOT.get());

    }),
    ENDIUM_ARMOR("falar:endium", 40, new int[]{5,8,9,5}, 35, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.5f, 0.15f, () -> {
        return Ingredient.fromItems(ModItems.ENDIUM_INGOT.get());
    }),
    PALADIUM_GREEN_ARMOR("falar:paladium_green", 45, new int[]{6, 8, 9, 6}, 40, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3f, 0.2f, () -> {
        return Ingredient.fromItems(ModItems.ENDIUM_NUGGET.get());
    });
    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairMaterial;

    CustomArmorMaterials(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    /**
     * Gets the percentage of knockback resistance provided by armor of the material.
     */


    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }



}



