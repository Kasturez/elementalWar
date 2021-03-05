package me.kasturez.elementalwar;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;


import java.util.ArrayList;
import java.util.List;

public class Main extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        openkits();
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {

    }

    private static Inventory kits;

    private void openkits() {
        Inventory inv = Bukkit.createInventory(null, 18, ChatColor.AQUA + "Kits");
        ItemStack item = new ItemStack(Material.BREAD);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.DARK_GRAY + "Food");
        List<String> lore = new ArrayList<>();
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "Begin the journey!");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        item.setItemMeta(meta);
        inv.setItem(0, item);
        lore.clear();


        item.setType(Material.WOODEN_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_GRAY + "Traveler");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "Begin the journey");
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(1, item);
        lore.clear();

        item.setType(Material.STONE_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_GREEN + "Low tier soldier");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "Shabby but this will do");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(2, item);
        lore.clear();

        meta.setDisplayName(ChatColor.DARK_GREEN + "Mid tier soldier");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "Better but not there yet");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(3, item);
        lore.clear();

        meta.setDisplayName(ChatColor.DARK_GREEN + "Top tier soldier");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "One of the best set for a soldier");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(4, item);
        lore.clear();

        item.setType(Material.IRON_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_AQUA + "Low tier warrior");
        meta.setLore(lore);
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "Average set for a warrior path");
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(5, item);
        lore.clear();

        meta.setDisplayName(ChatColor.DARK_AQUA + "Mid tier warrior");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "A solid set for a brave warrior");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(6, item);
        lore.clear();

        meta.setDisplayName(ChatColor.DARK_AQUA + "Top tier warrior");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "A step into the godly set realm");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(7, item);
        lore.clear();

        item.setType(Material.DIAMOND_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "Low tier warlord");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "There is a faint trace of divinity upon this set");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(8, item);
        lore.clear();

        meta.setDisplayName(ChatColor.DARK_RED + "Mid tier warlord");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "A flawless set from the finest craftsmanship upon the star");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(9, item);
        lore.clear();

        meta.setDisplayName(ChatColor.DARK_RED + "Top tier warlord");
        lore.add("");
        lore.add(ChatColor.LIGHT_PURPLE + "A mystical set with radiant amount of divinity");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DURABILITY, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        inv.setItem(10, item);
        lore.clear();

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

    @EventHandler
    public void OnClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().contains("Kits"))
            return;
        if (event.getCurrentItem() == null)
            return;
        if (event.getCurrentItem().getItemMeta() == null)
            return;


        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);

        if(event.getClickedInventory().getType() == InventoryType.PLAYER) {
            return;
        }

        //slot of inventory kits
        if (event.getSlot() == 0) {
            //Food kit
            if (!player.hasPermission("kits.food")) {
                player.sendMessage("You are not allow to open this kit");
                return;
            }

            //drop chest of kits
            player.closeInventory();
            player.updateInventory();

            player.closeInventory();
            player.updateInventory();
        }
    }
}
