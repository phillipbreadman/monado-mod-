package net.pbreadman.monadomod.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pbreadman.monadomod.MonadoMod;
import net.pbreadman.monadomod.items.custom.MonadoTemplate;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MonadoMod.MOD_ID);

    //enchant and buster should start on it. not there yet
    public static final DeferredItem<SwordItem> MONADO = ITEMS.register("monado",
            () -> new SwordItem(ModToolTiers.MONADO, new Item
                    .Properties()
                    .fireResistant()
                    .attributes(SwordItem.createAttributes(ModToolTiers.MONADO, 1, -2.4F))));

    private static Object MonadoTemplate;
    public static final DeferredItem<Item> MONADO_ART_TEMPLATE = ITEMS.register("monado_art_template",
            () -> new SmithingTemplateItem(MonadoTemplate(MonadoTemplate)));

    private static Component MonadoTemplate(Object monadoTemplate) {
        return null;
    }

    public static final DeferredItem<Item> ART_SHIELD = ITEMS.register("art_shield",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<MonadoShieldItem> MONADO_SHIELD = ITEMS.register("monado_shield",
            () -> new MonadoShieldItem(ModToolTiers.MONADO, 1,-2.4f, new Item
                    .Properties()
                    .fireResistant()
  ));


    public static final DeferredItem<Item> ART_ARMOUR = ITEMS.register("art_armour",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<MonadoArmourItem> MONADO_ARMOUR = ITEMS.register("monado_armour",
            () -> new MonadoArmourItem(ModToolTiers.MONADO, 1,-2.4f, new Item
                    .Properties()
                    .fireResistant()
            ));;


    public static final DeferredItem<Item> ART_SPEED = ITEMS.register("art_speed",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<MonadoSpeedItem> MONADO_SPEED = ITEMS.register("monado_speed",
            () -> new MonadoSpeedItem(ModToolTiers.MONADO, 1,-2.4f, new Item
                    .Properties()
                    .fireResistant()
            ));


    public static final DeferredItem<Item> ART_ENCHANT = ITEMS.register("art_enchant",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<MonadoEnchantItem> MONADO_ENCHANT = ITEMS.register("monado_enchant",
            () -> new MonadoEnchantItem(ModToolTiers.MONADO, 1,-2.4f, new Item
                    .Properties()
                    .fireResistant()
            ));


    public static final DeferredItem<Item> ART_BUSTER = ITEMS.register("art_buster",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<MonadoBusterItem> MONADO_BUSTER = ITEMS.register("monado_buster",
            () -> new MonadoBusterItem(ModToolTiers.MONADO, 7,-2.4f, new Item
                    .Properties()
                    .fireResistant()
            ));
    public static final DeferredItem<Item> ART_CYCLONE = ITEMS.register("art_cyclone",
            () -> new Item(new Item.Properties()));



    public static final DeferredItem<Item> ART_EATER = ITEMS.register("art_eater",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<MonadoEaterItem> MONADO_EATER = ITEMS.register("monado_eater",
            () -> new MonadoEaterItem(ModToolTiers.MONADO, 1,-2.4f, new Item
                    .Properties()
                    .fireResistant()
            ));

    public static final DeferredItem<Item> ART_PURGE = ITEMS.register("art_purge",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
