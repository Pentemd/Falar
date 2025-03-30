package fr.pentalonwaterprof.falar.init;

import fr.pentalonwaterprof.falar.utils.CustomArmorMaterials;
import fr.pentalonwaterprof.falar.utils.CustomItemTiers;
import fr.pentalonwaterprof.falar.utils.ModItemGroups;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ModItems
{

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "falar"); // verif Falar.MODID
    public static final Item.Properties basicProperties = new Item.Properties().group(ModItemGroups.FALAR_TAB);


    public static final RegistryObject<Item> AMETHYST_INGOT = ITEMS.register("amethyst_ingot", () -> new Item(basicProperties));
    public static final RegistryObject<Item> TITANE_INGOT = ITEMS.register("titane_ingot", () -> new Item(basicProperties));
    public static final RegistryObject<Item> PALADIUM_INGOT = ITEMS.register("paladium_ingot", () -> new Item(basicProperties));
    public static final RegistryObject<Item> PALADIUM_GREEN_INGOT = ITEMS.register("paladium_green_ingot", () -> new Item(basicProperties));
    public static final RegistryObject<Item> FINDIUM = ITEMS.register("findium", () -> new Item(basicProperties));
    public static final RegistryObject<Item> ENDIUM_INGOT = ITEMS.register("endium_ingot", () -> new Item(basicProperties));
    public static final RegistryObject<Item> ENDIUM_NUGGET = ITEMS.register("endium_nugget", () -> new Item(basicProperties));


    public static final RegistryObject<Item> AMETHYST_STICK = ITEMS.register("amethyst_stick", () -> new Item(basicProperties));
    public static final RegistryObject<Item> PALADIUM_STICK = ITEMS.register("paladium_stick", () -> new Item(basicProperties));
    public static final RegistryObject<Item> TITANE_STICK = ITEMS.register("titane_stick", () -> new Item(basicProperties));

    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword", () -> new SwordItem(CustomItemTiers.AMETHYST, 3, 2f, basicProperties));
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel", () -> new ShovelItem(CustomItemTiers.AMETHYST, 0, -2.5f, basicProperties));
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe", () -> new AxeItem(CustomItemTiers.AMETHYST, 0,-2.5f, basicProperties));
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe", () -> new PickaxeItem(CustomItemTiers.AMETHYST, 0, -2.5f, basicProperties));

    public static final RegistryObject<Item> TITANE_SWORD = ITEMS.register("titane_sword", () -> new SwordItem(CustomItemTiers.TITANE, 4, 2.5f, basicProperties));
    public static final RegistryObject<Item> TITANE_SHOVEL = ITEMS.register("titane_shovel", () -> new ShovelItem(CustomItemTiers.TITANE, 0, -2f, basicProperties));
    public static final RegistryObject<Item> TITANE_AXE = ITEMS.register("titane_axe", () -> new AxeItem(CustomItemTiers.TITANE, 0,-2f, basicProperties));
    public static final RegistryObject<Item> TITANE_PICKAXE = ITEMS.register("titane_pickaxe", () -> new PickaxeItem(CustomItemTiers.TITANE, 0, -2f, basicProperties));

    public static final RegistryObject<Item> PALADIUM_SWORD = ITEMS.register("paladium_sword", () -> new SwordItem(CustomItemTiers.PALADIUM, 7, 3f, basicProperties));
    public static final RegistryObject<Item> PALADIUM_SHOVEL = ITEMS.register("paladium_shovel", () -> new ShovelItem(CustomItemTiers.PALADIUM, 0, -2f, basicProperties));
    public static final RegistryObject<Item> PALADIUM_AXE = ITEMS.register("paladium_axe", () -> new AxeItem(CustomItemTiers.PALADIUM, 0,-2f, basicProperties));
    public static final RegistryObject<Item> PALADIUM_PICKAXE = ITEMS.register("paladium_pickaxe", () -> new PickaxeItem(CustomItemTiers.PALADIUM, 0, -2f, basicProperties));

    public static final RegistryObject<Item> ENDIUM_SWORD = ITEMS.register("endium_sword", () -> new SwordItem(CustomItemTiers.ENDIUM, 8, 3f, basicProperties));
    public static final RegistryObject<Item> ENDIUM_AXE = ITEMS.register("endium_axe", () -> new AxeItem(CustomItemTiers.ENDIUM, 0,-2f, basicProperties));
    public static final RegistryObject<Item> ENDIUM_PICKAXE = ITEMS.register("endium_pickaxe", () -> new PickaxeItem(CustomItemTiers.ENDIUM, 0, -2f, basicProperties));

    public static final RegistryObject<Item> PALADIUM_GREEN_SWORD = ITEMS.register("paladium_green_sword", () -> new SwordItem(CustomItemTiers.PALADIUM_GREEN, 4, 2.5f, basicProperties));
    public static final RegistryObject<Item> PALADIUM_GREEN_SHOVEL = ITEMS.register("paladium_green_shovel", () -> new ShovelItem(CustomItemTiers.PALADIUM_GREEN, 0, -2f, basicProperties));
    public static final RegistryObject<Item> PALADIUM_GREEN_AXE = ITEMS.register("paladium_green_axe", () -> new AxeItem(CustomItemTiers.PALADIUM_GREEN, 0,-2f, basicProperties));
    public static final RegistryObject<Item> PALADIUM_GREEN_PICKAXE = ITEMS.register("paladium_green_pickaxe", () -> new PickaxeItem(CustomItemTiers.PALADIUM_GREEN, 0, -2f, basicProperties));



    public static final RegistryObject<Item> AMETHYST_HELMET = ITEMS.register("amethyst_helmet", () -> new ArmorItem(CustomArmorMaterials.AMETHYST_ARMOR, EquipmentSlotType.HEAD, basicProperties));
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE = ITEMS.register("amethyst_chestplate", () -> new ArmorItem(CustomArmorMaterials.AMETHYST_ARMOR, EquipmentSlotType.CHEST, basicProperties));
    public static final RegistryObject<Item> AMETHYST_LEGGINGS = ITEMS.register("amethyst_leggings", () -> new ArmorItem(CustomArmorMaterials.AMETHYST_ARMOR, EquipmentSlotType.LEGS,basicProperties));
    public static final RegistryObject<Item> AMETHYST_BOOTS = ITEMS.register("amethyst_boots", () -> new ArmorItem(CustomArmorMaterials.AMETHYST_ARMOR, EquipmentSlotType.FEET, basicProperties));

    public static final RegistryObject<Item> TITANE_HELMET = ITEMS.register("titane_helmet", () -> new ArmorItem(CustomArmorMaterials.TITANE_ARMOR, EquipmentSlotType.HEAD, basicProperties));
    public static final RegistryObject<Item> TITANE_CHESTPLATE = ITEMS.register("titane_chestplate", () -> new ArmorItem(CustomArmorMaterials.TITANE_ARMOR, EquipmentSlotType.CHEST, basicProperties));
    public static final RegistryObject<Item> TITANE_LEGGINGS = ITEMS.register("titane_leggings", () -> new ArmorItem(CustomArmorMaterials.TITANE_ARMOR, EquipmentSlotType.LEGS,basicProperties));
    public static final RegistryObject<Item> TITANE_BOOTS = ITEMS.register("titane_boots", () -> new ArmorItem(CustomArmorMaterials.TITANE_ARMOR, EquipmentSlotType.FEET, basicProperties));

    public static final RegistryObject<Item> PALADIUM_HELMET = ITEMS.register("paladium_helmet", () -> new ArmorItem(CustomArmorMaterials.PALADIUM_ARMOR, EquipmentSlotType.HEAD, basicProperties));
    public static final RegistryObject<Item> PALADIUM_CHESTPLATE = ITEMS.register("paladium_chestplate", () -> new ArmorItem(CustomArmorMaterials.PALADIUM_ARMOR, EquipmentSlotType.CHEST, basicProperties));
    public static final RegistryObject<Item> PALADIUM_LEGGINGS = ITEMS.register("paladium_leggings", () -> new ArmorItem(CustomArmorMaterials.PALADIUM_ARMOR, EquipmentSlotType.LEGS,basicProperties));
    public static final RegistryObject<Item> PALADIUM_BOOTS = ITEMS.register("paladium_boots", () -> new ArmorItem(CustomArmorMaterials.PALADIUM_ARMOR, EquipmentSlotType.FEET, basicProperties));

    public static final RegistryObject<Item> ENDIUM_HELMET = ITEMS.register("endium_helmet", () -> new ArmorItem(CustomArmorMaterials.ENDIUM_ARMOR, EquipmentSlotType.HEAD, basicProperties));
    public static final RegistryObject<Item> ENDIUM_CHESTPLATE = ITEMS.register("endium_chestplate", () -> new ArmorItem(CustomArmorMaterials.ENDIUM_ARMOR, EquipmentSlotType.CHEST, basicProperties));
    public static final RegistryObject<Item> ENDIUM_LEGGINGS = ITEMS.register("endium_leggings", () -> new ArmorItem(CustomArmorMaterials.ENDIUM_ARMOR, EquipmentSlotType.LEGS,basicProperties));
    public static final RegistryObject<Item> ENDIUM_BOOTS = ITEMS.register("endium_boots", () -> new ArmorItem(CustomArmorMaterials.ENDIUM_ARMOR, EquipmentSlotType.FEET, basicProperties));

    public static final RegistryObject<Item> PALADIUM_GREEN_HELMET = ITEMS.register("paladium_green_helmet", () -> new ArmorItem(CustomArmorMaterials.PALADIUM_GREEN_ARMOR, EquipmentSlotType.HEAD, basicProperties));
    public static final RegistryObject<Item> PALADIUM_GREEN_CHESTPLATE = ITEMS.register("paladium_green_chestplate", () -> new ArmorItem(CustomArmorMaterials.PALADIUM_GREEN_ARMOR, EquipmentSlotType.CHEST, basicProperties));
    public static final RegistryObject<Item> PALADIUM_GREEN_LEGGINGS = ITEMS.register("paladium_green_leggings", () -> new ArmorItem(CustomArmorMaterials.PALADIUM_GREEN_ARMOR, EquipmentSlotType.LEGS,basicProperties));
    public static final RegistryObject<Item> PALADIUM_GREEN_BOOTS = ITEMS.register("paladium_green_boots", () -> new ArmorItem(CustomArmorMaterials.PALADIUM_GREEN_ARMOR, EquipmentSlotType.FEET, basicProperties));

    /*

    public static void createArmor(String materialNameIn, IArmorMaterial armorMaterialIn, Item.Properties propertiesHelmetIn, Item.Properties propertiesChestplateIn, Item.Properties propertiesLeggingsIn, Item.Properties propertiesBootsIn)
    {

        String helmetName = materialNameIn + "_" + "helmet";
        String chestPlateName = materialNameIn + "_" + "chestplate";
        String leggingsName = materialNameIn+ "_" + "leggings";
        String bootsName = materialNameIn + "_" + "boots";

        RegistryObject<Item> HELMET = ITEMS.register(helmetName, () -> new ArmorItem(armorMaterialIn, EquipmentSlotType.HEAD, propertiesHelmetIn));
        RegistryObject<Item> CHESTPLATE = ITEMS.register(chestPlateName, () -> new ArmorItem(armorMaterialIn, EquipmentSlotType.CHEST, propertiesChestplateIn));
        RegistryObject<Item> Leggings = ITEMS.register(leggingsName, () -> new ArmorItem(armorMaterialIn, EquipmentSlotType.LEGS, propertiesLeggingsIn));
        RegistryObject<Item> BOOTS = ITEMS.register(bootsName, () -> new ArmorItem(armorMaterialIn, EquipmentSlotType.HEAD, propertiesBootsIn));

        itemsFalar.put(helmetName, HELMET);
        itemsFalar.put(chestPlateName, CHESTPLATE);
        itemsFalar.put(leggingsName, Leggings);
        itemsFalar.put(bootsName, BOOTS);


    }
    public static void createArmor(String materialNameIn, IArmorMaterial armorMaterialIn, Item.Properties properties) {
        String helmetName = materialNameIn + "_" + "helmet";
        String chestPlateName = materialNameIn + "_" + "chestplate";
        String leggingsName = materialNameIn + "_" + "leggings";
        String bootsName = materialNameIn + "_" + "boots";

        RegistryObject<Item> HELMET = ITEMS.register(helmetName, () -> new ArmorItem(armorMaterialIn, EquipmentSlotType.HEAD, properties));
        RegistryObject<Item> CHESTPLATE = ITEMS.register(chestPlateName, () -> new ArmorItem(armorMaterialIn, EquipmentSlotType.CHEST, properties));
        RegistryObject<Item> Leggings = ITEMS.register(leggingsName, () -> new ArmorItem(armorMaterialIn, EquipmentSlotType.LEGS, properties));
        RegistryObject<Item> BOOTS = ITEMS.register(bootsName, () -> new ArmorItem(armorMaterialIn, EquipmentSlotType.HEAD, properties));

        itemsFalar.put(helmetName, HELMET);
        itemsFalar.put(chestPlateName, CHESTPLATE);
        itemsFalar.put(leggingsName, Leggings);
        itemsFalar.put(bootsName, BOOTS);


    }

    public static Map<String, RegistryObject<Item>> itemsFalar = new HashMap<>();



*/
}



/*

{

}












/*{
  "type": "minecraft:block",
  "pools": [
    {
      "rolls": 1,
      "entries": [
        {
          "type": "minecraft:alternatives",
          "children": [
            {
              "type": "minecraft:item",
              "conditions": [
                {
                  "condition": "minecraft:match_tool",
                  "predicate": {
                    "enchantments" : [
                      {
                      "enchantment": "minecraft:silk_touch",
                      "levels": {
                        "min": 1
                    }
                  }
                ]
              }
            }
          ]
        }
      ]
    }
  ]
}
 */