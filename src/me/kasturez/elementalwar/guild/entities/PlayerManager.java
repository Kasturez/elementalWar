package me.kasturez.elementalwar.guild.entities;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class PlayerManager {
    private static final HashMap<UUID, GuildPlayer> playersHashMap = new HashMap<>();

    public static void registerPlayer(Player player) {
        if (playersHashMap.containsKey(player.getUniqueId())) return;
        playersHashMap.put(player.getUniqueId(), new GuildPlayer());
    }

    public static void restoreHashMap(UUID uuid, GuildPlayer guildPlayer){
        playersHashMap.put(uuid, guildPlayer);
    }

    public static GuildPlayer getGPlayer(UUID uuid){
        return playersHashMap.get(uuid);
    }

    public static HashMap<UUID, GuildPlayer> getPlayersHashMap() {
        return playersHashMap;
    }
}
