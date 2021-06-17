package me.kasturez.elementalwar.events;

import me.kasturez.elementalwar.guild.utils.PlayerManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class RegisterGuildPlayerEvent implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        PlayerManager.registerPlayer(player);
        player.sendMessage(PlayerManager.getGPlayer(player.getUniqueId()).toString());
    }
}
