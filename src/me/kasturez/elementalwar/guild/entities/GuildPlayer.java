package me.kasturez.elementalwar.guild.entities;

import org.bukkit.entity.Player;

public class GuildPlayer {

    private Player player;

    private GuildRanks guildRanks;

    private String elementalGuildName = "wild";

    public GuildPlayer(Player player) {
        this.player = player;
    }

    @Override
    public String toString() {
        return "elementalGuildName='" + elementalGuildName + '\'' + '}';
    }

    //get set Player
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    //get set GuildRanks
    public GuildRanks getGuildRanks() {
        return guildRanks;
    }

    public void setGuildRanks(GuildRanks guildRanks) {
        this.guildRanks = guildRanks;
    }

    //get set ElementalGuildName
    public String getElementalGuildName() {
        return elementalGuildName;
    }

    public void setElementalGuildName(String elementalGuildName) {
        this.elementalGuildName = elementalGuildName;
    }
}
