package net.gim.craftfoundry.tags;

import net.gim.craftfoundry.CraftFoundry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.trading.VillagerTrade;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_CORE_TOOL = createTag("needs_core_tool");
        public static final TagKey<Block> INCORRECT_FOR_CORE_TOOL = createTag("incorrect_for_core_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CraftFoundry.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CraftFoundry.MOD_ID, name));
        }
    }

    public static class Trades {
        public static final TagKey<VillagerTrade> CORE_SMITH_LEVEL_1 = createTag("core_smith/level_1");
        public static final TagKey<VillagerTrade> CORE_SMITH_LEVEL_2 = createTag("core_smith/level_2");

        private static TagKey<VillagerTrade> createTag(String name) {
            return TagKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(CraftFoundry.MOD_ID, name));
        }
    }
}