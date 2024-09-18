package net.axionlabs.costco;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CItem {

    // Create the item.
    public static final net.minecraft.item.Item COSTCO_CHICKEN = registerItem("costco_chicken", new net.minecraft.item.Item(new net.minecraft.item.Item.Settings().food(new FoodComponent.Builder().nutrition(17).saturationModifier(1f).build())));

    private static net.minecraft.item.Item registerItem(String name, net.minecraft.item.Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Init.MOD_ID, name), item);

    }
    public static void registerItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(COSTCO_CHICKEN);
        });

    }
}
