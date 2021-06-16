package me.kasturez.elementalwar.guild.utils;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ElementalGuild {

    private String name, desc;
    private final ArrayList<GuildPlayer> guildPlayers = new ArrayList<>();
    private int fire, ice, air, earth, wood;

    public ElementalGuild(String name, String description){
        this.name = name;
        this.desc = description;
    }

    public void addPlayer(GuildPlayer guildPlayer, GuildRanks guildRanks, String elementalGuildName){
        guildPlayers.add(guildPlayer);
        guildPlayer.setGuildRanks(guildRanks);
        guildPlayer.setElementalGuildName(elementalGuildName);
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

    public void setName(String name){
        this.name = name;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public ArrayList<GuildPlayer> getGuildPlayers() {
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
}
