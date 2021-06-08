package me.kasturez.elementalwar.guild.commands;

import me.kasturez.elementalwar.Main;
import me.kasturez.elementalwar.guild.utils.ChatUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GuildCMD implements CommandExecutor {

    private ChatUtils cu = new ChatUtils();
    private final Main plugin;

    public GuildCMD(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("guild")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("im out!");
                return true;
            }
        }
        return false;
    }
}
