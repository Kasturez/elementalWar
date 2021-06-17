package me.kasturez.elementalwar.guild.landClaim;

import org.bukkit.entity.Player;

import java.util.HashMap;


public class LandClaim {
    private final HashMap<String, String> chunks;

    public LandClaim(HashMap<String, String> chunks) {
        this.chunks = chunks;
    }

    public void addChunk(String chunk, String guildName) {
        if (guildName.isEmpty()) return;
        chunks.put(chunk, guildName);
    }

    public boolean isClaimed(String chunk) {
        return chunks.containsKey(chunk);
    }

    public String getGuild(String chunk) {
        return chunks.get(chunk);
    }

    public void removeChunkByValue(String guildName) {
        chunks.values().remove(guildName);
    }

    public void removeChunkByKey(String chunk) {
        chunks.remove(chunk);
    }

    public void showAllClaimedChunk(Player player) {
        player.sendMessage(chunks.toString());
    }
}
