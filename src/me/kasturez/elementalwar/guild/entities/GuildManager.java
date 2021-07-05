package me.kasturez.elementalwar.guild.entities;

import java.util.ArrayList;

public class GuildManager{

    private static final ArrayList<ElementalGuild> guilds = new ArrayList();

    public static void createGuild(String guildName, GuildPlayer guildPlayer){
        ElementalGuild guild = new ElementalGuild(guildName, "Nothing");
        guild.addPlayer(guildPlayer, GuildRanks.ADMIN);
        guilds.add(guild);
    }

    public static void disbandGuild(String guildName) {
        guilds.remove(findElementalGuildByName(guildName));
    }

    public static ElementalGuild findElementalGuildByName(String guildName){
        for (ElementalGuild elementalGuild : guilds) {
            if (elementalGuild.getName().equalsIgnoreCase(guildName)){
                return elementalGuild;
            }
        }
        return null;
    }

    public static ArrayList<ElementalGuild> getGuilds() {
        return guilds;
    }
}
