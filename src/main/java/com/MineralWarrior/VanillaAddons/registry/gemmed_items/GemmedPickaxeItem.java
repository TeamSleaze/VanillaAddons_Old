package com.MineralWarrior.VanillaAddons.registry.gemmed_items;

import com.MineralWarrior.VanillaAddons.registry.ModItems;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GemmedPickaxeItem extends PickaxeItem {

    public GemmedPickaxeItem(ToolMaterial material) {
        super(material, 6, -2.8f, new Item.Settings());
    }


    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {

        if((ToolItem) this == ModItems.ROUGH_NETHERITE_PICKAXE) {
            tooltip.add(new TranslatableText("tooltip.vanillaaddons.rough").formatted(Formatting.GOLD));
            tooltip.add(new TranslatableText("tooltip.vanillaaddons.empty_line"));
        }
        else if ((ToolItem) this == ModItems.FLAWED_NETHERITE_PICKAXE) {
            tooltip.add(new TranslatableText("tooltip.vanillaaddons.flawed").formatted(Formatting.GOLD));
            tooltip.add(new TranslatableText("tooltip.vanillaaddons.empty_line"));
        }
        else if ((ToolItem) this == ModItems.FINE_NETHERITE_PICKAXE) {
            tooltip.add(new TranslatableText("tooltip.vanillaaddons.fine").formatted(Formatting.GOLD));
            tooltip.add(new TranslatableText("tooltip.vanillaaddons.empty_line"));
        }
        else if ((ToolItem) this == ModItems.FLAWLESS_NETHERITE_PICKAXE) {
            tooltip.add(new TranslatableText("tooltip.vanillaaddons.flawless").formatted(Formatting.GOLD));
            tooltip.add(new TranslatableText("tooltip.vanillaaddons.empty_line"));
        }
        else if ((ToolItem) this == ModItems.PERFECT_NETHERITE_PICKAXE) {
            tooltip.add(new TranslatableText("tooltip.vanillaaddons.perfect").formatted(Formatting.GOLD));
            tooltip.add(new TranslatableText("tooltip.vanillaaddons.empty_line"));
        }

        //COUNTER
        NbtCompound nbtCompound = stack.getNbt();

        if (nbtCompound.contains("minedBlocksCounter")) {
            tooltip.add(new TranslatableText("tooltip.vanillaaddons.counter.prefix").formatted(Formatting.GRAY));
            tooltip.add(new TranslatableText("tooltip.vanillaaddons.counter.number", nbtCompound.getLong("minedBlocksCounter")).formatted(Formatting.YELLOW));
        } else {
            nbtCompound = new NbtCompound();
        }



    }


}
