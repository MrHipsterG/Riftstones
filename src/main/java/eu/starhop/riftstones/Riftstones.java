package eu.starhop.riftstones;

import eu.starhop.riftstones.commands.ItemCommands;
import eu.starhop.riftstones.items.ItemManager;
import eu.starhop.riftstones.listeners.PlayerInteractListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Riftstones extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new PlayerInteractListener(), this);
        ItemManager.init();
        getCommand("giveriftstone").setExecutor(new ItemCommands());
    }
}
