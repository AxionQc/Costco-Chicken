package net.axionlabs.costcochicken.Items;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Items { // Fixed class name to follow Java naming conventions
    // Create the item.
    public static final Item COSTCO_CHICKEN = new Item(new Item.Settings().food(new FoodComponent.Builder().hunger(17).saturationModifier(1f).build()));

    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = new Identifier(MOD_ID, id); // Fixed Identifier creation

        // Register the item.
        Item registeredItem = Registry.register(Registries.ITEM, itemID, item);

        // Return the registered item.
        return registeredItem;
    }

    public static final String MOD_ID = "costco";
}