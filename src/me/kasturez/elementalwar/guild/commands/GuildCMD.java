package me.kasturez.elementalwar.guild.commands;

import me.kasturez.elementalwar.guild.landClaim.LandClaim;
import me.kasturez.elementalwar.guild.utils.*;
import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

public class GuildCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("guild")) {
            if (!(sender instanceof Player)) {
                // sender is a server
                sender.sendMessage("im out!");
                return true;
            }

            // sender is a player
            Player player = (Player) sender;
            UUID uuid = player.getUniqueId();
            GuildPlayer guildPlayer = PlayerManager.getGPlayer(uuid);
            if (args.length == 0) {
                sender.sendMessage("guild info");
                LandClaim.showAllClaimedChunk(player);
                player.sendMessage(guildPlayer.toString());
                player.sendMessage(GuildManager.getGuilds().toString());
                return true;
            }

            //done
            if (!args[0].equalsIgnoreCase("create")) {
                if (guildPlayer.getElementalGuildName().equalsIgnoreCase("wild")){
                    player.sendMessage("please do /guild create first!");
                    return true;
                }
            }

            if (args[0].equalsIgnoreCase("promote")) {
                Player player1 = Bukkit.getPlayer(args[1]);
                if (player1 == null) {
                    player.sendMessage("can't find this player");
                    return true;
                }
                GuildPlayer guildPlayerBeingPromote = PlayerManager.getGPlayer(player1.getUniqueId());
                if (!(guildPlayerBeingPromote.getElementalGuildName().equalsIgnoreCase(guildPlayer.getElementalGuildName()))) {
                    player.sendMessage("you can only promote player from your guild");
                    return true;
                }
                if (guildPlayerBeingPromote.getGuildRanks() == GuildRanks.RECRUIT){
                    guildPlayerBeingPromote.setGuildRanks(GuildRanks.MEMBER);
                    player.sendMessage("promote successfully");
                    return true;
                }
                player.sendMessage("can't promote player");
                return true;
            }

            if (args[0].equalsIgnoreCase("demote")) {
                Player player1 = Bukkit.getPlayer(args[1]);
                if (player1 == null) {
                    player.sendMessage("can't find this player");
                    return true;
                }
                GuildPlayer guildPlayerBeingPromote = PlayerManager.getGPlayer(player1.getUniqueId());
                if (!(guildPlayerBeingPromote.getElementalGuildName().equalsIgnoreCase(guildPlayer.getElementalGuildName()))) {
                    player.sendMessage("you can only demote player from your guild");
                    return true;
                }
                if (guildPlayerBeingPromote.getGuildRanks() == GuildRanks.MEMBER){
                    guildPlayerBeingPromote.setGuildRanks(GuildRanks.RECRUIT);
                    player.sendMessage("demote successfully");
                    return true;
                }
                player.sendMessage("can't demote player");
                return true;
            }

            //done
            if (args[0].equalsIgnoreCase("create")) {
                if (args.length == 1) {
                    sender.sendMessage("guild need a name");
                    return true;
                }
                if (!(GuildManager.findElementalGuildByName(args[1]) == null)) {
                    player.sendMessage("that name already exist");
                    return true;
                }
                GuildManager.createGuild(args[1], guildPlayer);
                PlayerManager.getGPlayer(uuid).setElementalGuildName(args[1]);
                sender.sendMessage("created guild with name: " + args[1]);
                return true;
            }

            //done
            if (args[0].equalsIgnoreCase("claim")) {
                Chunk chunk = player.getLocation().getChunk();
                String chunkID = chunk.getX() + "," + chunk.getZ();
                if (LandClaim.isClaimed(chunkID)) {
                    player.sendMessage("this chunk is already claimed!");
                    return true;
                }
                LandClaim.addChunk(chunkID, guildPlayer.getElementalGuildName());
                return true;
            }

            if (args[0].equalsIgnoreCase("invite")) {
                sender.sendMessage("inviting a player");
                return true;
            }

            //done
            if (args[0].equalsIgnoreCase("leave")) {
                GuildManager.findElementalGuildByName(guildPlayer.getElementalGuildName()).removePlayer(guildPlayer);
            }

            //done
            if (args[0].equalsIgnoreCase("kick")) {
                Player player1 = Bukkit.getPlayer(args[1]);
                if (player1 == null) {
                    player.sendMessage("cant find player");
                    return true;
                }
                GuildPlayer guildPlayerBeingKick = PlayerManager.getGPlayer(player1.getUniqueId());
                if (!guildPlayer.getElementalGuildName().equalsIgnoreCase(guildPlayerBeingKick.getElementalGuildName())) {
                    player.sendMessage("that player isn't in your guild");
                    return true;
                }
                GuildManager.findElementalGuildByName(guildPlayerBeingKick.getElementalGuildName()).removePlayer(guildPlayerBeingKick);
            }

            //done
            if (args[0].equalsIgnoreCase("disband")) {
                if (guildPlayer.getGuildRanks() != GuildRanks.ADMIN) {
                    player.sendMessage("you cant disband as you are not the guild admin");
                    return true;
                }
                String elementalGuildName = guildPlayer.getElementalGuildName();
                GuildManager.disbandGuild(elementalGuildName);
                LandClaim.removeChunkByValue(elementalGuildName);
                guildPlayer.setElementalGuildName("wild");
                return true;
            }

            if (args[0].equalsIgnoreCase("unclaim")) {
                Chunk chunk = player.getLocation().getChunk();
                String chunkID = chunk.getX() + "," + chunk.getZ();
                if (!LandClaim.isClaimed(chunkID)) {
                    player.sendMessage("this chunk isn't claimed!");
                    return true;
                }
                if (!LandClaim.getGuild(chunkID).equalsIgnoreCase(guildPlayer.getElementalGuildName())) {
                    player.sendMessage("you can't unclaim chunks your guild don't own");
                    return true;
                }
                LandClaim.removeChunkByKey(chunkID);
                return true;
            }
        }
        return false;
    }
}
