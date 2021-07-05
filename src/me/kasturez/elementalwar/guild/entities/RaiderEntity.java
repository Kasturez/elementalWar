package me.kasturez.elementalwar.guild.entities;

import net.minecraft.server.v1_16_R3.*;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;


public class RaiderEntity extends EntityIronGolem {
    public RaiderEntity( Location location) {
        super(EntityTypes.IRON_GOLEM, ((CraftWorld)location.getWorld()).getHandle());

        this.setPosition(location.getX(), location.getY(), location.getZ());

        this.setCustomName(new ChatComponentText(ChatColor.DARK_RED + "RAIDER"));

        this.setCustomNameVisible(true);

    }

    @Override
    protected void initPathfinder() {

    }
}

