package me.kasturez.elementalwar.eventHandlers;

import me.kasturez.elementalwar.Main;
import me.kasturez.elementalwar.events.RaiderUnclaimEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class RaiderUnclaimEventHandler implements Listener {

    private final Main main;

    public RaiderUnclaimEventHandler(Main main) {
        this.main = main;
    }

    @EventHandler
    public void onEnemyTerritory(RaiderUnclaimEvent event){
        unClaimChunkOnTimer(event);
    }

    private void unClaimChunkOnTimer(RaiderUnclaimEvent event){
        Bukkit.broadcastMessage("hello");
        event.getRaiderEntity();
        // this still run when the raider dies
        Bukkit.getScheduler().runTaskLater(main, () -> unClaimChunkOnTimer(event), 100);
    }
}
