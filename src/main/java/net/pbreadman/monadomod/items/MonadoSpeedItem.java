package net.pbreadman.monadomod.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class MonadoSpeedItem extends SwordItem {
    public MonadoSpeedItem(Tier tier, int attackDamage, float attackSpeed, Properties props) {
        super(tier, props.attributes(SwordItem.createAttributes(tier, attackDamage, attackSpeed)));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        ItemStack itemStack = pPlayer.getItemInHand(pHand);
        if (!pLevel.isClientSide) {
            pPlayer.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 1));
            pPlayer.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 1));
        }
        return InteractionResultHolder.success(itemStack);
    }
}