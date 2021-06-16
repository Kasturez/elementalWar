package me.kasturez.elementalwar.guild.utils;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class PlayerManager {
    private final HashMap<UUID, GuildPlayer> playersHashMap;

    public PlayerManager(HashMap<UUID, GuildPlayer> playersHashMap) {
        this.playersHashMap = playersHashMap;
    }

    public void registerPlayer(Player player) {
        if (playersHashMap.containsKey(player.getUniqueId())) return;
        playersHashMap.put(player.getUniqueId(), new GuildPlayer(player));
    }

    public GuildPlayer getGPlayer(UUID uuid){
        return playersHashMap.get(uuid);
    }
}
