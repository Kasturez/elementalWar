package me.kasturez.elementalwar.GUI;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.inventory.Inventory;

public class GuildGUI {
    public static Inventory openGuildGUI(){
        Inventory inventory = Bukkit.createInventory(null, 63, ChatColor.BLACK + "Guild Menu");
        
        return inventory;
    }
}
