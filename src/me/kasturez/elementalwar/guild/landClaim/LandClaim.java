package me.kasturez.elementalwar.guild.landClaim;

import org.bukkit.entity.Player;

import java.util.HashMap;


public class LandClaim {
    private static final HashMap<String, String> chunks = new HashMap<>();

    public static void addChunk(String chunk, String guildName) {
        if (guildName.isEmpty()) return;
        chunks.put(chunk, guildName);
    }

    public static boolean isClaimed(String chunk) {
        return chunks.containsKey(chunk);
    }

    public static String getGuild(String chunk) {
        return chunks.get(chunk);
    }

    public static void removeChunkByValue(String guildName) {
        chunks.values().remove(guildName);
    }

    public static void removeChunkByKey(String chunk) {
        chunks.remove(chunk);
    }

    public static void showAllClaimedChunk(Player player) {
        player.sendMessage(chunks.toString());
    }
}
