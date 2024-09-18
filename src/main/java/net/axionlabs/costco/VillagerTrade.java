package net.axionlabs.costco;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.axionlabs.costco.CItem;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;



public class VillagerTrade {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 5),
                            new ItemStack(CItem.COSTCO_CHICKEN, 1),
                            6, 5, 0.05f));
                });


    }
}