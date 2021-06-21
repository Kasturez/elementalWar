package me.kasturez.elementalwar.guild.commands;

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
            Player player = (Player) sender;

            if (!FlyingPlayersList.contains(player)) {
                setFlyTrue(player);
            } else if (FlyingPlayersList.contains(player)) {
                setFlyFalse(player);
            }
        }
        return false;
    }

    public static void setFlyTrue(Player player) {
        FlyingPlayersList.add(player);
        player.setAllowFlight(true);
        player.sendMessage("Now you can !!!");
    }

    public static void setFlyFalse(Player player) {
        FlyingPlayersList.remove(player);
        player.setAllowFlight(false);
        player.sendMessage("Turning off !!!");
    }
}
