package me.kasturez.elementalwar.guild.commands;

import me.kasturez.elementalwar.Main;
import me.kasturez.elementalwar.guild.landClaim.LandClaim;
import me.kasturez.elementalwar.guild.utils.ChatUtils;
import me.kasturez.elementalwar.guild.utils.GuildManager;
import me.kasturez.elementalwar.guild.utils.GuildPlayer;
import me.kasturez.elementalwar.guild.utils.PlayerManager;
import org.bukkit.Chunk;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

public class GuildCMD implements CommandExecutor {

    private final LandClaim landClaim;
    private final PlayerManager playerManager;

    public GuildCMD( LandClaim landClaim, PlayerManager playerManager) {
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
            GuildPlayer guildPlayer = playerManager.getGPlayer(uuid);
            // sender is a player
            if (args.length == 0) {
                sender.sendMessage("guild info");
                landClaim.showAllClaimedChunk(player);
                player.sendMessage(guildPlayer.toString());
                player.sendMessage(GuildManager.getGuilds().toString());
                return true;
            }

            if (args[0].equalsIgnoreCase("create")) {
                if (args.length == 1) {
                    sender.sendMessage("guild need a name");
                    return true;
                }
                if (!(GuildManager.findElementalGuildByName(args[1]) == null)){
                    player.sendMessage("that name already exist");
                    return true;
                }
                if (!(guildPlayer.getElementalGuildName().equalsIgnoreCase("wild"))){
                    player.sendMessage("please leave/disband your current guild first");
                    return true;
                }
                GuildManager.createGuild(args[1], guildPlayer);
                playerManager.getGPlayer(uuid).setElementalGuildName(args[1]);
                sender.sendMessage("created guild with name: " + args[1]);
                sender.sendMessage(guildPlayer.toString());
                return true;
            }

            if (args[0].equalsIgnoreCase("claim")) {
                Chunk chunk = player.getLocation().getChunk();
                String chunkID = chunk.getX() + "," + chunk.getZ();
                if (landClaim.isClaimed(chunkID)) {
                    player.sendMessage("this chunk is already claimed!");
                    return true;
                }
                landClaim.addChunk(chunkID, guildPlayer.getElementalGuildName());
                return true;
            }

            if (args[0].equalsIgnoreCase("invite")) {
                sender.sendMessage("inviting a player");
                return true;
            }

            if (args[0].equalsIgnoreCase("disband")) {
                GuildManager.disbandGuild(guildPlayer.getElementalGuildName());
                guildPlayer.setElementalGuildName("wild");
                return true;
            }

            if (args[0].equalsIgnoreCase("unclaim")) {
                Chunk chunk = player.getLocation().getChunk();
                String chunkID = chunk.getX() + "," + chunk.getZ();
                if (!landClaim.isClaimed(chunkID)) {
                    player.sendMessage("this chunk isn't claimed!");
                    return true;
                }
                if (!landClaim.getGuild(chunkID).equalsIgnoreCase(guildPlayer.getElementalGuildName())) {
                    player.sendMessage("you can't unclaim chunks your guild don't own");
                    return true;
                }
                landClaim.removeChunkByKey(chunkID);
                return true;
            }
        }
        return false;
    }
}
