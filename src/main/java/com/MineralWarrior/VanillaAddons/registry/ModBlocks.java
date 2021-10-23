package com.MineralWarrior.VanillaAddons.registry;

import com.MineralWarrior.VanillaAddons.Main;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    //BLOCKS
    public static final Block GEMSTONE_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 4)
            .requiresTool()
            .strength(15,600)
            .sounds(BlockSoundGroup.DEEPSLATE)
    );


    //REGISTER BLOCKS
    public static void registerItems() {
        Registry.register(Registry.BLOCK, new Identifier(Main.MOD_ID, "gemstone_ore"), GEMSTONE_ORE);
    }
}
