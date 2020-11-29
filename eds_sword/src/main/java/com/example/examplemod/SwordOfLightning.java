package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class SwordOfLightning extends ItemSword {
    public SwordOfLightning(ToolMaterial material) {
        super(material);
        setRegistryName("eds_sword");
        setUnlocalizedName("eds_sword");
        setCreativeTab(CreativeTabs.COMBAT);
    }
}
