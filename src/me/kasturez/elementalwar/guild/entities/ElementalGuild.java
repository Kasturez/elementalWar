package me.kasturez.elementalwar.guild.entities;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.UUID;

public class ElementalGuild {

    private String name, desc, nexusCoordinate = "none";
    private boolean nexusPlaced = false;
    private final ArrayList<UUID> guildPlayers = new ArrayList<>();
    private int fire, ice, air, earth, wood, guildLevel, guildPoint;

    public ElementalGuild(String name, String description) {
        this.name = name;
        this.desc = description;
    }

    public void addPlayer(Player player, GuildRanks guildRanks){
        guildPlayers.add(player.getUniqueId());
        GuildPlayer guildPlayer = PlayerManager.getGPlayer(player.getUniqueId());
        guildPlayer.setGuildRanks(guildRanks);
        guildPlayer.setElementalGuildName(this.name);
    }

    public void removePlayer(Player player){
        guildPlayers.remove(player.getUniqueId());
        PlayerManager.getGPlayer(player.getUniqueId()).setElementalGuildName("wild");
    }

    @Override
    public String toString() {
        return "ElementalGuild{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNexusCoordinate() {
        return nexusCoordinate;
    }

    public void setNexusCoordinate(String nexusCoordinate) {
        this.nexusCoordinate = nexusCoordinate;
    }

    public boolean isNexusPlaced() {
        return nexusPlaced;
    }

    public void setNexusPlaced(boolean nexusPlaced) {
        this.nexusPlaced = nexusPlaced;
    }

    public ArrayList<UUID> getGuildPlayers() {
        return guildPlayers;
    }

    public int getFire() {
        return fire;
    }

    public void setFire(int fire) {
        this.fire = fire;
    }

    public int getIce() {
        return ice;
    }

    public void setIce(int ice) {
        this.ice = ice;
    }

    public int getAir() {
        return air;
    }

    public void setAir(int air) {
        this.air = air;
    }

    public int getEarth() {
        return earth;
    }

    public void setEarth(int earth) {
        this.earth = earth;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getGuildLevel() {
        return guildLevel;
    }

    public void setGuildLevel(int guildLevel) {
        this.guildLevel = guildLevel;
    }

    public int getGuildPoint() {
        return guildPoint;
    }

    public void setGuildPoint(int guildPoint) {
        this.guildPoint = guildPoint;
    }
}
