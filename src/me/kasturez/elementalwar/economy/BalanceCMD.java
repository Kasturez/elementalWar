package me.kasturez.elementalwar.economy;

import me.kasturez.elementalwar.events.UpdateGuildEvent;
import me.kasturez.elementalwar.guild.utils.GuildPlayer;
import me.kasturez.elementalwar.guild.utils.PlayerManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BalanceCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("balance")){
            if(!(sender instanceof Player)){
                sender.sendMessage("You r the server!");
                return true;
            }
            Player player = (Player) sender;
            GuildPlayer guildPlayer = PlayerManager.getGPlayer(player.getUniqueId());
            UpdateGuildEvent updateGuildEvent = new UpdateGuildEvent(player);

            if(args.length == 0){
                player.sendMessage("Your bal: $" + guildPlayer.getBalance());
                return true;
            }

            if(args[0].equalsIgnoreCase("add10")){
                double sum = guildPlayer.getBalance();
                sum += 10;
                guildPlayer.setBalance(sum);
                player.sendMessage(ChatColor.GREEN + "Added $10 to your balance");
                Bukkit.getPluginManager().callEvent(updateGuildEvent);
                return true;
            }
            return true;
        }
        return false;
    }
}
