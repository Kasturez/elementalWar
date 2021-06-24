package me.kasturez.elementalwar.eventHandlers;

import me.kasturez.elementalwar.guild.landClaim.LandClaim;
import me.kasturez.elementalwar.guild.entities.PlayerManager;
import org.bukkit.Chunk;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.UUID;

public class LandClaimEvent implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        if (event.getClickedBlock() != null){
            Chunk chunk = event.getClickedBlock().getChunk();
            String chunkID = chunk.getX() + "," + chunk.getZ();

            if (LandClaim.isClaimed(chunkID)){
                UUID uuid = event.getPlayer().getUniqueId();
                if (!PlayerManager.getGPlayer(uuid).getElementalGuildName().equalsIgnoreCase(LandClaim.getGuild(chunkID))){
                    event.setCancelled(true);
                    event.getPlayer().sendMessage("this chunk is claimed by: " + LandClaim.getGuild(chunkID));
                }
            }
        }
    }
}
