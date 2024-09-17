package net.axionlabs.init;

import net.axionlabs.items;
import net.axionlabs.villager;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class init implements ModInitializer {

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