package me.kasturez.elementalwar.events;

import me.kasturez.elementalwar.Main;
import me.kasturez.elementalwar.guild.landClaim.LandClaim;
import me.kasturez.elementalwar.guild.utils.PlayerManager;
import org.bukkit.Chunk;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.UUID;

public class LandClaimEvent implements Listener {
    private final LandClaim landClaim;
    private final Main main;

    public LandClaimEvent(LandClaim landClaim, Main main) {
        this.landClaim = landClaim;
        this.main = main;
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        if (event.getClickedBlock() != null){
            Chunk chunk = event.getClickedBlock().getChunk();
            String chunkID = chunk.getX() + "," + chunk.getZ();

            if (landClaim.isClaimed(chunkID)){
                UUID uuid = event.getPlayer().getUniqueId();
                if (!PlayerManager.getGPlayer(uuid).getElementalGuildName().equalsIgnoreCase(landClaim.getGuild(chunkID))){
                    event.setCancelled(true);
                    event.getPlayer().sendMessage("this chunk is claimed by: " + landClaim.getGuild(chunkID));
                }
            }
        }
    }
}
