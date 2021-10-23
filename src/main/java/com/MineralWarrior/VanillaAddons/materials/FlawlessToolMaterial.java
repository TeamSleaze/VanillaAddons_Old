package com.MineralWarrior.VanillaAddons.materials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class FlawlessToolMaterial implements ToolMaterial {
    
    @Override
    public int getDurability() {
        return 2281;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9.5f;
    }

    @Override
    public float getAttackDamage() {
        return 0;
    }

    @Override
    public int getMiningLevel() {
        return 4;
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
