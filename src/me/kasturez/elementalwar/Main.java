package me.kasturez.elementalwar;


import me.kasturez.elementalwar.events.InventoryEvent;
import me.kasturez.elementalwar.guild.commands.GuildCMD;
import me.kasturez.elementalwar.kits.ElementalKit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.getCommand("kits").setExecutor(new ElementalKit(this));
        this.getCommand("guild").setExecutor(new GuildCMD(this));
        this.getServer().getPluginManager().registerEvents(new InventoryEvent(this), this);
    }

    @Override
    public void onDisable() {

    }
}
