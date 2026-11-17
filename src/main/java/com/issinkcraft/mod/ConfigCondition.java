package com.issinkcraft.mod;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.IConditionSerializer;

import java.util.Map;

/**
 * Forge recipe condition backed by {@link IssInkCraftConfig}.
 */
public class ConfigCondition implements ICondition {
    private static final ResourceLocation ID = new ResourceLocation(IssInkCraftMod.MOD_ID, "config");

    private static final Map<String, ForgeConfigSpec.BooleanValue> OPTIONS = Map.of(
            "base_ink_crafting", IssInkCraftConfig.ENABLE_BASE_INK_CRAFTING,
            "forbidden_tiers_compat", IssInkCraftConfig.ENABLE_FORBIDDEN_TIERS_COMPAT,
            "apotheosis_compat", IssInkCraftConfig.ENABLE_APOTHEOSIS_COMPAT
    );

    private final String option;

    public ConfigCondition(String option) {
        if (!OPTIONS.containsKey(option)) {
            throw new IllegalArgumentException("Unknown config condition option: " + option);
        }
        this.option = option;
    }

    @Override
    public ResourceLocation getID() {
        return ID;
    }

    @Override
    public boolean test(IContext context) {
        ForgeConfigSpec.BooleanValue configValue = OPTIONS.get(option);
        if (configValue == null) {
            return false;
        }
        // Fallback to default true if recipe loading runs before the config file is loaded.
        return IssInkCraftConfig.SPEC.isLoaded() ? configValue.get() : configValue.getDefault();
    }

    public static class Serializer implements IConditionSerializer<ConfigCondition> {
        @Override
        public void write(JsonObject json, ConfigCondition value) {
            json.addProperty("option", value.option);
        }

        @Override
        public ConfigCondition read(JsonObject json) {
            String option = GsonHelper.getAsString(json, "option");
            if (!OPTIONS.containsKey(option)) {
                throw new JsonParseException("Unknown config condition option: " + option);
            }
            return new ConfigCondition(option);
        }

        @Override
        public ResourceLocation getID() {
            return ID;
        }
    }
}
