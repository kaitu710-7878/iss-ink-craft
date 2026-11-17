package com.issinkcraft.mod;

import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

/**
 * Main mod entry point for ISS Ink Craft.
 */
@Mod(IssInkCraftMod.MOD_ID)
public class IssInkCraftMod {
    public static final String MOD_ID = "iss_ink_craft";

    public IssInkCraftMod() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, IssInkCraftConfig.SPEC);

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::onRegister);
    }

    private void onRegister(RegisterEvent event) {
        if (event.getRegistryKey().equals(ForgeRegistries.Keys.RECIPE_SERIALIZERS)) {
            CraftingHelper.register(new ConfigCondition.Serializer());
        }
    }
}
