package me.kasturez.elementalwar;


import me.kasturez.elementalwar.guild.commands.DamageEvent;
import me.kasturez.elementalwar.guild.commands.FlyCMD;
import me.kasturez.elementalwar.guild.commands.GuildCMD;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        getCommand("guild").setExecutor(new GuildCMD(this));
        getCommand("fly").setExecutor(new FlyCMD());
        getServer().getPluginManager().registerEvents(new DamageEvent(), this);
    }

    @Override
    public void onDisable() {

    }
}








