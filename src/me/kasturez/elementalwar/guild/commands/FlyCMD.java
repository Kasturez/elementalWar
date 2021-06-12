package me.DanXChaos.JerryProject;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class FlyCMD implements CommandExecutor {

    private static ArrayList<Player> FlyingPlayersList = new ArrayList<>();
    private static ArrayList<Player> AfterFlyingCD = new ArrayList<>();
    private static int counter = 0;

    public static ArrayList<Player> getFlyingPlayersList() {
        return FlyingPlayersList;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("fly")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("You r a SERVER!!!");
                return true;
            }
            Player p = (Player) sender;

            if (!FlyingPlayersList.contains(p)) {
                setFlyTrue(p);
            } else if (FlyingPlayersList.contains(p)) {
                setFlyFalse(p);
            }
        }
        return false;
    }

    public static void setFlyTrue(Player p) {
        FlyingPlayersList.add(p);
        p.setAllowFlight(true);
        p.sendMessage("Now you can !!!");
    }

    public static void setFlyFalse(Player p) {
        FlyingPlayersList.remove(p);
        p.setAllowFlight(false);
        p.sendMessage("Turning off !!!");
    }
}
