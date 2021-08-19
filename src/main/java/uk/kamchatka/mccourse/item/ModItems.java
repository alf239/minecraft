package uk.kamchatka.mccourse.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import uk.kamchatka.mccourse.util.Registration;

public class ModItems {
    public static final RegistryObject<Item> EDS_SWORD =
            Registration.ITEMS.register("eds_sword",
                    () -> new SwordItem(
                            ItemTier.NETHERITE,
                            55,
                            66,
                            new Item.Properties().tab(ItemGroup.TAB_COMBAT)));

    public static void register() {
        // We merely ned to hit this class so that static fields are initialised
        // and side effects are fired which is an awful design, but still
    }
}
