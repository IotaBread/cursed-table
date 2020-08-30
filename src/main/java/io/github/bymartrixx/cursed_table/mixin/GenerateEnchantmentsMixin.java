package io.github.bymartrixx.cursed_table.mixin;

import java.util.List;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.EnchantmentScreenHandler;

@Mixin(EnchantmentScreenHandler.class)
public abstract class GenerateEnchantmentsMixin {
    @Redirect(at = @At(value = "INVOKE", target = "Lnet/minecraft/enchantment/EnchantmentHelper;generateEnchantments(Ljava/util/Random;Lnet/minecraft/item/ItemStack;IZ)Ljava/util/List;"), method = "generateEnchantments")
    private List<EnchantmentLevelEntry> genEnchantment(Random random, ItemStack item, int lvl, boolean treasures) {
        return EnchantmentHelper.generateEnchantments(random, item, lvl, true);
    }
}