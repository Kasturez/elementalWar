package me.kasturez.elementalwar;


import me.kasturez.elementalwar.kits.ElementalKit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        ElementalKit.initAllKits();
        this.getCommand("kits").setExecutor(new ElementalKit(this));
    }

    @Override
    public void onDisable() {

    }
}
