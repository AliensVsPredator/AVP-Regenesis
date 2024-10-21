package org.avpr.common.mixins;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import org.avpr.common.entities.alien.AlienEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import org.avpr.common.api.util.Constants;
import org.avpr.common.api.util.DamageUtil;
import org.avpr.common.api.util.PredicatesUtil;
import org.avpr.common.entities.alien.base_line.FacehuggerEntity;
import org.avpr.common.registries.AVPRDamageSources;
import org.avpr.common.registries.AVPRStatusEffects;
import org.avpr.common.status_effects.ImpregnationStatusEffect;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin extends Entity {

    protected LivingEntityMixin(EntityType<?> type, Level world) {
        super(type, world);
    }

    @Shadow
    abstract boolean hasEffect(Holder<MobEffect> effect);

    @Shadow
    abstract boolean addEffect(MobEffectInstance effect);

    @Inject(method = { "isImmobile" }, at = { @At("RETURN") }, cancellable = true)
    protected void isImmobile(CallbackInfoReturnable<Boolean> callbackInfo) {
        if (this.getPassengers().stream().anyMatch(AlienEntity.class::isInstance))
            callbackInfo.setReturnValue(true);
    }

    @Inject(method = { "isUsingItem" }, at = { @At("RETURN") }, cancellable = true)
    public void isUsingItem(CallbackInfoReturnable<Boolean> callbackInfo) {
        if (this.getPassengers().stream().anyMatch(FacehuggerEntity.class::isInstance))
            callbackInfo.setReturnValue(false);
    }

    @Inject(method = { "removeAllEffects" }, at = { @At("HEAD") }, cancellable = true)
    public void noMilkRemoval(CallbackInfoReturnable<Boolean> callbackInfo) {
        if (this.hasEffect(AVPRStatusEffects.IMPREGNATION))
            callbackInfo.setReturnValue(false);
    }

    /**
     * Injected method that triggers on each tick for the living entity. It applies chest burst damage to the entity if
     * specific conditions are met.
     *
     * @param callbackInfo The callback information.
     */
    @Inject(method = { "tick" }, at = { @At("HEAD") })
    void tick(CallbackInfo callbackInfo) {
        if (!this.level().isClientSide && PredicatesUtil.SHOULD_APPLY_IMPREGNATION_EFFECT.test(this))
            this.hurt(DamageUtil.of(this.level(), AVPRDamageSources.CHESTBURST), 0.2f);
    }

    /**
     * Invoked when a MobEffectInstance is removed from an entity. This method triggers specific logic related to the
     * ImpregnationStatusEffect.
     *
     * @param mobEffectInstance The MobEffectInstance that has been removed from the entity.
     * @param ci                The callback info.
     */
    @Inject(method = "onEffectRemoved(Lnet/minecraft/world/effect/MobEffectInstance;)V", at = @At(value = "TAIL"))
    private void runAtEffectRemoval(MobEffectInstance mobEffectInstance, CallbackInfo ci) {
        ImpregnationStatusEffect.effectRemoval(Constants.<LivingEntity>self(this), mobEffectInstance);
    }
}
