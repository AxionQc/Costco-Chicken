package net.axionlabs.costcochicken;


import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.kaupenjoe.tutorialmod.item.ModItems;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
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
}
