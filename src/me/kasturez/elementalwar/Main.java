package me.kasturez.elementalwar;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        //Fired when the server enables the plugin
        getLogger().info("onEnable has been called");
    }

    @Override
    public void onDisable() {
        //Fired when the server stops and disables all plugins
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
        //set element
        if (command.getName().equalsIgnoreCase("launch")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("*console goes flying*");
                return true;
            }
            Player player = (Player) sender;
            if (args.length == 0) {
                sender.sendMessage(ChatColor.BLACK + "" + ChatColor.BOLD + "ZOOOOOOOOM!");
                player.setVelocity(player.getLocation().getDirection().multiply(2).setY(2));
                return true;
            }
            sender.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "ZOOOOOOOOM!");
            player.setVelocity(player.getLocation().getDirection().multiply(Integer.parseInt(args[0])).setY(2));
            return true;
        }
        return false;
    }
}
