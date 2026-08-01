package net.pbreadman.xcweaponry.items.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.pbreadman.xcweaponry.items.ModItems;

public class OntosItem extends Item {
    public OntosItem(Item.Properties properties) {
        super(properties);
    }
    /*@Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pHand) {
        ItemStack itemStack = pPlayer.getItemInHand(pHand);
        if (!pLevel.isClientSide()) {
            ItemStack heldStack = pPlayer.getMainHandItem();
            if (heldStack.is(ModItems.ONTOS.get())) {
                heldStack.shrink(1);
                pPlayer.sendSystemMessage(Component.literal(pPlayer.getName().getString() + " called for the !shrink event"));

                ItemStack newStack = new ItemStack(ModItems.MONADO.get());
                boolean added = pPlayer.addItem(newStack);
                pPlayer.sendSystemMessage(Component.literal(String.valueOf(added)));

                if (!added) {
                    pPlayer.sendSystemMessage(Component.literal(pPlayer.getName().getString() + " called for the !added event"));
                    pPlayer.drop(newStack, false);
                }
            }
        }
        return InteractionResultHolder.success(itemStack);
    }*/
}
