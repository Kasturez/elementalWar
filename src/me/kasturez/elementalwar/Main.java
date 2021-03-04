package me.kasturez.elementalwar;

import com.google.gson.internal.LinkedTreeMap;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.ItemMergeEvent;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class Main extends JavaPlugin {


    @Override
    public void onEnable() {
    openkits();
    getLogger().info("kits built");
    }

    @Override
    public void onDisable() {

    }

    private static Inventory kits;
    private void openkits() {
        Inventory inv = Bukkit.createInventory(null, 18, ChatColor.BOLD + "Kits" + ChatColor.GOLD);
        ItemStack item = new ItemStack(Material.BREAD);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.BLACK + "Food");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "Begin the journey!");
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(0, item);

        item.setType(Material.WOODEN_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GRAY + "Traveler");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "Begin the journey");
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(1, item);

        item.setType(Material.STONE_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.BLACK + "Low tier soldier");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "Shabby but this will do");
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(2, item);

        meta.setDisplayName(ChatColor.BLACK + "Mid tier soldier");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "Better but not there yet");
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(3, item);

        meta.setDisplayName(ChatColor.BLACK + "Top tier soldier");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "One of the best set for a soldier");
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(4, item);

        item.setType(Material.IRON_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.BLACK + "Low tier warrior");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "Average set for a warrior path");
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(5, item);

        meta.setDisplayName(ChatColor.BLACK + "Mid tier warrior");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "A solid set for a brave warrior");
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(6, item);

        meta.setDisplayName(ChatColor.BLACK + "Top tier warrior");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "a step into the godly set realm");
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(7, item);

        item.setType(Material.DIAMOND_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.BLACK + "Low tier warlord");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "there is a faint trace of divinity upon this set");
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(8, item);

        meta.setDisplayName(ChatColor.BLACK + "Mid tier warlord");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "a flawless set from the finest craftsmanship upon the star");
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(9, item);

        meta.setDisplayName(ChatColor.BLACK + "Top tier warlord");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "A mystical set with radiant amount of divinity");
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(10, item);

        kits = inv;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("kits")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("im out!");
                return true;
            }
            Player player = (Player) sender;
            player.openInventory(kits);
        }
        return false;
    }
}
