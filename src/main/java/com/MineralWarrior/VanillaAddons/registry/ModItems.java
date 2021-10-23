package com.MineralWarrior.VanillaAddons.registry;

import com.MineralWarrior.VanillaAddons.Main;
import com.MineralWarrior.VanillaAddons.materials.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //ITEMS
    public static final Item GEMSTONE = new Item(new Item.Settings());

    //TOOL ITEMS
    public static final ToolItem ROUGH_NETHERITE_PICKAXE = new GemmedPickaxeItem(new RoughToolMaterial());
    public static final ToolItem FLAWED_NETHERITE_PICKAXE = new GemmedPickaxeItem(new FlawedToolMaterial());
    public static final ToolItem FINE_NETHERITE_PICKAXE = new GemmedPickaxeItem(new FineToolMaterial());
    public static final ToolItem FLAWLESS_NETHERITE_PICKAXE = new GemmedPickaxeItem(new FlawlessToolMaterial());
    public static final ToolItem PERFECT_NETHERITE_PICKAXE = new GemmedPickaxeItem(new PerfectToolMaterial());

    //BLOCK ITEMS
    public static final BlockItem GEMSTONE_ORE = new BlockItem(ModBlocks.GEMSTONE_ORE, new Item.Settings());


    //REGISTER ITEMS
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gemstone"), GEMSTONE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "gemstone_ore"), GEMSTONE_ORE);

        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "rough_netherite_pickaxe"), ROUGH_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "flawed_netherite_pickaxe"), FLAWED_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "fine_netherite_pickaxe"), FINE_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "flawless_netherite_pickaxe"), FLAWLESS_NETHERITE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(Main.MOD_ID, "perfect_netherite_pickaxe"), PERFECT_NETHERITE_PICKAXE);
    }

}
