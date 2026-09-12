package net.gim.craftfoundry.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.gim.craftfoundry.CraftFoundry;
import net.gim.craftfoundry.block.ModBlocks;
import net.gim.craftfoundry.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTabs {
    public static final CreativeModeTab MOD_INGREDIENTS_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(CraftFoundry.MOD_ID, "mod_ingredients"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CORE_1))
                    .title(Component.translatable("creativemodetab.craftfoundry.mod_ingredients"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.CORE_1);
                        output.accept(ModItems.PRO_CORE_1);
                    })


                    .build());

    public static final CreativeModeTab MOD_MAIN_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(CraftFoundry.MOD_ID, "mod_main"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CORE_1_ORE_BLOCK))
                    .title(Component.translatable("creativemodetab.craftfoundry.mod_main"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.CORE_1_ORE_BLOCK);
                    })


                    .build());


    public static void registerModCreativeModeTabs() {
        CraftFoundry.LOGGER.info("Registering Creative Mode Tabs for " + CraftFoundry.MOD_ID);
    }
}
