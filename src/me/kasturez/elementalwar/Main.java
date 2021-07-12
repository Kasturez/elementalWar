package me.kasturez.elementalwar;


import me.kasturez.elementalwar.eventHandlers.*;
import me.kasturez.elementalwar.guild.commands.GuildCMD;
import me.kasturez.elementalwar.guild.elementalEssence.ElementalEssence;
import me.kasturez.elementalwar.guild.entities.*;
import me.kasturez.elementalwar.kits.ElementalKit;
import me.kasturez.elementalwar.guild.commands.DamageEvent;
import me.kasturez.elementalwar.guild.commands.FlyCMD;
import me.kasturez.elementalwar.scoreboard.HubScoreBoard;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Map;
import java.util.UUID;


public class Main extends JavaPlugin {

    private ElementalGuild value;

    @Override
    public void onEnable() {
        ElementalEssence.initElementalDrops();


        getCommand("kits").setExecutor(new ElementalKit());
        getCommand("guild").setExecutor(new GuildCMD());
        getCommand("fly").setExecutor(new FlyCMD());


        getServer().getPluginManager().registerEvents(new GuildGUIEvent(), this);
        getServer().getPluginManager().registerEvents(new KitEvent(), this);
        getServer().getPluginManager().registerEvents(new LandClaimEvent(), this);
        getServer().getPluginManager().registerEvents(new DamageEvent(), this);
        getServer().getPluginManager().registerEvents(new HubScoreBoard(), this);
        getServer().getPluginManager().registerEvents(new RegisterGuildPlayerEvent(), this);
        getServer().getPluginManager().registerEvents(new InteractGuildNexusEvent(), this);
        getServer().getPluginManager().registerEvents(new PlacingNexusEvent(), this);
        getServer().getPluginManager().registerEvents(new RaiderUnclaimEventHandler(this), this);


        this.saveDefaultConfig();
        restoreGuildPlayer();
    }

    @Override
    public void onDisable() {
        saveGuildPlayer();
    }

    private void saveGuild() {
        for (ElementalGuild elementalGuild : GuildManager.getGuilds()) {
            this.getConfig().set("guild", elementalGuild);
        }
        this.saveConfig();
    }

    private void restoreGuild() {

    }

    private void saveGuildPlayer() {
        for (Map.Entry<UUID, GuildPlayer> entry : PlayerManager.getPlayersHashMap().entrySet()) {
            this.getConfig().set("data." + entry.getKey().toString(), "");
            this.getConfig().set("data." + entry.getKey().toString() + ".elementalGuildName",entry.getValue().getElementalGuildName());
            this.getConfig().set("data." + entry.getKey().toString() + ".guildRanks",entry.getValue().getGuildRanks().toString());
        }
        this.saveConfig();
    }

    private void restoreGuildPlayer() {
        this.getConfig().getConfigurationSection("data").getKeys(false).forEach(key -> {
            UUID uuid = UUID.fromString(key);
            String elementalGuildName = this.getConfig().getString("data." + key + ".elementalGuildName");
            String stringGuildRank = this.getConfig().getString("data." + key + ".guildRanks");
            GuildRanks guildRanks = GuildRanks.RECRUIT;
            if (stringGuildRank.equalsIgnoreCase("member")) guildRanks = GuildRanks.MEMBER;
            if (stringGuildRank.equalsIgnoreCase("admin")) guildRanks = GuildRanks.ADMIN;
            PlayerManager.restoreHashMap(uuid, new GuildPlayer(guildRanks, elementalGuildName));
        });
    }
}
