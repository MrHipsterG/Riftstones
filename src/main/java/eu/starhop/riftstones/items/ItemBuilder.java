package eu.starhop.riftstones.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemBuilder {
    private ItemStack item;
    private ItemMeta meta;
    public ItemBuilder(Material material, int amount) {
        this.item = new ItemStack(material, amount);
        this.meta = item.getItemMeta();
    }
    public ItemBuilder setDisplayName(String name) {
        meta.setDisplayName(name);
        return this;
    }
    public ItemBuilder setLore(String... lore) {
        ArrayList<String> aLore = new ArrayList<>();
        aLore.addAll(Arrays.asList(lore));
        meta.setLore(aLore);
        return this;
    }
    public ItemBuilder setCustomModelData(int data) {
        meta.setCustomModelData(data);
        return this;
    }
    public ItemBuilder addEnchantment(Enchantment enchantment, int level, boolean ignoreLevelRestriction) {
        meta.addEnchant(enchantment, level, ignoreLevelRestriction);
        return this;
    }
    public ItemBuilder addItemFlags(ItemFlag... flags) {
        meta.addItemFlags(flags);
        return this;
    }
    public ItemStack build() {
        return item;
    }

}
