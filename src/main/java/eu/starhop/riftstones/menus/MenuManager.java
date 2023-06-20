package eu.starhop.riftstones.menus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MenuManager {

    public static Inventory riftstoneMenu;
    public static void init() {
        createRiftstoneMenu();
    }
    public static void createRiftstoneMenu() {
        riftstoneMenu = Bukkit.createInventory(null, 9, "Riftstone Menu");
        riftstoneMenu.setItem(4, new ItemStack(Material.DIAMOND));
    }
}
