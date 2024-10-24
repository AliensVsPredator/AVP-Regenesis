package org.avpr.common.mixins.client;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.world.InteractionHand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import org.avpr.common.items.guns.BaseGunItem;
import org.avpr.common.registries.AVPRDataComponments;

@Mixin(PlayerRenderer.class)
public class WeaponRenderingMixin {

    /**
     * Adjusts the arm pose of the player based on the item held in hand.
     *
     * @param player the player whose arm pose is being determined
     * @param hand   the hand in which the item is held
     * @param ci     the callback information for the return value, which can be modified to change the arm pose
     */
    @Inject(method = "getArmPose", at = @At(value = "TAIL"), cancellable = true)
    private static void tryItemPose(AbstractClientPlayer player, InteractionHand hand, CallbackInfoReturnable<HumanoidModel.ArmPose> ci) {
        var itemstack = player.getItemInHand(hand);
        if (itemstack.getItem() instanceof BaseGunItem && !itemstack.get(AVPRDataComponments.SHOULD_RENDER_AS_CROSSBOW.get()))
            ci.setReturnValue(HumanoidModel.ArmPose.BOW_AND_ARROW);
        if (
            itemstack.getItem() instanceof BaseGunItem && itemstack.get(AVPRDataComponments.SHOULD_RENDER_AS_CROSSBOW.get())
        )
            ci.setReturnValue(HumanoidModel.ArmPose.CROSSBOW_HOLD);
    }
}
