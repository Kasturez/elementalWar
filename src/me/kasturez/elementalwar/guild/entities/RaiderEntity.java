package me.kasturez.elementalwar.guild.entities;

import net.minecraft.server.v1_16_R3.*;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_16_R3.CraftWorld;

import java.util.ArrayList;
import java.util.List;

public class RaiderEntity extends EntityGuardianElder {

    private static final List<EntityGuardianElder> Nexuses = new ArrayList<>();

    public RaiderEntity(Location location){
        super(EntityTypes.ELDER_GUARDIAN, ((CraftWorld) location.getWorld()).getHandle());

        this.setPosition(location.getX(), location.getY(), location.getZ());

        this.setCustomName(new ChatComponentText(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Nexus"));

        this.setCustomNameVisible(true);

        this.setNoAI(true);

        Nexuses.add(this);
    }
}
