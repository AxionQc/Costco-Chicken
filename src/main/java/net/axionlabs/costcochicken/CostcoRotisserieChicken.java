package net.axionlabs.costcochicken;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CostcoRotisserieChicken implements ModInitializer {
    // Create the item.
    public static final Item COSTCO_CHICKEN = new Item(new Item.Settings().food(new FoodComponent.Builder().nutrition(17).saturationModifier(1f).build()));

    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(MOD_ID, id);

        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return the registered item.
        return registeredItem;
    }

    public static final String MOD_ID = "costco";

    @Override
    public void onInitialize() {
        // Register the item.
        register(COSTCO_CHICKEN, "costco_chicken");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register((itemGroup) -> itemGroup.add(CostcoRotisserieChicken.COSTCO_CHICKEN));
    }
}