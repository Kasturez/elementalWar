package me.kasturez.elementalwar.eventHandlers;

import me.kasturez.elementalwar.guild.elementalEssence.ElementalEssence;
import me.kasturez.elementalwar.guild.entities.ElementalGuild;
import me.kasturez.elementalwar.guild.entities.GuildManager;
import me.kasturez.elementalwar.guild.entities.GuildPlayer;
import me.kasturez.elementalwar.guild.entities.PlayerManager;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class InteractGuildNexusEvent implements Listener {
    @EventHandler
    public void onEntityClick(PlayerInteractEvent event) {
        if (event.getClickedBlock() != null)
            if (event.getClickedBlock().getType().equals(Material.BEACON)) {
                if (event.getAction() == Action.LEFT_CLICK_BLOCK) return;
                Location clickedBeaconLocation = event.getClickedBlock().getLocation();
                String clickedBeaconCoordinate = clickedBeaconLocation.getBlockX() + ","
                        + clickedBeaconLocation.getBlockY() + ","
                        + clickedBeaconLocation.getBlockZ();
                GuildPlayer guildPlayer = PlayerManager.getGPlayer(event.getPlayer().getUniqueId());
                ElementalGuild elementalGuild = GuildManager.findElementalGuildByName(guildPlayer.getElementalGuildName());
                if (elementalGuild == null) return;
                if (!elementalGuild.getNexusCoordinate().equalsIgnoreCase(clickedBeaconCoordinate)) {
                    return;
                }
                if (event.getItem() == null) {
                    event.getPlayer().sendMessage("Elemental condense can be deposit here");
                    event.setCancelled(true);
                    return;
                }
                if (event.getItem().isSimilar(ElementalEssence.airEssence)) {
                    elementalGuild.setAir(elementalGuild.getAir() + event.getItem().getAmount());
                    event.getItem().setAmount(0);
                }
                if (event.getItem().isSimilar(ElementalEssence.woodEssence)) {
                    elementalGuild.setWood(elementalGuild.getWood() + event.getItem().getAmount());
                    event.getItem().setAmount(0);
                }
                if (event.getItem().isSimilar(ElementalEssence.earthEssence)) {
                    elementalGuild.setEarth(elementalGuild.getEarth() + event.getItem().getAmount());
                    event.getItem().setAmount(0);
                }
                if (event.getItem().isSimilar(ElementalEssence.fireEssence)) {
                    elementalGuild.setFire(elementalGuild.getFire() + event.getItem().getAmount());
                    event.getItem().setAmount(0);
                }
                if (event.getItem().isSimilar(ElementalEssence.iceEssence)) {
                    elementalGuild.setIce(elementalGuild.getIce() + event.getItem().getAmount());
                    event.getItem().setAmount(0);
                }
                event.setCancelled(true);
            }
    }
}
