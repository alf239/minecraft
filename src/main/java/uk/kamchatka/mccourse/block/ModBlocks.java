package uk.kamchatka.mccourse.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import uk.kamchatka.mccourse.util.Registration;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> MUSHROOM_BLOCK = register("mushroom_block",
            () -> new Block(AbstractBlock.Properties.of(Material.NETHER_WOOD)
                    .strength(3f, 10f)
                    .sound(SoundType.NETHER_BRICKS)));

    public static void register() {
        // We merely ned to hit this class so that static fields are initialised
        // and side effects are fired which is an awful design, but still
    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> result = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(result.get(), new Item.Properties()
                .tab(ItemGroup.TAB_BUILDING_BLOCKS)));
        return result;
    }
}
