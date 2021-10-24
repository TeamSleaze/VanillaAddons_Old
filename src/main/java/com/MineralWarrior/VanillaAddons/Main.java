package com.MineralWarrior.VanillaAddons;

import com.MineralWarrior.VanillaAddons.registry.ModBlocks;
import com.MineralWarrior.VanillaAddons.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Main implements ModInitializer {

    public static final String MOD_ID = "vanillaaddons";

    //GROUPS
    public static final ItemGroup GENERAL_GROUP = FabricItemGroupBuilder.create(
            new Identifier(Main.MOD_ID, "general"))
            .icon(() -> new ItemStack(ModItems.GEMSTONE))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModItems.GEMSTONE));
                stacks.add(new ItemStack(ModBlocks.GEMSTONE_ORE));
            })
            .build();

    public static final ItemGroup TOOLS_GROUP = FabricItemGroupBuilder.create(
            new Identifier(Main.MOD_ID, "tools"))
            .icon(() -> new ItemStack(ModItems.FLAWLESS_NETHERITE_PICKAXE))
            .appendItems(stacks -> {
                //SWORDS
                stacks.add(new ItemStack(ModItems.ROUGH_NETHERITE_SWORD));
                stacks.add(new ItemStack(ModItems.FLAWED_NETHERITE_SWORD));
                stacks.add(new ItemStack(ModItems.FINE_NETHERITE_SWORD));
                stacks.add(new ItemStack(ModItems.FLAWLESS_NETHERITE_SWORD));
                stacks.add(new ItemStack(ModItems.PERFECT_NETHERITE_SWORD));
                //PICKAXES
                stacks.add(new ItemStack(ModItems.ROUGH_NETHERITE_PICKAXE));
                stacks.add(new ItemStack(ModItems.FLAWED_NETHERITE_PICKAXE));
                stacks.add(new ItemStack(ModItems.FINE_NETHERITE_PICKAXE));
                stacks.add(new ItemStack(ModItems.FLAWLESS_NETHERITE_PICKAXE));
                stacks.add(new ItemStack(ModItems.PERFECT_NETHERITE_PICKAXE));
                //AXES
                stacks.add(new ItemStack(ModItems.ROUGH_NETHERITE_AXE));
                stacks.add(new ItemStack(ModItems.FLAWED_NETHERITE_AXE));
                stacks.add(new ItemStack(ModItems.FINE_NETHERITE_AXE));
                stacks.add(new ItemStack(ModItems.FLAWLESS_NETHERITE_AXE));
                stacks.add(new ItemStack(ModItems.PERFECT_NETHERITE_AXE));
                //SHOVELS
                stacks.add(new ItemStack(ModItems.ROUGH_NETHERITE_SHOVEL));
                stacks.add(new ItemStack(ModItems.FLAWED_NETHERITE_SHOVEL));
                stacks.add(new ItemStack(ModItems.FINE_NETHERITE_SHOVEL));
                stacks.add(new ItemStack(ModItems.FLAWLESS_NETHERITE_SHOVEL));
                stacks.add(new ItemStack(ModItems.PERFECT_NETHERITE_SHOVEL));
                //HOES
                stacks.add(new ItemStack(ModItems.ROUGH_NETHERITE_HOE));
                stacks.add(new ItemStack(ModItems.FLAWED_NETHERITE_HOE));
                stacks.add(new ItemStack(ModItems.FINE_NETHERITE_HOE));
                stacks.add(new ItemStack(ModItems.FLAWLESS_NETHERITE_HOE));
                stacks.add(new ItemStack(ModItems.PERFECT_NETHERITE_HOE));
            })
            .build();


    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerItems();
    }
}
