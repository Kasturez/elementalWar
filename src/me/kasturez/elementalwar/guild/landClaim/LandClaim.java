package me.kasturez.elementalwar.guild.landClaim;

import java.util.HashMap;


public class LandClaim {
    private final HashMap<String, String> chunks;

    public LandClaim(HashMap<String, String> chunks){
        this.chunks = chunks;
    }

    public void addChunk(String chunk, String guildName){
        chunks.put(chunk, guildName);
    }

    public boolean isClaimed(String chunk){
        return chunks.containsKey(chunk);
    }

    public String getGuild(String chunk){
        return chunks.get(chunk);
    }
}
