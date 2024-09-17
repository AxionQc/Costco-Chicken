package net.axionlabs.costcochicken.Init;

import net.axionlabs.costcochicken.Items; // Corrected import statement
import net.axionlabs.costcochicken.Villager; // Corrected import statement

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Init implements ModInitializer {

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModLootTableModifiers.modifyLootTables();
        Villager.registerCustomTrades(); // Corrected method call

        register(COSTCO_CHICKEN, "costco_chicken");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register((itemGroup) -> itemGroup.add(CostcoRotisserieChicken.COSTCO_CHICKEN));
    }
}