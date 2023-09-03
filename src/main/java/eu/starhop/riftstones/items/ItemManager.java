package eu.starhop.riftstones.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    private static ItemStack riftstone;
    public static void init() {
        riftstone = new ItemBuilder(Material.AMETHYST_SHARD, 1)
                .setCustomModelData(CustomModeldata.RIFTSTONE_SHARD)
                .setDisplayName(ItemDisplayName.RIFTSTONE_SHARD)
                .setLore(ItemLore.RIFTSTONE_SHARD)
                .addEnchantment(Enchantment.LUCK, 1, false)
                .addItemFlags(ItemFlag.HIDE_ENCHANTS)
                .build();
    }
    public static ItemStack getRiftstone() {
        return riftstone;
    }
}
