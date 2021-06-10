package me.kasturez.elementalwar.guild.landClaim;

import me.kasturez.elementalwar.guild.utils.ElementalGuild;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;


public class LandClaim extends JavaPlugin {
    private HashMap<String, ElementalGuild> chunks;

    @Override
    public void onEnable() {
        
    }

    public void addChunk(String chunk, ElementalGuild guild){
        chunks.put(chunk,guild);
    }
    public boolean isClaimed(String chunk){
        return chunks.containsKey(chunk);
    }
    public ElementalGuild getGuild(String chunk){
        return chunks.get(chunk);
    }
}
