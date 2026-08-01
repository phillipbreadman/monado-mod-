package net.pbreadman.xcweaponry.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class MonadoCycloneItem extends SwordItem {
    public MonadoCycloneItem(Tier tier, int attackDamage, float attackSpeed, Item.Properties props) {
        super(tier, props.attributes(SwordItem.createAttributes(tier, attackDamage, attackSpeed)));
    }
    }
