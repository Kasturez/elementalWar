package me.kasturez.elementalwar.guild.utils;

import org.bukkit.entity.Player;

import java.util.ArrayList;

public class ElementalGuild {

    private String name, desc;
    private ArrayList<GuildPlayers> guildPlayers = new ArrayList<GuildPlayers>();

    public ElementalGuild(String name, String description) {
        this.name = name;
        this.desc = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ArrayList<GuildPlayers> getPlayers() {
        return guildPlayers;
    }

    public void addPlayer(GuildPlayers gp, GuildRanks gr) {
        guildPlayers.add(gp);

    }
}
