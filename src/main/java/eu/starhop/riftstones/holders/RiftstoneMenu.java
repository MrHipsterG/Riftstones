package eu.starhop.riftstones.holders;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class RiftstoneMenu implements InventoryHolder {
    private final Inventory inventory;
    public RiftstoneMenu() {
        inventory = Bukkit.createInventory(this, 9, "Riftstone Menu");
        inventory.setItem(4, new ItemStack(Material.DIAMOND));
    }
    @Override
    public Inventory getInventory() {
        return inventory;
    }
}
