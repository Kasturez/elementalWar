package me.kasturez.elementalwar.guild.commands;

import me.kasturez.elementalwar.Main;
import me.kasturez.elementalwar.guild.utils.*;
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
            // sender is a player
            Player p = (Player) sender;
            GuildPlayers gp = PlayerManager.getGPlayer(p.getUniqueId());

            //guild info
            if (args.length == 0) {
                sender.sendMessage("guild info");
                return true;
            }

            //Creating a guild
            if (args[0].equalsIgnoreCase("create")) {
                if(gp)
                GuildManager.createGuild(args[1],gp);
                sender.sendMessage("U r the admin of " + args[1]);

                return true;
            }

            //Inviting a player to a guild
            if (args[0].equalsIgnoreCase("invite")) {

                Player invitedPlayer = Bukkit.getPlayer(args[1]);
                GuildPlayers invitedGPlayer = PlayerManager.getGPlayer(invitedPlayer.getUniqueId());
                sender.sendMessage("You've invited " + invitedPlayer + "to ur guild");
                invitedPlayer.sendMessage("U'r being invited to ");
                return true;
            }


        }
        return false;
    }
}
