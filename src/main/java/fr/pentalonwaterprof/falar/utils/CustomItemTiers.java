package fr.pentalonwaterprof.falar.utils;

import fr.pentalonwaterprof.falar.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

public enum CustomItemTiers implements IItemTier
{
    AMETHYST(2, 700, 7f,2, 15, new LazyValue<>(() -> {
        return Ingredient.fromItems(ModItems.AMETHYST_INGOT.get());
    })),
    TITANE(2, 850, 7.5f,3, 17, new LazyValue<>(() -> {
        return Ingredient.fromItems(ModItems.TITANE_INGOT.get());
    })),
    PALADIUM(3, 1000, 8.5f, 5, 20, new LazyValue<>( () -> {
        return Ingredient.fromItems(ModItems.PALADIUM_INGOT.get());
    })),
    ENDIUM(3, 1500, 9f, 6, 30, new LazyValue<>( () -> {
        return Ingredient.fromItems(ModItems.ENDIUM_INGOT.get());
    })),
    PALADIUM_GREEN(3, 1700, 9.5f, 7, 35, new LazyValue<>(() -> {
        return Ingredient.fromItems(ModItems.PALADIUM_GREEN_INGOT.get());
    }));


    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    CustomItemTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, LazyValue<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.getValue();
    }
}
