package net.pbreadman.xcweaponry.items;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class MonadoBusterItem extends SwordItem {
    public MonadoBusterItem(Tier tier, int attackDamage, float attackSpeed, Properties props) {
        super(tier, props.attributes(SwordItem.createAttributes(tier, attackDamage, attackSpeed)));
    }

    /*@Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        ItemStack itemStack = pPlayer.getItemInHand(pHand);
        if (!pLevel.isClientSide)
        }
        return InteractionResultHolder.success(itemStack);
    }
*/
}
