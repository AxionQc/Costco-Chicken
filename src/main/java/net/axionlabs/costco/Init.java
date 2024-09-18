package net.axionlabs.costco;

import net.fabricmc.api.ModInitializer;
import net.axionlabs.costco.VillagerTrade;
import net.axionlabs.costco.CItem;
import net.axionlabs.costco.Init;

public class Init implements ModInitializer {
        public static final String MOD_ID = "costco";
    @Override
    public void onInitialize() {
        CItem.registerItems();
        VillagerTrade.registerCustomTrades();

    }

}
