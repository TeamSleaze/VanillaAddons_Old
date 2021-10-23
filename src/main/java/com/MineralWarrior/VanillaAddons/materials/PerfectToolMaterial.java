package com.MineralWarrior.VanillaAddons.materials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class PerfectToolMaterial implements ToolMaterial {
    
    @Override
    public int getDurability() {
        return 3592;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9.75f;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 5;
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    }

}
