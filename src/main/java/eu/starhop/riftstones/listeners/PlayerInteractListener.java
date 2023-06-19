package eu.starhop.riftstones.listeners;

import eu.starhop.riftstones.items.ItemManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PlayerInteractListener implements Listener {

    @EventHandler
    public static void onRightClick(PlayerInteractEvent event) {
        if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            if (event.getItem() != null ) {
                if (event.getItem().getItemMeta().equals(ItemManager.riftstone.getItemMeta())) {
                    Player player = event.getPlayer();
                    player.setAllowFlight(!player.getAllowFlight());
                    player.sendMessage("Flight Toggled");
                }
            }
        }
    }
}
