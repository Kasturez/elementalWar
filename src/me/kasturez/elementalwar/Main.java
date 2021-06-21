package me.kasturez.elementalwar;


import me.kasturez.elementalwar.economy.BalanceCMD;
import me.kasturez.elementalwar.eventHandlers.GuildGUIEvent;
import me.kasturez.elementalwar.eventHandlers.KitEvent;
import me.kasturez.elementalwar.eventHandlers.LandClaimEvent;
import me.kasturez.elementalwar.eventHandlers.RegisterGuildPlayerEvent;
import me.kasturez.elementalwar.guild.commands.GuildCMD;
import me.kasturez.elementalwar.kits.ElementalKit;
import me.kasturez.elementalwar.events.DamageEvent;
import me.kasturez.elementalwar.guild.commands.FlyCMD;
import me.kasturez.elementalwar.scoreboard.HubScoreBoard;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        //Commands
        getCommand("kits").setExecutor(new ElementalKit());
        getCommand("guild").setExecutor(new GuildCMD());
        getCommand("fly").setExecutor(new FlyCMD());
        getCommand("balance").setExecutor(new BalanceCMD());

        //EventHandlers
        getServer().getPluginManager().registerEvents(new GuildGUIEvent(), this);
        getServer().getPluginManager().registerEvents(new KitEvent(), this);
        getServer().getPluginManager().registerEvents(new LandClaimEvent(), this);
        getServer().getPluginManager().registerEvents(new DamageEvent(), this);
        getServer().getPluginManager().registerEvents(new HubScoreBoard(),this);
        getServer().getPluginManager().registerEvents(new RegisterGuildPlayerEvent(), this);

    }

    @Override
    public void onDisable() {

    }
}
