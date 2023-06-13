package fr.m336.notenoughwoodenitems.item;

import fr.m336.notenoughwoodenitems.NotEnoughWoodenItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup NOTENOUGHWOODENITEMS;

    public static void registerItemGroups() {
        NOTENOUGHWOODENITEMS = FabricItemGroup.builder(new Identifier(NotEnoughWoodenItems.MOD_ID, "notenoughwoodenitems"))
                .displayName(Text.translatable("itemgroup.notenoughwoodenitems"))
                .icon(() -> new ItemStack(ModItems.JUNGLE_PICKAXE)).build();
    }
}
