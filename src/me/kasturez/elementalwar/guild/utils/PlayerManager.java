package me.kasturez.elementalwar.guild.utils;

import java.util.HashMap;
import java.util.UUID;

public class PlayerManager {
    private static HashMap<UUID, GuildPlayers> playersHashMap;

    public static GuildPlayers getGPlayer(UUID uuid){
        return playersHashMap.get(uuid);
    }
}
