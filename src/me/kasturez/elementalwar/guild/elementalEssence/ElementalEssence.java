package me.kasturez.elementalwar.guild.elementalEssence;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ElementalEssence {

    public static ItemStack fireEssence;
    public static ItemStack iceEssence;
    public static ItemStack woodEssence;
    public static ItemStack earthEssence;
    public static ItemStack airEssence;

    public static void initElementalDrops() {
        createFireEssence();
        createIceEssence();
        createWoodEssence();
        createEarthEssence();
        createAirEssence();
    }

    private static void createFireEssence() {
        ItemStack item = new ItemStack(Material.ORANGE_DYE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.RED + "fire essence");
        List<String> lore = new ArrayList<>();
        lore.add("give 1 fire elemental point");
        lore.add("bring back to nexus to deposit");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        fireEssence = item;
    }
    private static void createIceEssence() {
        ItemStack item = new ItemStack(Material.LIGHT_BLUE_DYE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.BLUE + "ice essence");
        List<String> lore = new ArrayList<>();
        lore.add("give 1 ice elemental point");
        lore.add("bring back to nexus to deposit");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        iceEssence = item;
    }
    private static void createWoodEssence() {
        ItemStack item = new ItemStack(Material.GREEN_DYE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GREEN + "wood essence");
        List<String> lore = new ArrayList<>();
        lore.add("give 1 wood elemental point");
        lore.add("bring back to nexus to deposit");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        woodEssence = item;
    }
    private static void createEarthEssence() {
        ItemStack item = new ItemStack(Material.BROWN_DYE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.BLACK + "earth essence");
        List<String> lore = new ArrayList<>();
        lore.add("give 1 earth elemental point");
        lore.add("bring back to nexus to deposit");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        earthEssence = item;
    }
    private static void createAirEssence() {
        ItemStack item = new ItemStack(Material.WHITE_DYE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.WHITE + "air essence");
        List<String> lore = new ArrayList<>();
        lore.add("give 1 air elemental point");
        lore.add("bring back to nexus to deposit");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        airEssence = item;
    }
}
