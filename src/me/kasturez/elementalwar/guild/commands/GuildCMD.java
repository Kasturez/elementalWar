package me.kasturez.elementalwar.guild.commands;

import me.kasturez.elementalwar.Main;
import me.kasturez.elementalwar.guild.utils.ChatUtils;
import me.kasturez.elementalwar.guild.utils.GuildManager;
import me.kasturez.elementalwar.guild.utils.GuildPlayers;
import me.kasturez.elementalwar.guild.utils.PlayerManager;
import org.bukkit.Bukkit;
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
        if (cmd.getName().equalsIgnoreCase("guild")) {
            if (!(sender instanceof Player)) {
                // sender is a server
                sender.sendMessage("im out!");
                return true;
            }

            Player player = (Player) sender;
            // sender is a player
            if(args.length == 0){
                sender.sendMessage("guild info");
                return true;
            }

            if(args[0].equalsIgnoreCase("create")){
                sender.sendMessage("creating guild");
                if (args.length == 1){
                    sender.sendMessage("guild need a name");
                    return true;
                }
                GuildManager.createGuild(args[1], player);
                sender.sendMessage("created guild with name: " + args[1]);
                return true;
            }

            if(args[0].equalsIgnoreCase("claim")){
                sender.sendMessage("claiming");
                player.getLocation().getChunk();
                return true;
            }

            if(args[0].equalsIgnoreCase("invite")){
                sender.sendMessage("inviting a player");
                Player invitedPlayer = Bukkit.getPlayer(args[1]);
                GuildPlayers invitedGPlayer = PlayerManager.getGPlayer(invitedPlayer.getUniqueId());
                return true;
            }
        }
        return false;
    }
}
