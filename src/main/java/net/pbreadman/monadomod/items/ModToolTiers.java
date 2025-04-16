package net.pbreadman.monadomod.items;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.pbreadman.monadomod.util.ModTags;

public class ModToolTiers {
    public static final Tier MONADO = new SimpleTier(ModTags.Blocks.INCORRECT_MONADO,
            2031, 9.0F, 4.0F, 0, () -> Ingredient.of(Items.AMETHYST_SHARD));
}
