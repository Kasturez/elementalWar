package me.kasturez.elementalwar.guild.entities;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class PlayerManager {
    private static final HashMap<UUID, GuildPlayer> playersHashMap = new HashMap<>();

    public static void registerPlayer(Player player) {
        if (playersHashMap.containsKey(player.getUniqueId())) return;
        playersHashMap.put(player.getUniqueId(), new GuildPlayer(player));
    }

    public static GuildPlayer getGPlayer(UUID uuid){
        return playersHashMap.get(uuid);
    }
}
