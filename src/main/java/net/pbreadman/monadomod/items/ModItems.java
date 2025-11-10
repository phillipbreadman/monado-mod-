package net.pbreadman.monadomod.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pbreadman.monadomod.MonadoMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MonadoMod.MOD_ID);

    //enchant and buster should start on it. not there yet
    public static final DeferredItem<SwordItem> MONADO = ITEMS.register("monado",
            () -> new SwordItem(ModToolTiers.MONADO, new Item
                    .Properties()
                    .fireResistant()
                    .attributes(SwordItem.createAttributes(ModToolTiers.MONADO, 1, -2.4F))));

    public static final DeferredItem<Item> MONADO_ART_TEMPLATE = ITEMS.register("monado_art_template",
            () -> new Item(new Item.Properties(/*SmithingTemplateItem.createMonadoTemplate()*/)));

    public static final DeferredItem<Item> ART_SHIELD = ITEMS.register("art_shield",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ART_ARMOUR = ITEMS.register("art_armour",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ART_SPEED = ITEMS.register("art_speed",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ART_ENCHANT = ITEMS.register("art_enchant",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ART_BUSTER = ITEMS.register("art_buster",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ART_CYCLONE = ITEMS.register("art_cyclone",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ART_EATER = ITEMS.register("art_eater",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ART_PURGE = ITEMS.register("art_purge",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
