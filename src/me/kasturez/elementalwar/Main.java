package me.kasturez.elementalwar;


import me.kasturez.elementalwar.guild.commands.GuildCMD;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{

    @Override
    public void onEnable() {
        this.getCommand("guild").setExecutor(new GuildCMD(this));

    }

    @Override
    public void onDisable() {

    }
}








