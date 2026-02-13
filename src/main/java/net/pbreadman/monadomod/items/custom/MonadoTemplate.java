package net.pbreadman.monadomod.items.custom;


import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;


public class MonadoTemplate extends SmithingTemplateItem {
    private static final MutableComponent MONADO_UPGRADE_APPLIES_TO;
    private static final MutableComponent MONADO_UPGRADE_INGREDIENTS;
    private static final MutableComponent MONADO_UPGRADE;
    private static final MutableComponent MONADO_UPGRADE_BASE_SLOT_DESCRIPTION;
    private static final MutableComponent MONADO_UPGRADE_ADDITIONS_SLOT_DESCRIPTION;
    private static final ResourceLocation EMPTY_SLOT_AMETHYST_SHARD;
    private static ChatFormatting DESCRIPTION_FORMAT;
    private static ChatFormatting TITLE_FORMAT;
    private static final ResourceLocation EMPTY_SLOT_SWORD;
    private final Component appliesTo;
    private final Component ingredients;
    private final Component upgradeDescription;
    private final Component baseSlotDescription;
    private final Component additionsSlotDescription;
    private final List<ResourceLocation> baseSlotEmptyIcons;
    private final List<ResourceLocation> additionalSlotEmptyIcons;
    public MonadoTemplate(MutableComponent properties, MutableComponent monadoUpgradeIngredients, MutableComponent appliesTo, MutableComponent ingredients, MutableComponent upgradeDescription, MutableComponent baseSlotDescription, MutableComponent additionsSlotDescription, List<ResourceLocation> baseSlotEmptyIcons, List<ResourceLocation> additionalSlotEmptyIcons) {
        super(MutableComponent.translatable(Util.makeDescriptionId("item", ResourceLocation.withDefaultNamespace("smithing_template.monado_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT),
        net.minecraft.network.chat.Component.translatable(Util.makeDescriptionId("item", ResourceLocation.withDefaultNamespace("smithing_template.monado_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT),
                List.of((EMPTY_SLOT_SWORD )),
                List.of((EMPTY_SLOT_AMETHYST_SHARD)));

        this.appliesTo = appliesTo;
        this.ingredients = ingredients;
        this.upgradeDescription = upgradeDescription;
        this.baseSlotDescription = baseSlotDescription;
        this.additionsSlotDescription = additionsSlotDescription;
        this.baseSlotEmptyIcons = baseSlotEmptyIcons;
        this.additionalSlotEmptyIcons = additionalSlotEmptyIcons;
    }

    public MonadoTemplate(Component appliesTo, Component ingredients, Component upgradeDescription, Component baseSlotDescription, Component additionsSlotDescription, List<ResourceLocation> baseSlotEmptyIcons, List<ResourceLocation> additionalSlotEmptyIcons, FeatureFlag... requiredFeatures) {
        super((new Item.Properties()).requiredFeatures(requiredFeatures));
        this.appliesTo = appliesTo;
        this.ingredients = ingredients;
        this.upgradeDescription = upgradeDescription;
        this.baseSlotDescription = baseSlotDescription;
        this.additionsSlotDescription = additionsSlotDescription;
        this.baseSlotEmptyIcons = baseSlotEmptyIcons;
        this.additionalSlotEmptyIcons = additionalSlotEmptyIcons;
    }

    public static MonadoTemplate createMonadoTemplate() {
        return new MonadoTemplate(MONADO_UPGRADE_APPLIES_TO, MONADO_UPGRADE_INGREDIENTS, MONADO_UPGRADE, MONADO_UPGRADE_BASE_SLOT_DESCRIPTION, MONADO_UPGRADE_ADDITIONS_SLOT_DESCRIPTION, createMonadoUpgradeIconList(), createMonadoUpgradeMaterialList(), new FeatureFlag[0]);
    }
    private static List<ResourceLocation> createMonadoUpgradeIconList() {
        return List.of(EMPTY_SLOT_SWORD);
    }
    private static List<ResourceLocation> createMonadoUpgradeMaterialList() {
        return List.of(EMPTY_SLOT_AMETHYST_SHARD);
    }

        static {
        MONADO_UPGRADE_APPLIES_TO = net.minecraft.network.chat.Component.translatable(Util.makeDescriptionId("item", ResourceLocation.withDefaultNamespace("smithing_template.monado_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);;
        DESCRIPTION_FORMAT = ChatFormatting.AQUA;
        MONADO_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item", ResourceLocation.withDefaultNamespace("smithing_template.monado_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT);
        MONADO_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade", ResourceLocation.withDefaultNamespace("monado_upgrade"))).withStyle(TITLE_FORMAT);
        TITLE_FORMAT = ChatFormatting.GRAY;
        MONADO_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", ResourceLocation.withDefaultNamespace("smithing_template.monado_upgrade.base_slot_description")));
        MONADO_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", ResourceLocation.withDefaultNamespace("smithing_template.monado_upgrade.additions_slot_description")));
        EMPTY_SLOT_SWORD = ResourceLocation.withDefaultNamespace("item/empty_slot_sword");
        EMPTY_SLOT_AMETHYST_SHARD = ResourceLocation.withDefaultNamespace("item/empty_slot_amethyst_shard");










    }
}
