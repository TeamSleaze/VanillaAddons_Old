package com.MineralWarrior.VanillaAddons.materials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class FineToolMaterial implements ToolMaterial {

    @Override
    public int getDurability() {
        return 2162;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 9.25f;
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
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.NETHERITE_INGOT);
    }

}
