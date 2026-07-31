package net.pbreadman.monadomod.items.custom;

import net.minecraft.core.component.DataComponentType;
import net.minecraft.util.Unit;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pbreadman.monadomod.MonadoMod;

public class ModDataComponents {
    public static final DeferredRegister.DataComponents DATA_COMPONENTS =
            DeferredRegister.createDataComponents(MonadoMod.MOD_ID);

    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Unit>> UNLOCKED_ENCHANT =
            DATA_COMPONENTS.registerComponentType("unlocked_enchant", b -> b.persistent(Unit.CODEC));
    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Unit>> UNLOCKED_BUSTER =
            DATA_COMPONENTS.registerComponentType("unlocked_buster", b -> b.persistent(Unit.CODEC));
    public static final DeferredHolder<DataComponentType<?>, DataComponentType<Unit>> UNLOCKED_SHIELD =
            DATA_COMPONENTS.registerComponentType("unlocked_shield", b -> b.persistent(Unit.CODEC));
}