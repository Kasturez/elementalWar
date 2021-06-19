package me.kasturez.elementalwar;


import me.kasturez.elementalwar.guild.commands.DamageEvent;
import me.kasturez.elementalwar.guild.commands.FlyCMD;
import me.kasturez.elementalwar.guild.commands.GuildCMD;
import me.kasturez.elementalwar.events.InventoryEvent;
import me.kasturez.elementalwar.events.LandClaimEvent;
import me.kasturez.elementalwar.events.RegisterGuildPlayerEvent;
import me.kasturez.elementalwar.guild.landClaim.LandClaim;
import me.kasturez.elementalwar.kits.ElementalKit;
import me.kasturez.elementalwar.scoreboard.hubscoreboard;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;


public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        LandClaim landClaim = new LandClaim(new HashMap<>());
        getCommand("kits").setExecutor(new ElementalKit());
        getCommand("guild").setExecutor(new GuildCMD(landClaim));
        getCommand("fly").setExecutor(new FlyCMD());
        getServer().getPluginManager().registerEvents(new InventoryEvent(this), this);
        getServer().getPluginManager().registerEvents(new LandClaimEvent(landClaim,this), this);
        getServer().getPluginManager().registerEvents(new RegisterGuildPlayerEvent(), this);
        getServer().getPluginManager().registerEvents(new DamageEvent(), this);
        getServer().getPluginManager().registerEvents(new hubscoreboard(),this);
    }

    @Override
    public void onDisable() {

    }
}
