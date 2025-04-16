package net.pbreadman.monadomod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.pbreadman.monadomod.MonadoMod;

public class ModTags {
    public static class Items {

        public static final TagKey<Item> MONADO = createTag("monado");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MonadoMod.MOD_ID, name));
        }
    }



public static class Blocks {
    public static final TagKey<Block> NEEDS_MONADO = createTag("needs_monado");
    public static final TagKey<Block> INCORRECT_MONADO = createTag("incorrect_monado");

    private static TagKey<Block> createTag(String name) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MonadoMod.MOD_ID, name));
    }
}
}