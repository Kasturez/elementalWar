package me.kasturez.elementalwar.events;

import me.kasturez.elementalwar.Main;
import me.kasturez.elementalwar.guild.utils.PlayerManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class RegisterGuildPlayerEvent implements Listener {

    private final Main main;

    private final PlayerManager playerManager;

    public RegisterGuildPlayerEvent(Main main, PlayerManager playerManager) {
        this.main = main;
        this.playerManager = playerManager;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        playerManager.registerPlayer(player);
        player.sendMessage(playerManager.getGPlayer(player.getUniqueId()).toString());
    }
}
