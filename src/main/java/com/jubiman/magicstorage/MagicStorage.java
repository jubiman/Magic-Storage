package com.jubiman.magicstorage;

import com.jubiman.magicstorage.examples.*;
import com.jubiman.magicstorage.object.CraftingAccess;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.*;
import necesse.inventory.item.Item;
import necesse.level.gameObject.GameObject;
import necesse.level.gameObject.furniture.StorageBoxInventoryObject;


@ModEntry
public class MagicStorage {
	public void init() {
		System.out.println("Magic Storage loading");


		// Register out objects
		ObjectRegistry.registerObject("craftingaccess", new CraftingAccess(), 2, true);


		PacketRegistry.registerPacket(ExamplePacket.class);
	}

	public void postInit() {
		// Add recipes
		// Example staff recipe, crafted in workstation using 4 example items and 10 gold bars
        /*Recipes.registerModRecipe(new Recipe(
                "craftingaccess",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("exampleitem", 4),
                        new Ingredient("goldbar", 10)
                }
        ));*/
	}
}
