package org.avpr.neoforge;

import mod.azure.azurelib.common.internal.common.AzureLib;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import org.avpr.common.CommonMod;

@Mod(CommonMod.MOD_ID)
public final class NeoForgeMod {
    public static DeferredRegister<BlockEntityType<?>> blockEntityTypeDeferredRegister = DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, CommonMod.MOD_ID);
    public static DeferredRegister<Block> blockDeferredRegister = DeferredRegister.create(Registries.BLOCK, CommonMod.MOD_ID);
    public static DeferredRegister<EntityType<?>> entityTypeDeferredRegister = DeferredRegister.create(Registries.ENTITY_TYPE, CommonMod.MOD_ID);
    public static DeferredRegister<ArmorMaterial> armorMaterialDeferredRegister = DeferredRegister.create(Registries.ARMOR_MATERIAL, CommonMod.MOD_ID);
    public static DeferredRegister<Item> itemDeferredRegister = DeferredRegister.create(Registries.ITEM, CommonMod.MOD_ID);
    public static DeferredRegister<SoundEvent> soundEventDeferredRegister= DeferredRegister.create(Registries.SOUND_EVENT, CommonMod.MOD_ID);
    public static DeferredRegister<MenuType<?>> menuTypeDeferredRegister= DeferredRegister.create(Registries.MENU, CommonMod.MOD_ID);
    public static DeferredRegister<ParticleType<?>> particleTypeDeferredRegister = DeferredRegister.create(Registries.PARTICLE_TYPE, CommonMod.MOD_ID);
    public static DeferredRegister<CreativeModeTab> creativeModeTabDeferredRegister = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CommonMod.MOD_ID);
    public static DeferredRegister<MobEffect> statusEffectDeferredRegister = DeferredRegister.create(Registries.MOB_EFFECT, CommonMod.MOD_ID);
    public static DeferredRegister<Fluid> fluidDeferredRegister = DeferredRegister.create(Registries.FLUID, CommonMod.MOD_ID);
    public static final DeferredRegister<FluidType> fluidTypeDeferredRegister = DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, CommonMod.MOD_ID);

    public NeoForgeMod(IEventBus modEventBus) {
        AzureLib.initialize();
        CommonMod.initRegistries();
        if (NeoForgeMod.blockEntityTypeDeferredRegister != null)
            NeoForgeMod.blockEntityTypeDeferredRegister.register(modEventBus);
        if (NeoForgeMod.armorMaterialDeferredRegister != null)
            NeoForgeMod.armorMaterialDeferredRegister.register(modEventBus);
        if (NeoForgeMod.entityTypeDeferredRegister != null)
            NeoForgeMod.entityTypeDeferredRegister.register(modEventBus);
        if (NeoForgeMod.armorMaterialDeferredRegister != null)
            NeoForgeMod.armorMaterialDeferredRegister.register(modEventBus);
        if (NeoForgeMod.itemDeferredRegister != null)
            NeoForgeMod.itemDeferredRegister.register(modEventBus);
        if (NeoForgeMod.soundEventDeferredRegister != null)
            NeoForgeMod.soundEventDeferredRegister.register(modEventBus);
        if (NeoForgeMod.menuTypeDeferredRegister != null)
            NeoForgeMod.menuTypeDeferredRegister.register(modEventBus);
        if (NeoForgeMod.particleTypeDeferredRegister != null)
            NeoForgeMod.particleTypeDeferredRegister.register(modEventBus);
        if (NeoForgeMod.creativeModeTabDeferredRegister != null)
            NeoForgeMod.creativeModeTabDeferredRegister.register(modEventBus);
        if (NeoForgeMod.statusEffectDeferredRegister != null)
            NeoForgeMod.statusEffectDeferredRegister.register(modEventBus);
        if (NeoForgeMod.fluidDeferredRegister != null)
            NeoForgeMod.fluidDeferredRegister.register(modEventBus);
        if (NeoForgeMod.fluidTypeDeferredRegister != null)
            NeoForgeMod.fluidTypeDeferredRegister.register(modEventBus);
//        modEventBus.addListener(this::createEntityAttributes);
//        modEventBus.addListener(this::onRegisterEvent);
    }

    public void onRegisterEvent(RegisterSpawnPlacementsEvent event) {
    }

    public void createEntityAttributes(final EntityAttributeCreationEvent event) {
    }
}