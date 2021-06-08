package me.kasturez.elementalwar.guild.utils;

import org.bukkit.entity.Player;

public class GuildPlayers {

    private Player player;

    private GuildRanks guildRanks;

    public GuildPlayers(Player p, GuildRanks gr){
        this.player = p;
        this.guildRanks = gr;
    }

    public Player getPlayer(){
        return player;
    }

    public GuildRanks getGuildRanks(){
        return guildRanks;
    }

    public void setGuildRanks(GuildRanks gr){
        this.guildRanks = gr;
    }
}
