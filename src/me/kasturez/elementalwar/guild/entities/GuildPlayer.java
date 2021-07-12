package me.kasturez.elementalwar.guild.entities;


public class GuildPlayer {

    private GuildRanks guildRanks = GuildRanks.RECRUIT;

    private String elementalGuildName = "wild";

    public GuildPlayer() {
    }

    public GuildPlayer(GuildRanks guildRanks, String elementalGuildName) {
        this.guildRanks = guildRanks;
        this.elementalGuildName = elementalGuildName;
    }

    @Override
    public String toString() {
        return "elementalGuildName='" + elementalGuildName + '\'' + '}';
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
