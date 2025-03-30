package fr.pentalonwaterprof.falar.utils;

import fr.pentalonwaterprof.falar.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ModItemGroups
{
    public static final ItemGroup FALAR_TAB = new ItemGroup("falar_tab") {
        @Override
        public ItemStack createIcon() {
            return ModItems.PALADIUM_INGOT.get().getDefaultInstance();
            //return new ItemStack(ModItems.PALADIUM_INGOT.get());
        }

    };
}
