package me.kasturez.elementalwar.guild.utils;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ElementalGuild {

    private String name, desc;
    private Map<UUID, GuildPlayers> players = new HashMap<UUID, GuildPlayers>();

    public ElementalGuild(String name, String description){
        this.name = name;
        this.desc = description;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public Map<UUID, GuildPlayers> getPlayers(){
        return players;
    }

    public boolean isPlayerInGuild(Player p){
        return players.containsKey(p.getUniqueId());
    }

    public GuildPlayers getGuildPlayers(Player p){
        return players.get(p.getUniqueId());
    }

    public void addPlayer(Player p, GuildRanks gr){
        GuildPlayers gp = new GuildPlayers(p, gr);
        players.put(p.getUniqueId(), gp);
    }
}
