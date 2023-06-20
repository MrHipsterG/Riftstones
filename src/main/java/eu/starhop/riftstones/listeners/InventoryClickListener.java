package eu.starhop.riftstones.listeners;

import eu.starhop.riftstones.menus.MenuManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {
    @EventHandler
    public void InventoryClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        // Riftstone Menu
        if (event.getClickedInventory().equals(MenuManager.riftstoneMenu)) {
            event.setCancelled(true);
            if (event.getCurrentItem() == null) {
                return;
            }
            else if (event.getCurrentItem().getType() == Material.DIAMOND) {
                player.sendMessage("You clicked me!!!");
                player.closeInventory();
            }
        }
    }
}