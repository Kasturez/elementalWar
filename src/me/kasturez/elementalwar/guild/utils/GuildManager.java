package me.kasturez.elementalwar.guild.utils;

import org.bukkit.entity.Player;

import java.util.ArrayList;

public class GuildManager{

    private Player p;
    private static ArrayList<ElementalGuild> guilds = new ArrayList<ElementalGuild>();

    //Make functions working
    public static void createGuild(String name, GuildPlayers gp){
        ElementalGuild g = new ElementalGuild(name, "Nothing");
        g.addPlayer(gp, GuildRanks.ADMIN);
        guilds.add(g);
    }
}
