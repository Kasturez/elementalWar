package me.kasturez.elementalwar;


import me.kasturez.elementalwar.events.InventoryEvent;
import me.kasturez.elementalwar.events.LandClaimEvent;
import me.kasturez.elementalwar.events.RegisterGuildPlayerEvent;
import me.kasturez.elementalwar.guild.commands.GuildCMD;
import me.kasturez.elementalwar.kits.ElementalKit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getCommand("kits").setExecutor(new ElementalKit());
        getCommand("guild").setExecutor(new GuildCMD());
        getServer().getPluginManager().registerEvents(new InventoryEvent(), this);
        getServer().getPluginManager().registerEvents(new LandClaimEvent(), this);
        getServer().getPluginManager().registerEvents(new RegisterGuildPlayerEvent(), this);
    }

    @Override
    public void onDisable() {

    }
}
