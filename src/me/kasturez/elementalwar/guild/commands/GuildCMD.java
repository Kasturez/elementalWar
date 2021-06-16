package me.kasturez.elementalwar.guild.commands;

import me.kasturez.elementalwar.Main;
import me.kasturez.elementalwar.guild.landClaim.LandClaim;
import me.kasturez.elementalwar.guild.utils.ChatUtils;
import me.kasturez.elementalwar.guild.utils.GuildManager;
import me.kasturez.elementalwar.guild.utils.GuildPlayers;
import me.kasturez.elementalwar.guild.utils.PlayerManager;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

public class GuildCMD implements CommandExecutor {

    private ChatUtils cu = new ChatUtils();
    private final Main plugin;
    private final LandClaim landClaim;
    private final PlayerManager playerManager;

    public GuildCMD(Main plugin, LandClaim landClaim, PlayerManager playerManager) {
        this.plugin = plugin;
        this.landClaim = landClaim;
        this.playerManager = playerManager;
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
            UUID uuid = player.getUniqueId();
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
                Chunk chunk = player.getLocation().getChunk();
                landClaim.addChunk(chunk.getX() + "," + chunk.getZ(), playerManager.getGPlayer(uuid).getElementalGuildName());
                player.sendMessage(chunk.getX() + "," + chunk.getZ());
                player.sendMessage(playerManager.getGPlayer(uuid).getElementalGuildName());
                return true;
            }

            if(args[0].equalsIgnoreCase("invite")){
                sender.sendMessage("inviting a player");
                Player invitedPlayer = Bukkit.getPlayer(args[1]);
                GuildPlayers invitedGPlayer = playerManager.getGPlayer(invitedPlayer.getUniqueId());
                return true;
            }
        }
        return false;
    }
}
