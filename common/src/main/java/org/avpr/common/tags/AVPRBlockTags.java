package org.avpr.common.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import org.avpr.common.CommonMod;

public class AVPRBlockTags {

    public static final TagKey<Block> ACID_IMMUNE = CommonMod.create(Registries.BLOCK, "acid_immune");

    public static final TagKey<Block> ALIEN_REPELLENTS = CommonMod.create(Registries.BLOCK, "alien_repellents");

}
