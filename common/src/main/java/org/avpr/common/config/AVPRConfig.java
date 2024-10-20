package org.avpr.common.config;

import mod.azure.azurelib.common.api.common.config.Config;
import mod.azure.azurelib.common.internal.common.config.Configurable;

import org.avpr.common.CommonMod;

@Config(id = CommonMod.MOD_ID)
public class AVPRConfig {

    @Configurable
    @Configurable.Synchronized
    public acidConfigs acidConfigs = new acidConfigs();

    public static class acidConfigs {

        @Configurable
        @Configurable.Synchronized
        @Configurable.DecimalRange(min = 0)
        public float ACID_BREAKSPEED_MODIFIER = 40.0f;

        @Configurable
        @Configurable.Synchronized
        @Configurable.DecimalRange(min = 0)
        public float ACID_DAMAGE = 2F;
    }

    @Configurable
    @Configurable.Synchronized
    public ovamorphConfigs ovamorphConfigs = new ovamorphConfigs();

    public static class ovamorphConfigs {

        @Configurable
        @Configurable.Synchronized
        @Configurable.DecimalRange(min = 0)
        public float OVAMORPH_HEALTH = 8F;

    }

    @Configurable
    @Configurable.Synchronized
    public facehuggerConfigs facehuggerConfigs = new facehuggerConfigs();

    public static class facehuggerConfigs {

        @Configurable
        @Configurable.Synchronized
        @Configurable.DecimalRange(min = 0)
        public float FACEHUGGER_HEALTH = 5F;

        @Configurable
        @Configurable.Synchronized
        @Configurable.DecimalRange(min = 0)
        public boolean FACEHUGGER_GIVE_BLINDNESS = true;

    }
}
