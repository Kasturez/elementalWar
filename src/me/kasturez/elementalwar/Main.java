package me.kasturez.elementalwar;


import me.kasturez.elementalwar.eventHandlers.GuildGUIEvent;
import me.kasturez.elementalwar.eventHandlers.KitEvent;
import me.kasturez.elementalwar.eventHandlers.LandClaimEvent;
import me.kasturez.elementalwar.eventHandlers.RegisterGuildPlayerEvent;
import me.kasturez.elementalwar.guild.commands.GuildCMD;
import me.kasturez.elementalwar.kits.ElementalKit;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("kits").setExecutor(new ElementalKit());
        getCommand("guild").setExecutor(new GuildCMD());
        getServer().getPluginManager().registerEvents(new GuildGUIEvent(), this);
        getServer().getPluginManager().registerEvents(new KitEvent(), this);
        getServer().getPluginManager().registerEvents(new LandClaimEvent(), this);
        getServer().getPluginManager().registerEvents(new RegisterGuildPlayerEvent(), this);
    }

    @Override
    public void onDisable() {

    }
}
