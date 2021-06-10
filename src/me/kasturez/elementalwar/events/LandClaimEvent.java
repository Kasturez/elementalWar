package me.kasturez.elementalwar.events;

import me.kasturez.elementalwar.guild.landClaim.LandClaim;
import org.bukkit.Chunk;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class LandClaimEvent implements Listener {
    private final LandClaim plugin;

    public LandClaimEvent(LandClaim plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        if (event.getClickedBlock() != null){
            Chunk chunk = event.getClickedBlock().getChunk();
            String chunkID = chunk.getX() + "." + chunk.getZ();

            if (plugin.isClaimed(chunkID)){
                Player player = event.getPlayer();
                if (!plugin.getGuild(chunkID).isPlayerInGuild(player)){
                    if (!player.isOp()){
                        event.setCancelled(true);
                        player.sendMessage("You are not allowed to build here");
                    }
                }
            }
        }
    }
}
