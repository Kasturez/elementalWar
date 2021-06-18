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
        //3 - 7
        Inventory inventory = Bukkit.createInventory(null, 63, ChatColor.BLACK + "Guild Menu");
        //display wood elemental
        ItemStack itemStack = new ItemStack(Material.GREEN_TERRACOTTA);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("WOOD ELEMENTAL");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.DARK_GREEN + Integer.toString(elementalGuild.getWood()));
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        inventory.setItem(3, itemStack);
        lore.clear();

        //display earth elemental
        itemStack.setType(Material.BROWN_TERRACOTTA);
        itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("EARTH ELEMENTAL");
        lore.add("");
        lore.add(ChatColor.BLACK + Integer.toString(elementalGuild.getEarth()));
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        inventory.setItem(4, itemStack);
        lore.clear();

        //display air elemental
        itemStack.setType(Material.WHITE_TERRACOTTA);
        itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("WHITE ELEMENTAL");
        lore.add("");
        lore.add(ChatColor.WHITE + Integer.toString(elementalGuild.getAir()));
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        inventory.setItem(5, itemStack);
        lore.clear();

        //display fire elemental
        itemStack.setType(Material.RED_TERRACOTTA);
        itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("FIRE ELEMENTAL");
        lore.add("");
        lore.add(ChatColor.RED + Integer.toString(elementalGuild.getFire()));
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        inventory.setItem(6, itemStack);
        lore.clear();

        //display ice elemental
        itemStack.setType(Material.BLUE_TERRACOTTA);
        itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("ICE ELEMENTAL");
        lore.add("");
        lore.add(ChatColor.BLUE + Integer.toString(elementalGuild.getIce()));
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        inventory.setItem(7, itemStack);
        lore.clear();

        return inventory;
    }
}
