package eu.starhop.riftstones.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    public static ItemStack riftstone;
    public static void init() {
        createRiftstone();
    }
    private static void createRiftstone() {
        ItemStack item = new ItemStack(Material.AMETHYST_SHARD, 1);
        ItemMeta meta = item.getItemMeta();
        // Custom Model ID 1001 Riftstone shard
        meta.setCustomModelData(1001);
        meta.setDisplayName("Riftstone Shard");
        List<String> lore = new ArrayList<>();
        lore.add("Magic Item");
        lore.add("Allows you to teleport around.");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        riftstone = item;
    }
}
