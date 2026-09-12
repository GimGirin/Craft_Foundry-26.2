package net.gim.craftfoundry.block;

import net.gim.craftfoundry.CraftFoundry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModBlocks {
    public static final Block CORE_1_ORE_BLOCK = registerBlock("core_1_ore_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            ));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CraftFoundry.MOD_ID, name))));
        Block registeredBlock = Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(CraftFoundry.MOD_ID, name), toRegister);
        registerBlockItem(name, registeredBlock);
        return registeredBlock;
    }
    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(CraftFoundry.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CraftFoundry.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        CraftFoundry.LOGGER.info("Registering Mod Blocks for " + CraftFoundry.MOD_ID);
    }
}
