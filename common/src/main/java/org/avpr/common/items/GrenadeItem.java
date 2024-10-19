package org.avpr.common.items;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import org.avpr.common.entities.projectiles.ThrownGrenade;

public class GrenadeItem extends Item {

    private final boolean isIncendiary;

    public GrenadeItem(Properties properties, boolean isIncendiary) {
        super(properties);
        this.isIncendiary = isIncendiary;
    }

    public GrenadeItem(Properties properties) {
        this(properties, false);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player, @NotNull InteractionHand interactionHand) {
        var itemInHand = player.getItemInHand(interactionHand);
        // TODO: Change sound effect here.
        level.playSound(
            null,
            player.getX(),
            player.getY(),
            player.getZ(),
            SoundEvents.EGG_THROW,
            SoundSource.PLAYERS,
            0.5F,
            0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F)
        );

        if (!level.isClientSide) {
            var thrownGrenade = new ThrownGrenade(level, player);
            thrownGrenade.setItem(itemInHand);
            thrownGrenade.setIncendiary(isIncendiary);
            thrownGrenade.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
            level.addFreshEntity(thrownGrenade);
        }

        player.awardStat(Stats.ITEM_USED.get(this));
        if (!player.getAbilities().instabuild) {
            itemInHand.shrink(1);
        }

        return InteractionResultHolder.sidedSuccess(itemInHand, level.isClientSide());
    }
}