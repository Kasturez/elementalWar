package me.kasturez.elementalwar.scoreboard;

import me.kasturez.elementalwar.events.UpdateGuildEvent;
import me.kasturez.elementalwar.guild.utils.PlayerManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.*;

public class HubScoreBoard implements Listener {

    @EventHandler
    public void updateGuildScoreBoard(UpdateGuildEvent event) {
        createBoard(event.getPlayer());
    }

    public static void createBoard(Player player) {
        ScoreboardManager scoreboardManager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = scoreboardManager.getNewScoreboard();
        Objective objective = scoreboard.registerNewObjective("Scoreboard1", "dummy", ChatColor.DARK_PURPLE + "--Guild Information--");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);

        //Score
        Score score3 = objective.getScore(ChatColor.DARK_RED + "=-=-=-=-=-=-=-=-=-=-=-=-=");
        score3.setScore(3);
        Score score2 = objective.getScore(ChatColor.BLUE + "Your guild is: " + PlayerManager.getGPlayer(player.getUniqueId()).getElementalGuildName());
        score2.setScore(2);
        Score score1 = objective.getScore(ChatColor.YELLOW + "Your Balance: " + PlayerManager.getGPlayer(player.getUniqueId()).getBalance());
        score1.setScore(1);
        Score score0 = objective.getScore("Your chunk power ");
        score0.setScore(0);
        if (PlayerManager.getGPlayer(player.getUniqueId()).getElementalGuildName().equalsIgnoreCase("wild")) {
            player.setScoreboard(scoreboard);
        }
        if (!PlayerManager.getGPlayer(player.getUniqueId()).getElementalGuildName().equalsIgnoreCase("wild")) {
            player.setScoreboard(scoreboard);
        }
    }

}
