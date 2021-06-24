package me.kasturez.elementalwar.eventHandlers;

import me.kasturez.elementalwar.guild.entities.PlayerManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class RegisterGuildPlayerEvent implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        PlayerManager.registerPlayer(player);
        player.sendMessage("Welcome to Elemental Guild");
    }
}
