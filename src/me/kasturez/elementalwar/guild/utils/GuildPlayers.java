package me.kasturez.elementalwar.guild.utils;

import org.bukkit.entity.Player;

public class GuildPlayers {

    private Player player;

    private GuildRanks guildRanks;

    private String elementalGuildName;

    public GuildPlayers(Player p, GuildRanks guildRanks, String elementalGuildName){
        this.player = p;
        this.guildRanks = guildRanks;
        this.elementalGuildName = elementalGuildName;
    }

    public GuildPlayers(Player player) {
        this.player = player;
    }

    public Player getPlayer(){
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public GuildRanks getGuildRanks(){
        return guildRanks;
    }

    public void setGuildRanks(GuildRanks guildRanks){
        this.guildRanks = guildRanks;
    }

    public String getElementalGuildName() {
        return elementalGuildName;
    }

    public void setElementalGuildName(String elementalGuildName) {
        this.elementalGuildName = elementalGuildName;
    }

    @Override
    public String toString() {
        return "GuildPlayers{" +
                "player=" + player +
//                ", guildRanks=" + guildRanks +
                ", elementalGuildName='" + elementalGuildName + '\'' +
                '}';
    }
}
