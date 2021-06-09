package me.kasturez.elementalwar;


import me.kasturez.elementalwar.guild.commands.GuildCMD;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements CommandExecutor {

    //private Main plugin;

    @Override
    public void onEnable() {


        getCommand("guild").setExecutor(new GuildCMD(this));

    }

    @Override
    public void onDisable() {

    }

    /*public Main(Main plugin) {
        this.plugin = plugin;
    }

    public void GuildCMD(Main plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (label.equalsIgnoreCase("guild")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("im out!");
                return true;
            }
        }
        return false;
    }*/
}








