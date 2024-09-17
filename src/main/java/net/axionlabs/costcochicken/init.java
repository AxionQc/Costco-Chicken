package net.axionlabs.init;

import org.axionlabs.CostcoRotisserieChicken;

public class CostcoRotisserieChicken implements ModInitializer {

    @Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
        ModLootTableModifiers.modifyLootTables();
        ModCustomTrades.registerCustomTrades();

        register(COSTCO_CHICKEN, "costco_chicken");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register((itemGroup) -> itemGroup.add(CostcoRotisserieChicken.COSTCO_CHICKEN));

    }
}