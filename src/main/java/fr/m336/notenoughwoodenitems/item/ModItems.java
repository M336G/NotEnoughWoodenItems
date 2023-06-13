package fr.m336.notenoughwoodenitems.item;

import fr.m336.notenoughwoodenitems.NotEnoughWoodenItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final ToolMaterial BIRCH_TOOL_MATERIAL = new BirchToolMaterial();
    public static final ToolMaterial SPRUCE_TOOL_MATERIAL = new SpruceToolMaterial();
    public static final ToolMaterial JUNGLE_TOOL_MATERIAL = new JungleToolMaterial();
    public static final ToolMaterial ACACIA_TOOL_MATERIAL = new AcaciaToolMaterial();
    public static final ToolMaterial DARK_OAK_TOOL_MATERIAL = new DarkOakToolMaterial();
    public static final ToolMaterial MANGROVE_TOOL_MATERIAL = new MangroveToolMaterial();

    public static final Item BIRCH_SWORD = registerItem("birch_sword",
            new SwordItem(BIRCH_TOOL_MATERIAL, 0, -2.4F,
                    new FabricItemSettings()));

    public static final Item BIRCH_PICKAXE = registerItem("birch_pickaxe",
            new PickaxeItem(BIRCH_TOOL_MATERIAL, -3, -2.8F,
                    new FabricItemSettings()));

    public static final Item BIRCH_AXE = registerItem("birch_axe",
            new AxeItem(BIRCH_TOOL_MATERIAL, 3, -3.2F,
                    new FabricItemSettings()));

    public static final Item BIRCH_SHOVEL = registerItem("birch_shovel",
            new ShovelItem(BIRCH_TOOL_MATERIAL, -2, -3.0F,
                    new FabricItemSettings()));

    public static final Item BIRCH_HOE = registerItem("birch_hoe",
            new HoeItem(BIRCH_TOOL_MATERIAL, -4, -3.0F,
                    new FabricItemSettings()));

    public static final Item SPRUCE_SWORD = registerItem("spruce_sword",
            new SwordItem(SPRUCE_TOOL_MATERIAL, 0, -2.4F,
                    new FabricItemSettings()));

    public static final Item SPRUCE_PICKAXE = registerItem("spruce_pickaxe",
            new PickaxeItem(SPRUCE_TOOL_MATERIAL, -3, -2.8F,
                    new FabricItemSettings()));

    public static final Item SPRUCE_AXE = registerItem("spruce_axe",
            new AxeItem(SPRUCE_TOOL_MATERIAL, 3, -3.2F,
                    new FabricItemSettings()));

    public static final Item SPRUCE_SHOVEL = registerItem("spruce_shovel",
            new ShovelItem(SPRUCE_TOOL_MATERIAL, -2, -3.0F,
                    new FabricItemSettings()));

    public static final Item SPRUCE_HOE = registerItem("spruce_hoe",
            new HoeItem(SPRUCE_TOOL_MATERIAL, -4, -3.0F,
                    new FabricItemSettings()));

    public static final Item JUNGLE_SWORD = registerItem("jungle_sword",
            new SwordItem(JUNGLE_TOOL_MATERIAL, 0, -2.4F,
                    new FabricItemSettings()));

    public static final Item JUNGLE_PICKAXE = registerItem("jungle_pickaxe",
            new PickaxeItem(JUNGLE_TOOL_MATERIAL, -3, -2.8F,
                    new FabricItemSettings()));

    public static final Item JUNGLE_AXE = registerItem("jungle_axe",
            new AxeItem(JUNGLE_TOOL_MATERIAL, 3, -3.2F,
                    new FabricItemSettings()));

    public static final Item JUNGLE_SHOVEL = registerItem("jungle_shovel",
            new ShovelItem(JUNGLE_TOOL_MATERIAL, -2, -3.0F,
                    new FabricItemSettings()));

    public static final Item JUNGLE_HOE = registerItem("jungle_hoe",
            new HoeItem(JUNGLE_TOOL_MATERIAL, -4, -3.0F,
                    new FabricItemSettings()));

    public static final Item ACACIA_SWORD = registerItem("acacia_sword",
            new SwordItem(ACACIA_TOOL_MATERIAL, 0, -2.4F,
                    new FabricItemSettings()));

    public static final Item ACACIA_PICKAXE = registerItem("acacia_pickaxe",
            new PickaxeItem(ACACIA_TOOL_MATERIAL, -3, -2.8F,
                    new FabricItemSettings()));

    public static final Item ACACIA_AXE = registerItem("acacia_axe",
            new AxeItem(ACACIA_TOOL_MATERIAL, 3, -3.2F,
                    new FabricItemSettings()));

    public static final Item ACACIA_SHOVEL = registerItem("acacia_shovel",
            new ShovelItem(ACACIA_TOOL_MATERIAL, -2, -3.0F,
                    new FabricItemSettings()));

    public static final Item ACACIA_HOE = registerItem("acacia_hoe",
            new HoeItem(ACACIA_TOOL_MATERIAL, -4, -3.0F,
                    new FabricItemSettings()));

    public static final Item DARK_OAK_SWORD = registerItem("dark_oak_sword",
            new SwordItem(DARK_OAK_TOOL_MATERIAL, 0, -2.4F,
                    new FabricItemSettings()));

    public static final Item DARK_OAK_PICKAXE = registerItem("dark_oak_pickaxe",
            new PickaxeItem(DARK_OAK_TOOL_MATERIAL, -3, -2.8F,
                    new FabricItemSettings()));

    public static final Item DARK_OAK_AXE = registerItem("dark_oak_axe",
            new AxeItem(DARK_OAK_TOOL_MATERIAL, 3, -3.2F,
                    new FabricItemSettings()));

    public static final Item DARK_OAK_SHOVEL = registerItem("dark_oak_shovel",
            new ShovelItem(DARK_OAK_TOOL_MATERIAL, -2, -3.0F,
                    new FabricItemSettings()));

    public static final Item DARK_OAK_HOE = registerItem("dark_oak_hoe",
            new HoeItem(DARK_OAK_TOOL_MATERIAL, -4, -3.0F,
                    new FabricItemSettings()));

    public static final Item MANGROVE_SWORD = registerItem("mangrove_sword",
            new SwordItem(MANGROVE_TOOL_MATERIAL, 0, -2.4F,
                    new FabricItemSettings()));

    public static final Item MANGROVE_PICKAXE = registerItem("mangrove_pickaxe",
            new PickaxeItem(MANGROVE_TOOL_MATERIAL, -3, -2.8F,
                    new FabricItemSettings()));

    public static final Item MANGROVE_AXE = registerItem("mangrove_axe",
            new AxeItem(MANGROVE_TOOL_MATERIAL, 3, -3.2F,
                    new FabricItemSettings()));

    public static final Item MANGROVE_SHOVEL = registerItem("mangrove_shovel",
            new ShovelItem(MANGROVE_TOOL_MATERIAL, -2, -3.0F,
                    new FabricItemSettings()));

    public static final Item MANGROVE_HOE = registerItem("mangrove_hoe",
            new HoeItem(MANGROVE_TOOL_MATERIAL, -4, -3.0F,
                    new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,new Identifier(NotEnoughWoodenItems.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, BIRCH_SWORD);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, BIRCH_PICKAXE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, BIRCH_AXE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, BIRCH_SHOVEL);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, BIRCH_HOE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, SPRUCE_SWORD);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, SPRUCE_PICKAXE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, SPRUCE_AXE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, SPRUCE_SHOVEL);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, SPRUCE_HOE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, JUNGLE_SWORD);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, JUNGLE_PICKAXE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, JUNGLE_AXE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, JUNGLE_SHOVEL);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, JUNGLE_HOE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, ACACIA_SWORD);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, ACACIA_PICKAXE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, ACACIA_AXE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, ACACIA_SHOVEL);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, ACACIA_HOE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, DARK_OAK_SWORD);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, DARK_OAK_PICKAXE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, DARK_OAK_AXE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, DARK_OAK_SHOVEL);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, DARK_OAK_HOE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, MANGROVE_SWORD);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, MANGROVE_PICKAXE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, MANGROVE_AXE);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, MANGROVE_SHOVEL);
        addToItemGroup(ModItemGroup.NOTENOUGHWOODENITEMS, MANGROVE_HOE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        NotEnoughWoodenItems.LOGGER.info("Registering mod items for " + NotEnoughWoodenItems.MOD_ID);

        addItemsToItemGroup();
    }
}
