package com.MineralWarrior.VanillaAddons.registry;

import com.MineralWarrior.VanillaAddons.Main;
import com.MineralWarrior.VanillaAddons.materials.*;
import com.MineralWarrior.VanillaAddons.registry.gemmed_items.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //ITEMS
    public static final Item GEMSTONE = new Item(new Item.Settings());

    //TOOL ITEMS
        //SWORD
    public static final ToolItem ROUGH_NETHERITE_SWORD = new GemmedSwordItem(new RoughToolMaterial());
    public static final ToolItem FLAWED_NETHERITE_SWORD = new GemmedSwordItem(new FlawedToolMaterial());
    public static final ToolItem FINE_NETHERITE_SWORD = new GemmedSwordItem(new FineToolMaterial());
    public static final ToolItem FLAWLESS_NETHERITE_SWORD = new GemmedSwordItem(new FlawlessToolMaterial());
    public static final ToolItem PERFECT_NETHERITE_SWORD = new GemmedSwordItem(new PerfectToolMaterial());
        //PICKAXES
    public static final ToolItem ROUGH_NETHERITE_PICKAXE = new GemmedPickaxeItem(new RoughToolMaterial());
    public static final ToolItem FLAWED_NETHERITE_PICKAXE = new GemmedPickaxeItem(new FlawedToolMaterial());
    public static final ToolItem FINE_NETHERITE_PICKAXE = new GemmedPickaxeItem(new FineToolMaterial());
    public static final ToolItem FLAWLESS_NETHERITE_PICKAXE = new GemmedPickaxeItem(new FlawlessToolMaterial());
    public static final ToolItem PERFECT_NETHERITE_PICKAXE = new GemmedPickaxeItem(new PerfectToolMaterial());
        //AXES
    public static final ToolItem ROUGH_NETHERITE_AXE = new GemmedAxeItem(new RoughToolMaterial());
    public static final ToolItem FLAWED_NETHERITE_AXE = new GemmedAxeItem(new FlawedToolMaterial());
    public static final ToolItem FINE_NETHERITE_AXE = new GemmedAxeItem(new FineToolMaterial());
    public static final ToolItem FLAWLESS_NETHERITE_AXE = new GemmedAxeItem(new FlawlessToolMaterial());
    public static final ToolItem PERFECT_NETHERITE_AXE = new GemmedAxeItem(new PerfectToolMaterial());
        //SHOVELS
    public static final ToolItem ROUGH_NETHERITE_SHOVEL = new GemmedShovelItem(new RoughToolMaterial());
    public static final ToolItem FLAWED_NETHERITE_SHOVEL = new GemmedShovelItem(new FlawedToolMaterial());
    public static final ToolItem FINE_NETHERITE_SHOVEL = new GemmedShovelItem(new FineToolMaterial());
    public static final ToolItem FLAWLESS_NETHERITE_SHOVEL = new GemmedShovelItem(new FlawlessToolMaterial());
    public static final ToolItem PERFECT_NETHERITE_SHOVEL = new GemmedShovelItem(new PerfectToolMaterial());
        //HOES
    public static final ToolItem ROUGH_NETHERITE_HOE = new GemmedHoeItem(new RoughToolMaterial());
    public static final ToolItem FLAWED_NETHERITE_HOE = new GemmedHoeItem(new FlawedToolMaterial());
    public static final ToolItem FINE_NETHERITE_HOE = new GemmedHoeItem(new FineToolMaterial());
    public static final ToolItem FLAWLESS_NETHERITE_HOE = new GemmedHoeItem(new FlawlessToolMaterial());
    public static final ToolItem PERFECT_NETHERITE_HOE = new GemmedHoeItem(new PerfectToolMaterial());



    //BLOCK ITEMS
    public static final BlockItem GEMSTONE_ORE = new BlockItem(ModBlocks.GEMSTONE_ORE, new Item.Settings());


    //REGISTER ITEMS
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gemstone"), GEMSTONE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gemstone_ore"), GEMSTONE_ORE);

        //SWORDS
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rough_netherite_sword"), ROUGH_NETHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "flawed_netherite_sword"), FLAWED_NETHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "fine_netherite_sword"), FINE_NETHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "flawless_netherite_sword"), FLAWLESS_NETHERITE_SWORD);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "perfect_netherite_sword"), PERFECT_NETHERITE_SWORD);
        //PICKAXES
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rough_netherite_pickaxe"), ROUGH_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "flawed_netherite_pickaxe"), FLAWED_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "fine_netherite_pickaxe"), FINE_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "flawless_netherite_pickaxe"), FLAWLESS_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "perfect_netherite_pickaxe"), PERFECT_NETHERITE_PICKAXE);
        //AXES
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rough_netherite_axe"), ROUGH_NETHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "flawed_netherite_axe"), FLAWED_NETHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "fine_netherite_axe"), FINE_NETHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "flawless_netherite_axe"), FLAWLESS_NETHERITE_AXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "perfect_netherite_axe"), PERFECT_NETHERITE_AXE);
        //SHOVELS
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rough_netherite_shovel"), ROUGH_NETHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "flawed_netherite_shovel"), FLAWED_NETHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "fine_netherite_shovel"), FINE_NETHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "flawless_netherite_shovel"), FLAWLESS_NETHERITE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "perfect_netherite_shovel"), PERFECT_NETHERITE_SHOVEL);
        //HOES
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rough_netherite_hoe"), ROUGH_NETHERITE_HOE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "flawed_netherite_hoe"), FLAWED_NETHERITE_HOE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "fine_netherite_hoe"), FINE_NETHERITE_HOE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "flawless_netherite_hoe"), FLAWLESS_NETHERITE_HOE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "perfect_netherite_hoe"), PERFECT_NETHERITE_HOE);
    }

}
