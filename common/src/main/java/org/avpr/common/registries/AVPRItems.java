package org.avpr.common.registries;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;

import java.util.function.Supplier;

import org.avpr.common.CommonMod;
import org.avpr.common.items.GrenadeItem;
import org.avpr.common.items.armor.AVPRArmorItem;
import org.avpr.common.items.guns.BaseGunItem;
import org.avpr.common.items.tools.AVPRToolMaterials;
import org.avpr.common.platform.AVPRServices;

public record AVPRItems() {

    public static final Supplier<SpawnEggItem> OVAMORPH_SPAWN_EGG = AVPRItems.registerItem(
        "spawn_egg_ovamorph",
        AVPRServices.COMMON_REGISTRY.makeSpawnEggFor(
            AVPREntities.OVAMORPH,
            0x615B45,
            0xBF7872,
            new Item.Properties()
        )
    );

    public static final Supplier<SpawnEggItem> FACEHUGGER_SPAWN_EGG = AVPRItems.registerItem(
        "spawn_egg_facehugger",
        AVPRServices.COMMON_REGISTRY.makeSpawnEggFor(
            AVPREntities.FACEHUGGER,
            0xE4D597,
            0xA55863,
            new Item.Properties()
        )
    );

    public static final Supplier<Item> XENO_CHITIN = AVPRItems.registerItem(
        "xenomorph_chitin",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> VERITANIUM_SHARD = AVPRItems.registerItem(
        "veritanium_shard",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> INGOT_ALUMINUM = AVPRItems.registerItem(
        "ingot_aluminum",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> INGOT_ORIONITE = AVPRItems.registerItem(
        "ingot_orionite",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> INGOT_STEEL = AVPRItems.registerItem(
        "ingot_steel",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> INGOT_TITANIUM = AVPRItems.registerItem(
        "ingot_titanium",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> DUST_LITHIUM = AVPRItems.registerItem(
        "dust_lithium",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> COLBALT = AVPRItems.registerItem(
        "cobalt",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BOTTLE_TINTED = AVPRItems.registerItem(
        "bottle_tinted",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BOTTLE_TINTED_ACID = AVPRItems.registerItem(
        "bottle_tinted_acid",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> CARBON = AVPRItems.registerItem(
        "carbon",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> LASER_MINE = AVPRItems.registerItem(
        "laser_mine",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> NBT_DRIVE = AVPRItems.registerItem(
        "nbt_drive",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> NEODYMIUM = AVPRItems.registerItem(
        "neodymium",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> NEODYMIUM_MAGENT = AVPRItems.registerItem(
        "neodymium_magnet",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> POLYCARBONATE = AVPRItems.registerItem(
        "polycarbonate",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> POLYMER = AVPRItems.registerItem(
        "polymer",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> RAW_BAUXITE = AVPRItems.registerItem(
        "raw_bauxite",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> RAW_TITANIUM = AVPRItems.registerItem(
        "raw_titanium",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> RESIN_BALL = AVPRItems.registerItem(
        "resin_ball",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> ROYAL_JELLY = AVPRItems.registerItem(
        "royal_jelly",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> SHEET_ORIONITE = AVPRItems.registerItem(
        "sheet_orionite",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> SHURIKEN = AVPRItems.registerItem(
        "shuriken",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> SILICA = AVPRItems.registerItem(
        "silica",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> SMART_DISC = AVPRItems.registerItem(
        "smart_disc",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> YAUTJA_ARTIFCAT = AVPRItems.registerItem(
        "yautja_artifact",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> ALUMINUM_AXE = AVPRItems.registerItem(
        "tool_aluminum_axe",
        () -> new AxeItem(
            AVPRToolMaterials.ALUMINUM,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.ALUMINUM, 5.0F, -3.0F))
        )
    );

    public static final Supplier<Item> ALUMINUM_HOE = AVPRItems.registerItem(
        "tool_aluminum_hoe",
        () -> new HoeItem(
            AVPRToolMaterials.ALUMINUM,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.VERITANIUM, -3.0F, 0.0F))
        )
    );

    public static final Supplier<Item> ALUMINUM_PICKAXE = AVPRItems.registerItem(
        "tool_aluminum_pickaxe",
        () -> new PickaxeItem(
            AVPRToolMaterials.ALUMINUM,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.ALUMINUM, 1.0F, -2.8F))
        )
    );

    public static final Supplier<Item> ALUMINUM_SHOVEL = AVPRItems.registerItem(
        "tool_aluminum_shovel",
        () -> new ShovelItem(
            AVPRToolMaterials.ALUMINUM,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.ALUMINUM, 1.5F, -3.0F))
        )
    );

    public static final Supplier<Item> ALUMINUM_SWORD = AVPRItems.registerItem(
        "tool_aluminum_sword",
        () -> new SwordItem(
            AVPRToolMaterials.ALUMINUM,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.TITANIUM, 3, -2.4F))
        )
    );

    public static final Supplier<Item> ORIONITE_AXE = AVPRItems.registerItem(
        "tool_orionite_axe",
        () -> new AxeItem(
            AVPRToolMaterials.ORIONITE,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.ORIONITE, 5.0F, -3.0F))
        )
    );

    public static final Supplier<Item> ORIONITE_HOE = AVPRItems.registerItem(
        "tool_orionite_hoe",
        () -> new HoeItem(
            AVPRToolMaterials.ORIONITE,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.ORIONITE, -3.0F, 0.0F))
        )
    );

    public static final Supplier<Item> ORIONITE_PICKAXE = AVPRItems.registerItem(
        "tool_orionite_pickaxe",
        () -> new PickaxeItem(
            AVPRToolMaterials.ORIONITE,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.ORIONITE, 1.0F, -2.8F))
        )
    );

    public static final Supplier<Item> ORIONITE_SHOVEL = AVPRItems.registerItem(
        "tool_orionite_shovel",
        () -> new ShovelItem(
            AVPRToolMaterials.ORIONITE,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.ALUMINUM, 1.5F, -3.0F))
        )
    );

    public static final Supplier<Item> ORIONITE_SWORD = AVPRItems.registerItem(
        "tool_orionite_sword",
        () -> new SwordItem(
            AVPRToolMaterials.ORIONITE,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.TITANIUM, 3, -2.4F))
        )
    );

    public static final Supplier<Item> TITANIUM_AXE = AVPRItems.registerItem(
        "tool_titanium_axe",
        () -> new AxeItem(
            AVPRToolMaterials.TITANIUM,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.TITANIUM, 5.0F, -3.0F))
        )
    );

    public static final Supplier<Item> TITANIUM_HOE = AVPRItems.registerItem(
        "tool_titanium_hoe",
        () -> new HoeItem(
            AVPRToolMaterials.TITANIUM,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.TITANIUM, -3.0F, 0.0F))
        )
    );

    public static final Supplier<Item> TITANIUM_PICKAXE = AVPRItems.registerItem(
        "tool_titanium_pickaxe",
        () -> new PickaxeItem(
            AVPRToolMaterials.TITANIUM,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.TITANIUM, 1.0F, -2.8F))
        )
    );

    public static final Supplier<Item> TITANIUM_SHOVEL = AVPRItems.registerItem(
        "tool_titanium_shovel",
        () -> new ShovelItem(
            AVPRToolMaterials.TITANIUM,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.ALUMINUM, 1.5F, -3.0F))
        )
    );

    public static final Supplier<Item> TITANIUM_SWORD = AVPRItems.registerItem(
        "tool_titanium_sword",
        () -> new SwordItem(
            AVPRToolMaterials.TITANIUM,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.TITANIUM, 3, -2.4F))
        )
    );

    public static final Supplier<Item> VERITANIUM_AXE = AVPRItems.registerItem(
        "tool_veritanium_axe",
        () -> new AxeItem(
            AVPRToolMaterials.VERITANIUM,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.VERITANIUM, 5.0F, -3.0F))
        )
    );

    public static final Supplier<Item> VERITANIUM_HOE = AVPRItems.registerItem(
        "tool_veritanium_hoe",
        () -> new HoeItem(
            AVPRToolMaterials.VERITANIUM,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.VERITANIUM, -3.0F, 0.0F))
        )
    );

    public static final Supplier<Item> VERITANIUM_PICKAXE = AVPRItems.registerItem(
        "tool_veritanium_pickaxe",
        () -> new PickaxeItem(
            AVPRToolMaterials.VERITANIUM,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.VERITANIUM, 1.0F, -2.8F))
        )
    );

    public static final Supplier<Item> VERITANIUM_SHOVEL = AVPRItems.registerItem(
        "tool_veritanium_shovel",
        () -> new ShovelItem(
            AVPRToolMaterials.VERITANIUM,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.ALUMINUM, 1.5F, -3.0F))
        )
    );

    public static final Supplier<Item> VERITANIUM_SWORD = AVPRItems.registerItem(
        "tool_veritanium_sword",
        () -> new SwordItem(
            AVPRToolMaterials.VERITANIUM,
            new Item.Properties().attributes(DiggerItem.createAttributes(AVPRToolMaterials.TITANIUM, 3, -2.4F))
        )
    );

    public static final Supplier<Item> DORITOS = AVPRItems.registerItem(
        "doritos",
        () -> new Item(
            new Item.Properties().food(new FoodProperties.Builder().alwaysEdible().nutrition(2).saturationModifier(0.2F).build())
        )
    );

    public static final Supplier<Item> DORITOS_COOL_RANCH = AVPRItems.registerItem(
        "doritos_cool_ranch",
        () -> new Item(
            new Item.Properties().food(new FoodProperties.Builder().alwaysEdible().nutrition(4).saturationModifier(0.2F).build())
        )
    );

    public static final Supplier<Item> RAW_TENTACLE = AVPRItems.registerItem(
        "raw_tentacle",
        () -> new Item(
            new Item.Properties().food(new FoodProperties.Builder().alwaysEdible().nutrition(2).saturationModifier(0.2F).build())
        )
    );

    public static final Supplier<Item> TRILO_BITE = AVPRItems.registerItem(
        "trilo_bite",
        () -> new Item(
            new Item.Properties().food(new FoodProperties.Builder().alwaysEdible().nutrition(7).saturationModifier(0.7F).build())
        )
    );

    public static final Supplier<Item> BATTERY = AVPRItems.registerItem(
        "battery",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> CAPACITOR = AVPRItems.registerItem(
        "capacitor",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> CPU = AVPRItems.registerItem(
        "cpu",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> DIODE = AVPRItems.registerItem(
        "diode",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> INTERGRATED_CIRCUIT = AVPRItems.registerItem(
        "integrated_circuit",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> LED = AVPRItems.registerItem(
        "led",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> LED_DISPLAY = AVPRItems.registerItem(
        "led_display",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> MOTHERBOARD = AVPRItems.registerItem(
        "motherboard",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> POWER_SUPPLY = AVPRItems.registerItem(
        "power_supply",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> RAM = AVPRItems.registerItem(
        "ram",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> REGULATOR = AVPRItems.registerItem(
        "regulator",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> RESISTOR = AVPRItems.registerItem(
        "resistor",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> SSD = AVPRItems.registerItem(
        "ssd",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> TRANSISTOR = AVPRItems.registerItem(
        "transistor",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> AMMO_CHARGE_PACK = AVPRItems.registerItem(
        "ammo_charge_pack",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> AMMO_FLAMETHROWER = AVPRItems.registerItem(
        "ammo_flamethrower",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_TIP = AVPRItems.registerItem(
        "bullet_tip",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> CASING_CASELESS = AVPRItems.registerItem(
        "casing_caseless",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> CASING_HEAVY = AVPRItems.registerItem(
        "casing_heavy",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> CASTING_PISTOL = AVPRItems.registerItem(
        "casing_pistol",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> CASING_RIFLE = AVPRItems.registerItem(
        "casing_rifle",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> CASING_SHOTGUN = AVPRItems.registerItem(
        "casing_shotgun",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> ROCKET = AVPRItems.registerItem(
        "rocket",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> ROCKET_ELECTRIC = AVPRItems.registerItem(
        "rocket_electric",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> ROCKET_INCENDIARY = AVPRItems.registerItem(
        "rocket_incendiary",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> ROCKET_PENETRATION = AVPRItems.registerItem(
        "rocket_penetration",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_PART_BARREL = AVPRItems.registerItem(
        "weapon_part_barrel",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_PART_BARREL_MINIGUN = AVPRItems.registerItem(
        "weapon_part_barrel_minigun",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_PART_BARREL_ROCKET = AVPRItems.registerItem(
        "weapon_part_barrel_rocket",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_PART_BARREL_SMART = AVPRItems.registerItem(
        "weapon_part_barrel_smart",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_PART_GRIP = AVPRItems.registerItem(
        "weapon_part_grip",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_PART_RECEIVER = AVPRItems.registerItem(
        "weapon_part_receiver",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_PART_RECEIVER_SMART = AVPRItems.registerItem(
        "weapon_part_receiver_smart",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_PART_STOCK = AVPRItems.registerItem(
        "weapon_part_stock",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BLUEPRINT_37_12_SHOTGUN = AVPRItems.registerItem(
        "blueprint_37_12_shotgun",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BLUEPRINT_AK_47 = AVPRItems.registerItem(
        "blueprint_ak_47",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BLUEPRINT_F90_RIFLE = AVPRItems.registerItem(
        "blueprint_f90_rifle",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BLUEPRINT_SEVASTOPOL = AVPRItems.registerItem(
        "blueprint_flamethrower_sevastopol",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BLUEPRINT_M4_CARBINE = AVPRItems.registerItem(
        "blueprint_m4_carbine",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BLUEPRINT_M41A_PULSE_RIFLE = AVPRItems.registerItem(
        "blueprint_m41a_pulse_rifle",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BLUEPRINT_M56_SMARTGUN = AVPRItems.registerItem(
        "blueprint_m56_smartgun",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BLUEPRINT_M83A2_SADAR = AVPRItems.registerItem(
        "blueprint_m83a2_sadar",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BLUEPRINT_M88MOD4_COMBAT_PISTOL = AVPRItems.registerItem(
        "blueprint_m88mod4_combat_pistol",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BLUEPRINT_OLD_PAINLESS = AVPRItems.registerItem(
        "blueprint_old_painless",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BLUEPRINT_SNIPER_RIFLE = AVPRItems.registerItem(
        "blueprint_sniper_rifle",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_CASELESS = AVPRItems.registerItem(
        "bullet_caseless",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_CASELESS_ACID = AVPRItems.registerItem(
        "bullet_caseless_acid",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_CASELESS_ELECTRIC = AVPRItems.registerItem(
        "bullet_caseless_electric",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_CASELESS_EXPLOSIVE = AVPRItems.registerItem(
        "bullet_caseless_explosive",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_CASELESS_INCENDIARY = AVPRItems.registerItem(
        "bullet_caseless_incendiary",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_CASELESS_PENETRATION = AVPRItems.registerItem(
        "bullet_caseless_penetration",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_HEAVY = AVPRItems.registerItem(
        "bullet_heavy",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_HEAVY_ACID = AVPRItems.registerItem(
        "bullet_heavy_acid",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_HEAVY_ELECTRIC = AVPRItems.registerItem(
        "bullet_heavy_electric",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_HEAVY_EXPLOSIVE = AVPRItems.registerItem(
        "bullet_heavy_explosive",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_HEAVY_INCENDIARY = AVPRItems.registerItem(
        "bullet_heavy_incendiary",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_HEAVY_PENETRATION = AVPRItems.registerItem(
        "bullet_heavy_penetration",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_PISTOL = AVPRItems.registerItem(
        "bullet_pistol",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_PISTOL_ACID = AVPRItems.registerItem(
        "bullet_pistol_acid",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_PISTOL_ELECTRIC = AVPRItems.registerItem(
        "bullet_pistol_electric",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_PISTOL_EXPLOSIVE = AVPRItems.registerItem(
        "bullet_pistol_explosive",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_PISTOL_INCENDIARY = AVPRItems.registerItem(
        "bullet_pistol_incendiary",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_PISTOL_PENETRATION = AVPRItems.registerItem(
        "bullet_pistol_penetration",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_RIFLE = AVPRItems.registerItem(
        "bullet_rifle",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_RIFLE_ACID = AVPRItems.registerItem(
        "bullet_rifle_acid",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_RIFLE_ELECTRIC = AVPRItems.registerItem(
        "bullet_rifle_electric",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_RIFLE_EXPLOSIVE = AVPRItems.registerItem(
        "bullet_rifle_explosive",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_RIFLE_INCENDIARY = AVPRItems.registerItem(
        "bullet_rifle_incendiary",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_RIFLE_PENETRATION = AVPRItems.registerItem(
        "bullet_rifle_penetration",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_SHOTGUN = AVPRItems.registerItem(
        "bullet_shotgun",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_SHOTGUN_ACID = AVPRItems.registerItem(
        "bullet_shotgun_acid",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_SHOTGUN_ELECTRIC = AVPRItems.registerItem(
        "bullet_shotgun_electric",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_SHOTGUN_EXPLOSIVE = AVPRItems.registerItem(
        "bullet_shotgun_explosive",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_SHOTGUN_INCENDIARY = AVPRItems.registerItem(
        "bullet_shotgun_incendiary",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> BULLET_SHOTGUN_PENETRATION = AVPRItems.registerItem(
        "bullet_shotgun_penetration",
        () -> new Item(new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_GRENADE_INCENDIARY = AVPRItems.registerItem(
        "grenade_incendiary",
        () -> new GrenadeItem(new Item.Properties(), true)
    );

    public static final Supplier<Item> WEAPON_GRENADE_M40 = AVPRItems.registerItem(
        "grenade_m40",
        () -> new GrenadeItem(new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_FLAMETHROWER_SEVASTOPOL = AVPRItems.registerItem(
        "weapon_flamethrower_sevastopol",
        () -> new BaseGunItem("weapon_flamethrower_sevastopol", new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_M88MOD4_COMBAT_PISTOL = AVPRItems.registerItem(
        "weapon_m88mod4_combat_pistol",
        () -> new BaseGunItem("weapon_m88mod4_combat_pistol", new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_37_12_SHOTGUN = AVPRItems.registerItem(
        "weapon_37_12_shotgun",
        () -> new BaseGunItem("weapon_37_12_shotgun", new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_AK_47 = AVPRItems.registerItem(
        "weapon_ak_47",
        () -> new BaseGunItem("weapon_ak_47", new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_F90_RIFLE = AVPRItems.registerItem(
        "weapon_f90_rifle",
        () -> new BaseGunItem("weapon_f90_rifle", new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_M4_CARBINE = AVPRItems.registerItem(
        "weapon_m4_carbine",
        () -> new BaseGunItem("weapon_m4_carbine", new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_M41A_PULSE_RIFLE = AVPRItems.registerItem(
        "weapon_m41a_pulse_rifle",
        () -> new BaseGunItem("weapon_m41a_pulse_rifle", new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_SNIPER_RIFLE = AVPRItems.registerItem(
        "weapon_sniper_rifle",
        () -> new BaseGunItem("weapon_sniper_rifle", new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_M56_SMARTGUN = AVPRItems.registerItem(
        "weapon_m56_smartgun",
        () -> new BaseGunItem("weapon_m56_smartgun", new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_M83A2_SADAR = AVPRItems.registerItem(
        "weapon_m83a2_sadar",
        () -> new BaseGunItem("weapon_m83a2_sadar", new Item.Properties())
    );

    public static final Supplier<Item> WEAPON_OLD_PAINLESS = AVPRItems.registerItem(
        "weapon_old_painless",
        () -> new BaseGunItem("weapon_old_painless", new Item.Properties())
    );

    public static final Supplier<Item> ARMOR_ALUMINUM_HELMET = AVPRItems.registerItem(
        "armor_aluminum_helmet",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getAluminumMaterial(),
            ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(14))
        )
    );

    public static final Supplier<Item> ARMOR_ALUMINUM_CHESTPLATE = AVPRItems.registerItem(
        "armor_aluminum_body",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getAluminumMaterial(),
            ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(14))
        )
    );

    public static final Supplier<Item> ARMOR_ALUMINUM_LEGGINGS = AVPRItems.registerItem(
        "armor_aluminum_leggings",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getAluminumMaterial(),
            ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(14))
        )
    );

    public static final Supplier<Item> ARMOR_ALUMINUM_BOOTS = AVPRItems.registerItem(
        "armor_aluminum_boots",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getAluminumMaterial(),
            ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(14))
        )
    );

    public static final Supplier<Item> ARMOR_MK50_HELMET = AVPRItems.registerItem(
        "armor_mk50_helmet",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getMK50Material(),
            ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(24))
        )
    );

    public static final Supplier<Item> ARMOR_MK50_CHESTPLATE = AVPRItems.registerItem(
        "armor_mk50_body",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getMK50Material(),
            ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(24))
        )
    );

    public static final Supplier<Item> ARMOR_MK50_LEGGINGS = AVPRItems.registerItem(
        "armor_mk50_leggings",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getMK50Material(),
            ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(24))
        )
    );

    public static final Supplier<Item> ARMOR_MK50_BOOTS = AVPRItems.registerItem(
        "armor_mk50_boots",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getMK50Material(),
            ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(24))
        )
    );

    public static final Supplier<Item> ARMOR_ORIONITE_HELMET = AVPRItems.registerItem(
        "armor_orionite_helmet",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getOrioniteMaterial(),
            ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35))
        )
    );

    public static final Supplier<Item> ARMOR_ORIONITE_CHESTPLATE = AVPRItems.registerItem(
        "armor_orionite_body",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getOrioniteMaterial(),
            ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35))
        )
    );

    public static final Supplier<Item> ARMOR_ORIONITE_LEGGINGS = AVPRItems.registerItem(
        "armor_orionite_leggings",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getOrioniteMaterial(),
            ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35))
        )
    );

    public static final Supplier<Item> ARMOR_ORIONITE_BOOTS = AVPRItems.registerItem(
        "armor_orionite_boots",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getOrioniteMaterial(),
            ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35))
        )
    );

    public static final Supplier<Item> ARMOR_PRESSURE_HELMET = AVPRItems.registerItem(
        "armor_pressure_helmet",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getPressureMaterial(),
            ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(22))
        )
    );

    public static final Supplier<Item> ARMOR_PRESSURE_CHESTPLATE = AVPRItems.registerItem(
        "armor_pressure_body",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getPressureMaterial(),
            ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(22))
        )
    );

    public static final Supplier<Item> ARMOR_PRESSURE_LEGGINGS = AVPRItems.registerItem(
        "armor_pressure_leggings",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getPressureMaterial(),
            ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(22))
        )
    );

    public static final Supplier<Item> ARMOR_PRESSURE_BOOTS = AVPRItems.registerItem(
        "armor_pressure_boots",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getPressureMaterial(),
            ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(22))
        )
    );

    public static final Supplier<Item> ARMOR_TACTICAL_HELMET = AVPRItems.registerItem(
        "armor_tactical_helmet",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getTacticalMaterial(),
            ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(26))
        )
    );

    public static final Supplier<Item> ARMOR_TACTICAL_CHESTPLATE = AVPRItems.registerItem(
        "armor_tactical_body",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getTacticalMaterial(),
            ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(26))
        )
    );

    public static final Supplier<Item> ARMOR_TACTICAL_LEGGINGS = AVPRItems.registerItem(
        "armor_tactical_leggings",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getTacticalMaterial(),
            ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(26))
        )
    );

    public static final Supplier<Item> ARMOR_TACTICAL_BOOTS = AVPRItems.registerItem(
        "armor_tactical_boots",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getTacticalMaterial(),
            ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(26))
        )
    );

    public static final Supplier<Item> ARMOR_TITANIUM_HELMET = AVPRItems.registerItem(
        "armor_titanium_helmet",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getTitaniumMaterial(),
            ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(24))
        )
    );

    public static final Supplier<Item> ARMOR_TITANIUM_CHESTPLATE = AVPRItems.registerItem(
        "armor_titanium_body",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getTitaniumMaterial(),
            ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(24))
        )
    );

    public static final Supplier<Item> ARMOR_TITANIUM_LEGGINGS = AVPRItems.registerItem(
        "armor_titanium_leggings",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getTitaniumMaterial(),
            ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(24))
        )
    );

    public static final Supplier<Item> ARMOR_TITANIUM_BOOTS = AVPRItems.registerItem(
        "armor_titanium_boots",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getTitaniumMaterial(),
            ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(24))
        )
    );

    public static final Supplier<Item> ARMOR_VERITANIUM_HELMET = AVPRItems.registerItem(
        "armor_veritanium_helmet",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getVeritaniumMaterial(),
            ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(34))
        )
    );

    public static final Supplier<Item> ARMOR_VERITANIUM_CHESTPLATE = AVPRItems.registerItem(
        "armor_veritanium_body",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getVeritaniumMaterial(),
            ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(34))
        )
    );

    public static final Supplier<Item> ARMOR_VERITANIUM_LEGGINGS = AVPRItems.registerItem(
        "armor_veritanium_leggings",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getVeritaniumMaterial(),
            ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(34))
        )
    );

    public static final Supplier<Item> ARMOR_VERITANIUM_BOOTS = AVPRItems.registerItem(
        "armor_veritanium_boots",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getVeritaniumMaterial(),
            ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(34))
        )
    );

    public static final Supplier<Item> ARMOR_XENOMORPH_CHITIN_HELMET = AVPRItems.registerItem(
        "armor_xenomorph_chitin_helmet",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getXenomorphMaterial(),
            ArmorItem.Type.HELMET,
            new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(30))
        )
    );

    public static final Supplier<Item> ARMOR_XENOMORPH_CHITIN_CHESTPLATE = AVPRItems.registerItem(
        "armor_xenomorph_chitin_body",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getXenomorphMaterial(),
            ArmorItem.Type.CHESTPLATE,
            new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(30))
        )
    );

    public static final Supplier<Item> ARMOR_XENOMORPH_CHITIN_LEGGINGS = AVPRItems.registerItem(
        "armor_xenomorph_chitin_leggings",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getXenomorphMaterial(),
            ArmorItem.Type.LEGGINGS,
            new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(30))
        )
    );

    public static final Supplier<Item> ARMOR_XENOMORPH_CHITIN_BOOTS = AVPRItems.registerItem(
        "armor_xenomorph_chitin_boots",
        () -> new AVPRArmorItem(
            AVPRServices.COMMON_REGISTRY.getXenomorphMaterial(),
            ArmorItem.Type.BOOTS,
            new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(30))
        )
    );

    /**
     * Example of using this Interface to create a new Item:
     * <p>
     * The following code demonstrates how to register a new item and a spawn egg in the game:
     * </p>
     *
     * <pre>{@code
     *
     * public static final Supplier<Item> TEST_ITEM = AVPRItems.registerItem("itemname", () -> new Item(new Item.Properties()));
     *
     * public static final Supplier<SpawnEggItem> TEST_SPAWN_EGG = AVPRItems.registerItem(
     *     "entityname_spawn_egg",
     *     AVPRServices.COMMON_REGISTRY.makeSpawnEggFor(TESTENTITY, 0x1F1F1F, 0x0D0D0D, new Item.Properties())
     * );
     * }</pre>
     * <p>
     * In this example:
     * </p>
     * <ul>
     * <li><code>registerItem</code> is a method to register a new item with the specified item name.</li>
     * <li><code>Item</code> is used to create a new item instance with default properties.</li>
     * <li><code>makeSpawnEggFor</code> is a method to create a spawn egg for the specified entity with primary and
     * secondary colors.</li>
     * </ul>
     * <p>
     * The {@link Item Item} class represents an item in the game.
     * </p>
     * <p>
     * The {@link net.minecraft.world.item.SpawnEggItem SpawnEggItem} class represents a spawn egg in the game.
     * </p>
     * Registers a new Item.
     *
     * @param itemName The name of the item.
     * @param item     A supplier for the item.
     * @param <T>      The type of the item.
     * @return A supplier for the registered item.
     */
    static <T extends Item> Supplier<T> registerItem(String itemName, Supplier<T> item) {
        return AVPRServices.COMMON_REGISTRY.registerItem(CommonMod.MOD_ID, itemName, item);
    }

    public static void initialize() {}
}
