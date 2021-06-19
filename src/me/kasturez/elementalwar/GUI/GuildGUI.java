package me.kasturez.elementalwar.GUI;

import me.kasturez.elementalwar.guild.utils.ElementalGuild;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GuildGUI {
    public static Inventory openGuildGUI(ElementalGuild elementalGuild){
        Inventory inventory = Bukkit.createInventory(null, 45, ChatColor.BLACK + "GuildMenu");
        //display wood elemental
        ItemStack itemStack = new ItemStack(Material.GREEN_TERRACOTTA);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(ChatColor.DARK_GREEN + "WOOD ELEMENTAL");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.DARK_GREEN + "Guild's wood elemental in stored:");
        lore.add(ChatColor.DARK_GREEN + Integer.toString(elementalGuild.getWood()));
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        inventory.setItem(11, itemStack);
        lore.clear();

        //display earth elemental
        itemStack.setType(Material.BROWN_TERRACOTTA);
        itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(ChatColor.YELLOW + "EARTH ELEMENTAL");
        lore.add("");
        lore.add(ChatColor.YELLOW + "Guild's earth elemental in stored");
        lore.add(ChatColor.YELLOW + Integer.toString(elementalGuild.getEarth()));
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        inventory.setItem(12, itemStack);
        lore.clear();

        //display air elemental
        itemStack.setType(Material.WHITE_TERRACOTTA);
        itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(ChatColor.GRAY + "AIR ELEMENTAL");
        lore.add("");
        lore.add(ChatColor.GRAY + "Guild's air elemental in stored:");
        lore.add(ChatColor.GRAY + Integer.toString(elementalGuild.getAir()));
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        inventory.setItem(13, itemStack);
        lore.clear();

        //display fire elemental
        itemStack.setType(Material.RED_TERRACOTTA);
        itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(ChatColor.DARK_RED + "FIRE ELEMENTAL");
        lore.add("");
        lore.add(ChatColor.DARK_RED + "Guild's fire elemental in stored:");
        lore.add(ChatColor.DARK_RED + Integer.toString(elementalGuild.getFire()));
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        inventory.setItem(14, itemStack);
        lore.clear();

        //display ice elemental
        itemStack.setType(Material.BLUE_TERRACOTTA);
        itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(ChatColor.DARK_AQUA + "ICE ELEMENTAL");
        lore.add("");
        lore.add(ChatColor.DARK_AQUA + "Guild's ice elemental in stored:");
        lore.add(ChatColor.DARK_AQUA + Integer.toString(elementalGuild.getIce()));
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        inventory.setItem(15, itemStack);
        lore.clear();

        return inventory;
    }
}
