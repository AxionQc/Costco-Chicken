package net.axionlabs.costcochicken.Villager;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.axionlabs.costcochicken.Items; // Corrected import statement
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class Villager {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.costcochicken, 7),
                            6, 5, 0.05f));
                });
    }
    public static final String MOD_ID = "costco";
}