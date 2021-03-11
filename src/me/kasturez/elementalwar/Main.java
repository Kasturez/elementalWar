package me.kasturez.elementalwar;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.entity.TraderLlama;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.omg.CORBA.TRANSACTION_MODE;


import java.util.ArrayList;
import java.util.List;

public class Main extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {
        openkits();
        initTravelerKits();
        initLowSoldierKit();
        initMidSoldierKit();
        initTopSoldierKit();
        initLowWarriorKit();
        initMidWarriorKit();
        initTopWarriorKit();
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {

    }

    private static Inventory kits;

    private static Inventory TravelerKit;

    private static Inventory LowSoldierKit;

    private static Inventory MidSoldierKit;

    private static Inventory TopSoldierKit;

    private static Inventory LowWarriorKit;

    private static Inventory MidWarriorKit;

    private static Inventory TopWarriorKit;

    private static Inventory LowWarlordKit;

    private static Inventory MidWarlordKit;

    private static Inventory TopWarlordKit;
    

    //Traveler kits initializing
    private void initTravelerKits() {
        Inventory inv = Bukkit.createInventory(null, 9, "Traveler");
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta meta = item.getItemMeta();
        assert meta != null;
        meta.setDisplayName(ChatColor.DARK_GRAY + "Traveler's Boot");
        meta.addEnchant(Enchantment.PROTECTION_FALL, 4, true);
        item.setItemMeta(meta);
        inv.setItem(0, item);
        item.removeEnchantment(Enchantment.PROTECTION_FALL);

        item.setType(Material.LEATHER_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_GRAY + "Traveler's Legging");
        item.setItemMeta(meta);
        inv.setItem(1, item);

        item.setType(Material.LEATHER_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_GRAY + "Traveler's Tunic");
        item.setItemMeta(meta);
        inv.setItem(2, item);

        item.setType(Material.LEATHER_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_GRAY + "Traveler's Cap");
        item.setItemMeta(meta);
        inv.setItem(3, item);

        item.setType(Material.WOODEN_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.DARK_GRAY + "Traveler's Excalibur");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
        item.setItemMeta(meta);
        inv.setItem(4, item);


        TravelerKit = inv;
    }

    //Low soldier kit
    private void initLowSoldierKit(){
        Inventory inv = Bukkit.createInventory(null, 9 , "Low Soldier Kit");
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Low Soldier's Boots");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        item.setItemMeta(meta);
        inv.setItem(0,item);

        item.setType(Material.DIAMOND_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName("Low Soldier's Leggings");
        item.setItemMeta(meta);
        inv.setItem(1,item);

        item.setType(Material.DIAMOND_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName("Low Soldier's Chestplate");
        item.setItemMeta(meta);
        inv.setItem(2,item);

        item.setType(Material.DIAMOND_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName("Low Soldier's Helmet");
        item.setItemMeta(meta);
        inv.setItem(3,item);

        item.removeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
        item.setType(Material.DIAMOND_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName("Low Soldier's Sword");
        meta.addEnchant(Enchantment.DAMAGE_ALL,2,true);
        item.setItemMeta(meta);
        inv.setItem(4,item);

        LowSoldierKit = inv;

    }
    //Mid soldier kit
    private void initMidSoldierKit(){
        Inventory inv = Bukkit.createInventory(null, 9 , "Mid Soldier Kit");
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Mid Soldier's Boots");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        item.setItemMeta(meta);
        inv.setItem(0,item);

        item.setType(Material.DIAMOND_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName("Mid Soldier's Leggings");
        item.setItemMeta(meta);
        inv.setItem(1,item);

        item.setType(Material.DIAMOND_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName("Mid Soldier's Chestplate");
        item.setItemMeta(meta);
        inv.setItem(2,item);

        item.setType(Material.DIAMOND_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName("Mid Soldier's Helmet");
        item.setItemMeta(meta);
        inv.setItem(3,item);

        item.removeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
        item.setType(Material.DIAMOND_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName("Mid Soldier's Sword");
        meta.addEnchant(Enchantment.DAMAGE_ALL,3,true);
        item.setItemMeta(meta);
        inv.setItem(4,item);

        MidSoldierKit = inv;

    }
    //Top soldier kit
    private void initTopSoldierKit(){
        Inventory inv = Bukkit.createInventory(null, 9 , "Top Soldier Kit");
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Top Soldier's Boots");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        item.setItemMeta(meta);
        inv.setItem(0,item);

        item.setType(Material.DIAMOND_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName("Top Soldier's Leggings");
        item.setItemMeta(meta);
        inv.setItem(1,item);

        item.setType(Material.DIAMOND_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName("Top Soldier's Chestplate");
        item.setItemMeta(meta);
        inv.setItem(2,item);

        item.setType(Material.DIAMOND_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName("Top Soldier's Helmet");
        item.setItemMeta(meta);
        inv.setItem(3,item);

        item.removeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
        item.setType(Material.DIAMOND_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName("Top Soldier's Sword");
        meta.addEnchant(Enchantment.DAMAGE_ALL,4,true);
        item.setItemMeta(meta);
        inv.setItem(4,item);

        TopSoldierKit = inv;

    }
    //Low warrior kit
    private void initLowWarriorKit(){
        Inventory inv = Bukkit.createInventory(null, 9 , "Low Warrior Kit");
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Low Warrior's Boots");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        item.setItemMeta(meta);
        inv.setItem(0,item);

        item.setType(Material.DIAMOND_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName("Low Warrior's Leggings");
        item.setItemMeta(meta);
        inv.setItem(1,item);

        item.setType(Material.DIAMOND_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName("Low Warrior's Chestplate");
        item.setItemMeta(meta);
        inv.setItem(2,item);

        item.setType(Material.DIAMOND_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName("Low Warrior's Helmet");
        item.setItemMeta(meta);
        inv.setItem(3,item);

        item.removeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
        item.setType(Material.DIAMOND_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName("Low Warrior's Sword");
        meta.addEnchant(Enchantment.DAMAGE_ALL,5,true);
        item.setItemMeta(meta);
        inv.setItem(4,item);

        LowWarriorKit = inv;

    }
    //Mid warrior kit
    private void initMidWarriorKit(){
        Inventory inv = Bukkit.createInventory(null, 9 , "Mid Warrior Kit");
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Mid Warrior's Boots");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 6, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        item.setItemMeta(meta);
        inv.setItem(0,item);

        item.setType(Material.DIAMOND_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName("Mid Warrior's Leggings");
        item.setItemMeta(meta);
        inv.setItem(1,item);

        item.setType(Material.DIAMOND_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName("Mid Warrior's Chestplate");
        item.setItemMeta(meta);
        inv.setItem(2,item);

        item.setType(Material.DIAMOND_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName("Mid Warrior's Helmet");
        item.setItemMeta(meta);
        inv.setItem(3,item);

        item.removeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
        item.setType(Material.DIAMOND_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName("Mid Warrior's Sword");
        meta.addEnchant(Enchantment.DAMAGE_ALL,6,true);
        item.setItemMeta(meta);
        inv.setItem(4,item);

        MidWarriorKit = inv;

    }
    //Top warrior kit
    private void initTopWarriorKit(){
        Inventory inv = Bukkit.createInventory(null, 9 , "Top Warrior Kit");
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Top Warrior's Boots");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 7, true);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        item.setItemMeta(meta);
        inv.setItem(0,item);

        item.setType(Material.DIAMOND_LEGGINGS);
        meta = item.getItemMeta();
        meta.setDisplayName("Top Warrior's Leggings");
        item.setItemMeta(meta);
        inv.setItem(1,item);

        item.setType(Material.DIAMOND_CHESTPLATE);
        meta = item.getItemMeta();
        meta.setDisplayName("Top Warrior's Chestplate");
        item.setItemMeta(meta);
        inv.setItem(2,item);

        item.setType(Material.DIAMOND_HELMET);
        meta = item.getItemMeta();
        meta.setDisplayName("Top Warrior's Helmet");
        item.setItemMeta(meta);
        inv.setItem(3,item);

        item.removeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL);
        item.setType(Material.DIAMOND_SWORD);
        meta = item.getItemMeta();
        meta.setDisplayName("Top Warrior's Sword");
        meta.addEnchant(Enchantment.DAMAGE_ALL,7,true);
        item.setItemMeta(meta);
        inv.setItem(4,item);

        TopWarriorKit = inv;

    }

    //kits menu
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

        if (event.getClickedInventory().getType() == InventoryType.PLAYER) {
            return;
        }

        if (event.getSlot() == 0){
            player.getInventory().addItem(new ItemStack(Material.COOKED_BEEF,32));
        }
        if (event.getSlot() == 1){
            for (ItemStack item: TravelerKit.getContents()) {
                player.getInventory().addItem(item);
            }
        }
        if (event.getSlot() == 2){
            for (ItemStack item: LowSoldierKit.getContents()) {
                player.getInventory().addItem(item);
            }
        }
        if (event.getSlot() == 3){
            for (ItemStack item: MidSoldierKit.getContents()) {
                player.getInventory().addItem(item);
            }
        }
        if (event.getSlot() == 4){
            for (ItemStack item: TopSoldierKit.getContents()) {
                player.getInventory().addItem(item);
            }
        }
        if (event.getSlot() == 5){
            for (ItemStack item: LowWarriorKit.getContents()) {
                player.getInventory().addItem(item);
            }
        }
        if (event.getSlot() == 6){
            for (ItemStack item: MidWarriorKit.getContents()) {
                player.getInventory().addItem(item);
            }
        }
        if (event.getSlot() == 7){
            for (ItemStack item: TopWarriorKit.getContents()) {
                player.getInventory().addItem(item);
            }
        }

        player.closeInventory();
        player.updateInventory();
    }
}