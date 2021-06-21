package me.kasturez.elementalwar.economy;

import me.kasturez.elementalwar.guild.utils.GuildPlayer;
import me.kasturez.elementalwar.guild.utils.PlayerManager;
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
            if(args.length == 1){
                return false;
            }
            guildPlayer.sendmsg("Your bal: $" + guildPlayer.getBalance());
            return true;
        }
        return false;
    }
}
