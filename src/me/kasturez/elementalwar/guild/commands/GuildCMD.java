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

    /*public void guild(Main main){
        plugin = main;
    }*/

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("guild")) {
            if (!(sender instanceof Player)) {
                // sender is a server
                sender.sendMessage("im out!");
                return true;
            }
            // sender is a player
            if(args.length == 0){
                sender.sendMessage("guild info");
                return true;
            }

            if(args[0].equalsIgnoreCase("create")){
                sender.sendMessage("creating guild");
                return true;
            }
            if(args[0].equalsIgnoreCase("invite")){
                sender.sendMessage("inviting a player");
                return true;
            }
        }
        return false;
    }
}
