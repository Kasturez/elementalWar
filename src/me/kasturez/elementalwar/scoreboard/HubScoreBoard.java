package me.kasturez.elementalwar.scoreboard;

import me.kasturez.elementalwar.events.UpdateGuildEvent;
import me.kasturez.elementalwar.guild.utils.GuildManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.*;

public class HubScoreBoard implements Listener {

    @EventHandler
    public void onJoin(UpdateGuildEvent event){
        createBoard(event.getPlayer());
    }

    public void createBoard(Player player){
        ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = scoreboardManager.getNewScoreboard();
        Objective objective = scoreboard.registerNewObjective("1", "2", "--Guild Information--");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);

        //Score
        Score score3 = objective.getScore(ChatColor.DARK_RED + "=-=-=-=-=-=-=-=-=-=-=-=-=");
        score3.setScore(3);
        Score score2 = objective.getScore(ChatColor.BLUE + "Your guild is: " + GuildManager.getGuilds().toString());
        score2.setScore(2);
        Score score1 = objective.getScore(ChatColor.YELLOW + "Your chunk power: " );
        score1.setScore(1);
        Score score0 = objective.getScore("Your pussy: ");
        score0.setScore(0);
        player.setScoreboard(scoreboard);
    }

}
