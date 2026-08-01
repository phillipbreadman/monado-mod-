package net.pbreadman.xcweaponry.recipe;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pbreadman.xcweaponry.XCWeaponry;

public class ModRecipeSerializers {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, XCWeaponry.MOD_ID);

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<MonadoArtRecipe>> MONADO_ART =
            RECIPE_SERIALIZERS.register("monado_art", MonadoArtRecipe.Serializer::new);
}


