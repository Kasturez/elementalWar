package me.kasturez.elementalwar.guild.commands;

import me.kasturez.elementalwar.GUI.GuildGUI;
import me.kasturez.elementalwar.events.UpdateGuildEvent;
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
            UpdateGuildEvent updateGuildEvent = new UpdateGuildEvent(player);

            //guild info
            if (args.length == 0) {
                sender.sendMessage("--Guild Information--");
                player.sendMessage("/g info");
                player.sendMessage("/g invite");
                player.sendMessage("/g description");
                player.sendMessage("/g land");
                player.sendMessage("/g promote");
                player.sendMessage("/g demote");
                player.sendMessage("/g leadership");
                player.sendMessage("/g chat");
                player.sendMessage("/g location");
                player.sendMessage("/g leave");
                player.sendMessage("/g disband");
                return true;
            }

            //guild info
            if(args[0].equalsIgnoreCase("info")){
                player.sendMessage(GuildManager.getGuilds().toString());
                Bukkit.getPluginManager().callEvent(updateGuildEvent);
                return true;
            }

            if(args[0].equalsIgnoreCase("land")){
                LandClaim.showAllClaimedChunk(player);
                return true;
            }

            //guild create [blank]
            if (!args[0].equalsIgnoreCase("create")) {
                if (guildPlayer.getElementalGuildName().equalsIgnoreCase("wild")) {
                    player.sendMessage("please do /guild create first!");
                    return true;
                }
            }

            if (args[0].equalsIgnoreCase("info")) {
                player.openInventory(GuildGUI.openGuildGUI(GuildManager.findElementalGuildByName(guildPlayer.getElementalGuildName())));
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
                if (guildPlayerBeingPromote.getGuildRanks() == GuildRanks.RECRUIT) {
                    guildPlayerBeingPromote.setGuildRanks(GuildRanks.MEMBER);
                    player.sendMessage("promote successfully");
                    Bukkit.getPluginManager().callEvent(updateGuildEvent);
                    return true;
                }
                player.sendMessage("can't promote player");
                return true;
            }

            //guild demote [player]
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
                if (guildPlayerBeingPromote.getGuildRanks() == GuildRanks.MEMBER) {
                    guildPlayerBeingPromote.setGuildRanks(GuildRanks.RECRUIT);
                    player.sendMessage("demote successfully");
                    Bukkit.getPluginManager().callEvent(updateGuildEvent);
                    return true;
                }
                player.sendMessage("can't demote player");
                return true;
            }

            //guild create [name]
            if (args[0].equalsIgnoreCase("create")) {
                if (!guildPlayer.getElementalGuildName().equalsIgnoreCase("wild")) {
                    if (guildPlayer.getGuildRanks() == GuildRanks.ADMIN) {
                        player.sendMessage("You must disband your current guild first");
                        return true;
                    }
                    player.sendMessage("You must leave your current guild first");
                    return true;
                }
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
                Bukkit.getPluginManager().callEvent(updateGuildEvent);
                return true;
            }

            //guild invite [player]
            if (args[0].equalsIgnoreCase("invite")) {
                Player invitedPlayer = Bukkit.getPlayer(args[1]);
                GuildPlayer invitedGPlayer = PlayerManager.getGPlayer(invitedPlayer.getUniqueId());
                sender.sendMessage("You've invited " + invitedPlayer + "to ur guild");
                invitedPlayer.sendMessage("U'r being invited to ");
                Bukkit.getPluginManager().callEvent(updateGuildEvent);
                return true;
            }


            //guild claim
            if (args[0].equalsIgnoreCase("claim")) {
                Chunk chunk = player.getLocation().getChunk();
                String chunkID = chunk.getX() + "," + chunk.getZ();
                if (LandClaim.isClaimed(chunkID)) {
                    player.sendMessage("this chunk is already claimed!");
                    return true;
                }
                LandClaim.addChunk(chunkID, guildPlayer.getElementalGuildName());
                Bukkit.getPluginManager().callEvent(updateGuildEvent);
                return true;
            }

            //guild unclaim
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
                player.sendMessage("You've unclaimed this chunk");
                Bukkit.getPluginManager().callEvent(updateGuildEvent);
                LandClaim.removeChunkByKey(chunkID);
                return true;
            }

            //guild leave
            if (args[0].equalsIgnoreCase("leave")) {
                if(guildPlayer.getGuildRanks() == GuildRanks.ADMIN){
                    player.sendMessage("You cant leave your guild as the admin");
                    return true;
                }
                GuildManager.findElementalGuildByName(guildPlayer.getElementalGuildName()).removePlayer(guildPlayer);
                player.sendMessage("You've just left this guild");
                Bukkit.getPluginManager().callEvent(updateGuildEvent);
            }

            //guild kick [player]
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
                Bukkit.getPluginManager().callEvent(updateGuildEvent);
            }

            //guild disband
            if (args[0].equalsIgnoreCase("disband")) {
                if (guildPlayer.getGuildRanks() != GuildRanks.ADMIN) {
                    player.sendMessage("you cant disband as you are not the guild admin");
                    return true;
                }
                player.sendMessage("You've disbanded your guild: " + guildPlayer.getElementalGuildName());
                String elementalGuildName = guildPlayer.getElementalGuildName();
                GuildManager.disbandGuild(elementalGuildName);
                LandClaim.removeChunkByValue(elementalGuildName);
                guildPlayer.setElementalGuildName("wild");
                Bukkit.getPluginManager().callEvent(updateGuildEvent);
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
                Bukkit.getPluginManager().callEvent(updateGuildEvent);
                return true;
            }
        }
        return false;
    }
}
