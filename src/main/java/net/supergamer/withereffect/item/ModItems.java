package net.supergamer.withereffect.item;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistry;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.supergamer.withereffect.WitherEffect;

public class ModItems {




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WitherEffect.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WitherEffect.LOGGER.info("Registering Mod Items for " + WitherEffect.MOD_ID);
    }

}
