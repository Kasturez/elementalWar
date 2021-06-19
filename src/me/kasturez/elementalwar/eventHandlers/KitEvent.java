package me.kasturez.elementalwar.eventHandlers;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class KitEvent implements Listener {

    //Traveler kit initializing
    private static Inventory initTravelerKits() {
        Inventory inv = Bukkit.createInventory(null, 9, "Traveler");
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.DARK_GRAY + "Traveler's Excalibur");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        item.setItemMeta(meta);
        inv.setItem(0, item);
        item.removeEnchantment(Enchantment.DAMAGE_ALL);

        item.setType(Material.DIAMOND_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_GRAY + "Traveler's Cap");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        item.setItemMeta(meta);
        inv.setItem(1, item);

        item.setType(Material.DIAMOND_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_GRAY + "Traveler's Tunic");
        item.setItemMeta(meta);
        inv.setItem(2, item);

        item.setType(Material.DIAMOND_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_GRAY + "Traveler's Legging");
        item.setItemMeta(meta);
        inv.setItem(3, item);
        item.removeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);

        item.setType(Material.DIAMOND_BOOTS);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_GRAY + "Traveler's Boot");
        meta.addEnchant(Enchantment.PROTECTION_FALL, 1, true);
        item.setItemMeta(meta);
        inv.setItem(4, item);


        return inv;
    }

    //Low soldier kit
    private static Inventory initLowSoldierKit() {
        Inventory inv = Bukkit.createInventory(null, 9, "Low Soldier Kit");
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Low Soldier's Boots");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
        meta.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        item.setItemMeta(meta);
        inv.setItem(4, item);
        item.removeEnchantment(Enchantment.PROTECTION_FALL);

        item.setType(Material.DIAMOND_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName("Low Soldier's Leggings");
        item.setItemMeta(meta);
        inv.setItem(3, item);

        item.setType(Material.DIAMOND_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName("Low Soldier's Chestplate");
        item.setItemMeta(meta);
        inv.setItem(2, item);

        item.setType(Material.DIAMOND_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName("Low Soldier's Helmet");
        item.setItemMeta(meta);
        inv.setItem(1, item);

        item.removeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
        item.setType(Material.DIAMOND_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName("Low Soldier's Sword");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
        item.setItemMeta(meta);
        inv.setItem(0, item);

        return inv;
    }

    //Mid soldier kit
    private static Inventory initMidSoldierKit() {
        Inventory inv = Bukkit.createInventory(null, 9, "Mid Soldier Kit");
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Mid Soldier's Boots");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
        meta.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        item.setItemMeta(meta);
        inv.setItem(4, item);
        item.removeEnchantment(Enchantment.PROTECTION_FALL);

        item.setType(Material.DIAMOND_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName("Mid Soldier's Leggings");
        item.setItemMeta(meta);
        inv.setItem(3, item);

        item.setType(Material.DIAMOND_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName("Mid Soldier's Chestplate");
        item.setItemMeta(meta);
        inv.setItem(2, item);

        item.setType(Material.DIAMOND_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName("Mid Soldier's Helmet");
        item.setItemMeta(meta);
        inv.setItem(1, item);

        item.removeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
        item.setType(Material.DIAMOND_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName("Mid Soldier's Sword");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
        item.setItemMeta(meta);
        inv.setItem(0, item);

        return inv;
    }

    //Top soldier kit
    private static Inventory initTopSoldierKit() {
        Inventory inv = Bukkit.createInventory(null, 9, "Top Soldier Kit");
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("Top Soldier's Boots");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        meta.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        item.setItemMeta(meta);
        inv.setItem(4, item);
        item.removeEnchantment(Enchantment.PROTECTION_FALL);

        item.setType(Material.DIAMOND_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName("Top Soldier's Leggings");
        item.setItemMeta(meta);
        inv.setItem(3, item);

        item.setType(Material.DIAMOND_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName("Top Soldier's Chestplate");
        item.setItemMeta(meta);
        inv.setItem(2, item);

        item.setType(Material.DIAMOND_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName("Top Soldier's Helmet");
        item.setItemMeta(meta);
        inv.setItem(1, item);

        item.removeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
        item.setType(Material.DIAMOND_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName("Top Soldier's Sword");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
        item.setItemMeta(meta);
        inv.setItem(0, item);

        return inv;
    }

    //Low warrior kit
    private static Inventory initLowWarriorKit() {
        Inventory inv = Bukkit.createInventory(null, 9, "Low Warrior Kit");
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Low Warrior's Boots");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        meta.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        item.setItemMeta(meta);
        inv.setItem(4, item);
        item.removeEnchantment(Enchantment.PROTECTION_FALL);

        item.setType(Material.DIAMOND_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName("Low Warrior's Leggings");
        item.setItemMeta(meta);
        inv.setItem(3, item);

        item.setType(Material.DIAMOND_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName("Low Warrior's Chestplate");
        item.setItemMeta(meta);
        inv.setItem(2, item);

        item.setType(Material.DIAMOND_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName("Low Warrior's Helmet");
        item.setItemMeta(meta);
        inv.setItem(1, item);

        item.removeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
        item.setType(Material.DIAMOND_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName("Low Warrior's Sword");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
        item.setItemMeta(meta);
        inv.setItem(0, item);

        return inv;
    }

    //Mid warrior kit

    private static Inventory initMidWarriorKit() {
        Inventory inv = Bukkit.createInventory(null, 9, "Mid Warrior Kit");
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("Mid Warrior's Boots");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
        meta.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        item.setItemMeta(meta);
        inv.setItem(4, item);
        item.removeEnchantment(Enchantment.PROTECTION_FALL);

        item.setType(Material.DIAMOND_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName("Mid Warrior's Leggings");
        item.setItemMeta(meta);
        inv.setItem(3, item);

        item.setType(Material.DIAMOND_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName("Mid Warrior's Chestplate");
        item.setItemMeta(meta);
        inv.setItem(2, item);

        item.setType(Material.DIAMOND_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName("Mid Warrior's Helmet");
        item.setItemMeta(meta);
        inv.setItem(1, item);

        item.removeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
        item.setType(Material.DIAMOND_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName("Mid Warrior's Sword");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 6, true);
        item.setItemMeta(meta);
        inv.setItem(0, item);

        return inv;
    }

    //Top warrior kit
    private static Inventory initTopWarriorKit() {
        Inventory inv = Bukkit.createInventory(null, 9, "Top Warrior Kit");
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName("Top Warrior's Boots");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
        meta.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        item.setItemMeta(meta);
        inv.setItem(4, item);
        item.removeEnchantment(Enchantment.PROTECTION_FALL);

        item.setType(Material.DIAMOND_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName("Top Warrior's Leggings");
        item.setItemMeta(meta);
        inv.setItem(3, item);

        item.setType(Material.DIAMOND_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName("Top Warrior's Chestplate");
        item.setItemMeta(meta);
        inv.setItem(2, item);

        item.setType(Material.DIAMOND_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName("Top Warrior's Helmet");
        item.setItemMeta(meta);
        inv.setItem(1, item);

        item.removeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
        item.setType(Material.DIAMOND_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName("Top Warrior's Sword");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 7, true);
        item.setItemMeta(meta);
        inv.setItem(0, item);

        return inv;
    }

    //Low tier warlord kit initializing
    private static Inventory initLowWarlordKit() {
        Inventory inv = Bukkit.createInventory(null, 9, "Low Warlord kit");
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.DARK_RED + "Low Warlord Sword");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 8, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 5, true);
        item.setItemMeta(meta);
        inv.setItem(0, item);
        item.removeEnchantment(Enchantment.DAMAGE_ALL);
        item.removeEnchantment(Enchantment.FIRE_ASPECT);

        item.setType(Material.DIAMOND_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "Low Warlord Helmet");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 8, true);
        meta.addEnchant(Enchantment.PROTECTION_FIRE, 8, true);
        meta.addEnchant(Enchantment.THORNS, 5, true);
        meta.addEnchant(Enchantment.MENDING, 5, true);
        item.setItemMeta(meta);
        inv.setItem(1, item);

        item.setType(Material.DIAMOND_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "Low Warlord Chestplate");
        item.setItemMeta(meta);
        inv.setItem(2, item);

        item.setType(Material.DIAMOND_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "Low Warlord Leggings");
        item.setItemMeta(meta);
        inv.setItem(3, item);
        item.removeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
        item.removeEnchantment(Enchantment.PROTECTION_FIRE);
        item.removeEnchantment(Enchantment.THORNS);
        item.removeEnchantment(Enchantment.MENDING);

        item.setType(Material.DIAMOND_BOOTS);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "Low Warlord Boot");
        meta.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
        item.setItemMeta(meta);
        inv.setItem(4, item);

        return inv;
    }

    //Mid tier warlord kit initializing
    private static Inventory initMidWarlordKit() {
        Inventory inv = Bukkit.createInventory(null, 9, "Mid tier warlord");
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.DARK_RED + "MT_Warlord's Excalibur");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 9, true);
        item.setItemMeta(meta);
        inv.setItem(0, item);
        item.removeEnchantment(Enchantment.DAMAGE_ALL);

        item.setType(Material.DIAMOND_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "LT_Warlord's Cap");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 9, true);
        item.setItemMeta(meta);
        inv.setItem(1, item);

        item.setType(Material.DIAMOND_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "LT_Warlord's Tunic");
        item.setItemMeta(meta);
        inv.setItem(2, item);

        item.setType(Material.DIAMOND_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "LT_Warlord's Legging");
        item.setItemMeta(meta);
        inv.setItem(3, item);
        item.removeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);

        item.setType(Material.DIAMOND_BOOTS);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "LT_Warlord's Boot");
        meta.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
        item.setItemMeta(meta);
        inv.setItem(4, item);


        return inv;
    }

    //Top tier warlord kit initializing
    private static Inventory initTopWarlordKit() {
        Inventory inv = Bukkit.createInventory(null, 9, "Top tier warlord");
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.DARK_RED + "LT_Warlord's Excalibur");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        item.setItemMeta(meta);
        inv.setItem(0, item);
        item.removeEnchantment(Enchantment.DAMAGE_ALL);

        item.setType(Material.DIAMOND_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "TT_Warlord's Cap");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        item.setItemMeta(meta);
        inv.setItem(1, item);

        item.setType(Material.DIAMOND_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "TT_Warlord's Tunic");
        item.setItemMeta(meta);
        inv.setItem(2, item);

        item.setType(Material.DIAMOND_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "TT_Warlord's Legging");
        item.setItemMeta(meta);
        inv.setItem(3, item);
        item.removeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);

        item.setType(Material.DIAMOND_BOOTS);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_RED + "TT_Warlord's Boot");
        meta.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
        item.setItemMeta(meta);
        inv.setItem(4, item);


        return inv;
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

        if (event.getClickedInventory().getType() == InventoryType.PLAYER) {
            return;
        }

        if (event.getSlot() == 0) {
            player.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 32));
            player.closeInventory();
            player.updateInventory();
        }
        if (event.getSlot() == 1) {
            player.closeInventory();
            player.updateInventory();
            for (ItemStack item : initTravelerKits().getContents()) {
                player.getInventory().addItem(item);
            }
        }
        if (event.getSlot() == 2) {
            player.closeInventory();
            player.updateInventory();
            for (ItemStack item : initLowSoldierKit().getContents()) {
                player.getInventory().addItem(item);
            }
        }
        if (event.getSlot() == 3) {
            player.closeInventory();
            player.updateInventory();
            for (ItemStack item : initMidSoldierKit().getContents()) {
                player.getInventory().addItem(item);
            }
        }
        if (event.getSlot() == 4) {
            player.closeInventory();
            player.updateInventory();
            for (ItemStack item : initTopSoldierKit().getContents()) {
                player.getInventory().addItem(item);
            }
        }
        if (event.getSlot() == 5) {
            player.closeInventory();
            player.updateInventory();
            for (ItemStack item : initLowWarriorKit().getContents()) {
                player.getInventory().addItem(item);
            }
        }
        if (event.getSlot() == 6) {
            player.closeInventory();
            player.updateInventory();
            for (ItemStack item : initMidWarriorKit().getContents()) {
                player.getInventory().addItem(item);
            }
        }
        if (event.getSlot() == 7) {
            player.closeInventory();
            player.updateInventory();
            for (ItemStack item : initTopWarriorKit().getContents()) {
                player.getInventory().addItem(item);
            }
        }
        if (event.getSlot() == 8) {
            player.closeInventory();
            player.updateInventory();
            for (ItemStack item : initLowWarlordKit().getContents()) {
                player.getInventory().addItem(item);
            }
        }
        if (event.getSlot() == 9) {
            player.closeInventory();
            player.updateInventory();
            for (ItemStack item : initMidWarlordKit().getContents()) {
                player.getInventory().addItem(item);
            }
        }
        if (event.getSlot() == 10) {
            player.closeInventory();
            player.updateInventory();
            for (ItemStack item : initTopWarlordKit().getContents()) {
                player.getInventory().addItem(item);
            }
        }
    }
}
