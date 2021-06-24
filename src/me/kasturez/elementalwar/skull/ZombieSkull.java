package me.kasturez.elementalwar.skull;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.UUID;

public class ZombieSkull {

    public static ItemStack zombieSkull;

    public static void createZombieSkull(){
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(),
                "generic.maxHealth", 20, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        ItemStack item = new ItemStack(Material.ZOMBIE_HEAD);
        ItemMeta meta = item.getItemMeta();
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, modifier);
        item.setItemMeta(meta);
        zombieSkull = item;
    }
}
