package com.issinkcraft.mod;

import net.minecraftforge.common.ForgeConfigSpec;

/**
 * Common configuration specification for ISS Ink Craft.
 */
public final class IssInkCraftConfig {
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.BooleanValue ENABLE_BASE_INK_CRAFTING;
    public static final ForgeConfigSpec.BooleanValue ENABLE_FORBIDDEN_TIERS_COMPAT;
    public static final ForgeConfigSpec.BooleanValue ENABLE_APOTHEOSIS_COMPAT;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.comment("Recipe settings for ISS Ink Craft").push("recipes");

        ENABLE_BASE_INK_CRAFTING = builder
                .comment("Enable crafting table compression recipes for base Iron's Spells 'n Spellbooks inks (Uncommon, Rare, Epic, Legendary).")
                .translation("iss_ink_craft.config.enable_base_ink_crafting")
                .define("enableBaseInkCrafting", true);

        ENABLE_FORBIDDEN_TIERS_COMPAT = builder
                .comment("Enable crafting table compression recipes for Forbidden Tiers inks (Mythic, Ancient) when Forbidden Tiers is installed.")
                .translation("iss_ink_craft.config.enable_forbidden_tiers_compat")
                .define("enableForbiddenTiersCompat", true);

        ENABLE_APOTHEOSIS_COMPAT = builder
                .comment("Enable crafting table recipe to craft Common Ink from 1 Common Material and 1 Glass Bottle when Apotheosis is installed.")
                .translation("iss_ink_craft.config.enable_apotheosis_compat")
                .define("enableApotheosisCompat", true);

        builder.pop();
        SPEC = builder.build();
    }

    private IssInkCraftConfig() {
    }
}
