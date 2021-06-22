package me.kasturez.elementalwar.GUI;

import me.kasturez.elementalwar.guild.utils.ElementalGuild;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class GuildGUI{
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
        inventory.setItem(20, itemStack);
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
        inventory.setItem(21, itemStack);
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
        inventory.setItem(22, itemStack);
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
        inventory.setItem(23, itemStack);
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
        inventory.setItem(24, itemStack);
        lore.clear();

        //display online players
        itemStack.setType(Material.SKELETON_SKULL);
        itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("Online Players");
        lore.add("");
        lore.add("Current players: ");
        itemStack.setItemMeta(itemMeta);
        inventory.setItem(44, itemStack);
        lore.clear();

        //display guild levels
        itemStack.setType(Material.PAPER);
        itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("Guild levels");
        lore.add("");
        lore.add("Current guild levels: ");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        inventory.setItem(36, itemStack);
        lore.clear();

        //display guild balance
        itemStack.setType(Material.BLUE_TERRACOTTA);
        itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("Guild balance: ");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        inventory.setItem(27, itemStack);
        lore.clear();

        //display guild ranks
        itemStack.setType(Material.IRON_SWORD);
        itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("Guild ranks: ");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        inventory.setItem(37, itemStack);
        lore.clear();

        //display chunk power
        itemStack.setType(Material.WOODEN_SHOVEL);
        itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("Chunk powers: ");
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        inventory.setItem(43, itemStack);
        lore.clear();

        return inventory;
    }
}
