package net.gim.craftfoundry.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.gim.craftfoundry.CraftFoundry;
import net.gim.craftfoundry.block.ModBlocks;
import net.gim.craftfoundry.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.CORE_1_ORE_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.PRO_CORE_1, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.CORE_1, ModelTemplates.FLAT_ITEM);
    }
}
