package net.supergamer.withereffect;

import net.fabricmc.api.ModInitializer;

import net.supergamer.withereffect.item.ModItems;
import net.supergamer.withereffect.potion.ModPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WitherEffect implements ModInitializer {


	public static final String MOD_ID = "withereffect";
    public static final Logger LOGGER = LoggerFactory.getLogger("withereffect");

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Mod");

		ModItems.registerModItems();
		ModPotions.registerPotions();
		ModPotions.registerPotionsRecipes();
	}
}