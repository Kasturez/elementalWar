package me.kasturez.elementalwar.eventHandlers;

import me.kasturez.elementalwar.guild.entities.ElementalGuild;
import me.kasturez.elementalwar.guild.entities.GuildManager;
import me.kasturez.elementalwar.guild.entities.GuildPlayer;
import me.kasturez.elementalwar.guild.entities.PlayerManager;
import me.kasturez.elementalwar.guild.landClaim.LandClaim;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlacingNexusEvent implements Listener {
    @EventHandler
    public void onPlaceBeacon(BlockPlaceEvent event){
        if (!event.getBlockPlaced().getType().equals(Material.BEACON)){
            return;
        }
        GuildPlayer guildPlayer = PlayerManager.getGPlayer(event.getPlayer().getUniqueId());
        Chunk chunk = event.getBlockAgainst().getLocation().getChunk();
        String chunkID = chunk.getX() + "," + chunk.getZ();
        if (!guildPlayer.getElementalGuildName().equalsIgnoreCase(LandClaim.getGuild(chunkID))) return;
        Location blockPlacedLocation = event.getBlockPlaced().getLocation();
        String nexusCoordinate = blockPlacedLocation.getBlockX() + "," +
                blockPlacedLocation.getBlockY() + "," +
                blockPlacedLocation.getBlockZ();
        ElementalGuild elementalGuild = GuildManager.findElementalGuildByName(guildPlayer.getElementalGuildName());
        if (elementalGuild.isNexusPlaced()) return;
        elementalGuild.setNexusCoordinate(nexusCoordinate);
        elementalGuild.setNexusPlaced(true);
        event.getPlayer().sendMessage("nexus coordinate set!");
    }
}
