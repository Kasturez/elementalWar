package me.kasturez.elementalwar;


import me.kasturez.elementalwar.eventHandlers.GuildGUIEvent;
import me.kasturez.elementalwar.eventHandlers.KitEvent;
import me.kasturez.elementalwar.eventHandlers.LandClaimEvent;
import me.kasturez.elementalwar.eventHandlers.RegisterGuildPlayerEvent;
import me.kasturez.elementalwar.guild.commands.GuildCMD;
import me.kasturez.elementalwar.kits.ElementalKit;
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


public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("kits").setExecutor(new ElementalKit());
        getCommand("guild").setExecutor(new GuildCMD());
        getCommand("fly").setExecutor(new FlyCMD());
        getServer().getPluginManager().registerEvents(new GuildGUIEvent(), this);
        getServer().getPluginManager().registerEvents(new KitEvent(), this);
        getServer().getPluginManager().registerEvents(new LandClaimEvent(), this);
        getServer().getPluginManager().registerEvents(new DamageEvent(), this);
        getServer().getPluginManager().registerEvents(new hubscoreboard(),this);
        getServer().getPluginManager().registerEvents(new RegisterGuildPlayerEvent(), this);
    }

    @Override
    public void onDisable() {

    }
}
