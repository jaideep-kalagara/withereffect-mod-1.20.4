package net.supergamer.withereffect.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.supergamer.withereffect.WitherEffect;

public class ModPotions {
    public static Potion DECAY_POTION;


    public static  Potion registerPotion(String name) {
        return Registry.register(Registries.POTION, new Identifier(WitherEffect.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.WITHER, 300, 0)));
    }


    public static void registerPotions() {
        DECAY_POTION = registerPotion("decay_potion");
    }

    public static void registerPotionsRecipes(){
        BrewingRecipeRegistry.registerPotionRecipe(Potions.AWKWARD, Items.WITHER_ROSE, ModPotions.DECAY_POTION);
    }
}
