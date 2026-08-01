package net.pbreadman.xcweaponry.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.neoforged.neoforge.event.level.NoteBlockEvent;

public class MonadoEaterItem extends SwordItem {
    public MonadoEaterItem(Tier tier, int attackDamage, float attackSpeed, Properties properties) {
        super(tier, properties.attributes(SwordItem.createAttributes(tier, attackDamage, attackSpeed)));
    }

    @Override
    public void postHurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
    super.postHurtEnemy(stack, target, attacker);
        if (!(attacker.level().isClientSide())) {
            int effectDuration = 100;
            attacker.addEffect(new MobEffectInstance(MobEffects.REGENERATION, effectDuration, 0));

            target.addEffect(new MobEffectInstance(MobEffects.WITHER, effectDuration,0));
        }}
}