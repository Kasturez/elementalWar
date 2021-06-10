package me.kasturez.elementalwar.guild.utils;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class GuildManager{

    private List<ElementalGuild> guilds = new ArrayList<ElementalGuild>();

    public void createGuild(String name, Player p){
        ElementalGuild g = new ElementalGuild(name, "Nothing");
        g.addPlayer(p, GuildRanks.ADMIN);
        guilds.add(g);
    }
}
