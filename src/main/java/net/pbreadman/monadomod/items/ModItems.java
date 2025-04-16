package net.pbreadman.monadomod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pbreadman.monadomod.MonadoMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MonadoMod.MOD_ID);

    public static final DeferredItem<SwordItem> MONADO = ITEMS.register("monado",
            () -> new SwordItem(ModToolTiers.MONADO, new Item
                    .Properties()
                    .fireResistant()
                    .attributes(SwordItem.createAttributes(ModToolTiers.MONADO, 3, 2F))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
