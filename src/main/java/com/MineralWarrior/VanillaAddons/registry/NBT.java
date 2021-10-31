package com.MineralWarrior.VanillaAddons.registry;

import com.MineralWarrior.VanillaAddons.Main;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;

public class NBT {

    public static void setLongNBT(ItemStack stack, String nbtKey, Integer defaultValue) {
        NbtCompound nbtCompound;

        if (stack.hasNbt()) {
            nbtCompound = stack.getNbt();
        } else {
            nbtCompound = new NbtCompound();
        }

        assert nbtCompound != null;
        if (nbtCompound.contains(nbtKey)) {
            nbtCompound.putLong(nbtKey, Main.blocksMined);
        } else {
            nbtCompound.putLong(nbtKey, defaultValue);
        }

    }

}
