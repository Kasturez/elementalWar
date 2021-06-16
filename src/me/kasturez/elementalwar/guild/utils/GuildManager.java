package me.kasturez.elementalwar.guild.utils;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class GuildManager{

    private static List<ElementalGuild> guilds = new ArrayList<ElementalGuild>();

    public static void createGuild(String name, Player p){
        ElementalGuild g = new ElementalGuild(name, "Nothing");
        g.addPlayer(p, GuildRanks.ADMIN, name);
        guilds.add(g);
    }
}
