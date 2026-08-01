package net.pbreadman.xcweaponry.items;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class MonadoEaterItem extends SwordItem {
    public MonadoEaterItem(Tier tier, int attackDamage, float attackSpeed, Properties props) {
        super(tier, props.attributes(SwordItem.createAttributes(tier, attackDamage, attackSpeed)));
    }


   /* @Override
    public boolean doHurtTarget(Entity entity) {
        if (!super.doHurtTarget(entity)) {
            return false;
        } else {
            if (entity instanceof LivingEntity) {
                ((LivingEntity)entity).addEffect(new MobEffectInstance(MobEffects.WITHER, 200), this);
            }

            return true;
        }
    */
}
