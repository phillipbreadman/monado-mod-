package net.pbreadman.monadomod.items.custom;


import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlag;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;


public class MonadoTemplate extends SmithingTemplateItem {
    private static final ChatFormatting DESCRIPTION_FORMAT = ChatFormatting.AQUA;
    private static final ChatFormatting TITLE_FORMAT = ChatFormatting.GRAY;
    private static final MutableComponent MONADO_UPGRADE_APPLIES_TO;
    private static final MutableComponent MONADO_UPGRADE_INGREDIENTS;
    private static final MutableComponent MONADO_UPGRADE;
    private static final MutableComponent MONADO_UPGRADE_BASE_SLOT_DESCRIPTION;
    private static final MutableComponent MONADO_UPGRADE_ADDITIONS_SLOT_DESCRIPTION;
    private static final ResourceLocation EMPTY_SLOT_AMETHYST_SHARD;
    private static final ResourceLocation EMPTY_SLOT_SWORD;

    public MonadoTemplate(Component appliesTo, Component ingredients, Component upgradeDescription, Component baseSlotDescription, Component additionsSlotDescription, List<ResourceLocation> baseSlotEmptyIcons, List<ResourceLocation> additionalSlotEmptyIcons, FeatureFlag... requiredFeatures) {
        super(appliesTo, ingredients, upgradeDescription, baseSlotDescription, additionsSlotDescription, baseSlotEmptyIcons, additionalSlotEmptyIcons, requiredFeatures);
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
        MONADO_UPGRADE_APPLIES_TO = Component.translatable(Util.makeDescriptionId("item", ResourceLocation.withDefaultNamespace("smithing_template.monado_upgrade.applies_to"))).withStyle(DESCRIPTION_FORMAT);
        MONADO_UPGRADE_INGREDIENTS = Component.translatable(Util.makeDescriptionId("item", ResourceLocation.withDefaultNamespace("smithing_template.monado_upgrade.ingredients"))).withStyle(DESCRIPTION_FORMAT);
        MONADO_UPGRADE = Component.translatable(Util.makeDescriptionId("upgrade", ResourceLocation.withDefaultNamespace("monado_upgrade"))).withStyle(TITLE_FORMAT);
        MONADO_UPGRADE_BASE_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", ResourceLocation.withDefaultNamespace("smithing_template.monado_upgrade.base_slot_description")));
        MONADO_UPGRADE_ADDITIONS_SLOT_DESCRIPTION = Component.translatable(Util.makeDescriptionId("item", ResourceLocation.withDefaultNamespace("smithing_template.monado_upgrade.additions_slot_description")));
        EMPTY_SLOT_SWORD = ResourceLocation.withDefaultNamespace("item/empty_slot_sword");
        EMPTY_SLOT_AMETHYST_SHARD = ResourceLocation.withDefaultNamespace("item/empty_slot_amethyst_shard");
    }
}