package me.kasturez.elementalwar.eventHandlers;

import me.kasturez.elementalwar.guild.utils.*;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class GuildGUIEvent implements Listener {
    @EventHandler
    public void onGuildGUIClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equalsIgnoreCase(ChatColor.BLACK + "GuildMenu"))
            return;
        if (event.getCurrentItem() == null)
            return;
        if (event.getCurrentItem().getItemMeta() == null)
            return;
        if (event.getClickedInventory().getType() == InventoryType.PLAYER)
            return;

        Player player = (Player) event.getWhoClicked();
        GuildPlayer guildPlayer = PlayerManager.getGPlayer(player.getUniqueId());
        ElementalGuild elementalGuild = GuildManager.findElementalGuildByName(guildPlayer.getElementalGuildName());
        player.sendMessage("u clicked: " + event.getSlot());
        event.setCancelled(true);

        if (guildPlayer.getGuildRanks() != GuildRanks.ADMIN) return;
        //wood
        if (event.getSlot() == 11) {
//            if (elementalGuild.getWood() < 100)
//                return;
            for (GuildPlayer guildPlayer1 : elementalGuild.getGuildPlayers()) {
                guildPlayer1.getPlayer()
                        .addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1000, 0));
            }
        }

        //earth
        if (event.getSlot() == 12) {
//            if (elementalGuild.getEarth() < 100)
//                return;
            for (GuildPlayer guildPlayer1 : elementalGuild.getGuildPlayers()) {
                guildPlayer1.getPlayer()
                        .addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 1000, 0));
            }
        }

        //air
        if (event.getSlot() == 13) {
//            if (elementalGuild.getAir() < 100)
//                return;
            for (GuildPlayer guildPlayer1 : elementalGuild.getGuildPlayers()) {
                guildPlayer1.getPlayer()
                        .addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000, 0));
            }
        }

        //fire
        if (event.getSlot() == 14) {
//            if (elementalGuild.getFire() < 100)
//                return;
            for (GuildPlayer guildPlayer1 : elementalGuild.getGuildPlayers()) {
                guildPlayer1.getPlayer()
                        .addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000, 0));
            }
        }

        //ice
        if (event.getSlot() == 15) {
//            if (elementalGuild.getIce() < 100)
//                return;
            for (GuildPlayer guildPlayer1 : elementalGuild.getGuildPlayers()) {
                guildPlayer1.getPlayer()
                        .addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 1000, 0));
            }
        }

    }
}
