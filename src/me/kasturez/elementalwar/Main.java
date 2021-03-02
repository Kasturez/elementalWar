package me.kasturez.elementalwar;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("onEnable has been called");
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable has been called");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        //test command
        if (command.getName().equalsIgnoreCase("hello")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.GREEN + "you are not a player");
                return true;
            } else {
                Player player = (Player) sender;
                sender.sendMessage(ChatColor.RED + "you are a player");
                return true;
            }
        }
        return false;
    }
}
