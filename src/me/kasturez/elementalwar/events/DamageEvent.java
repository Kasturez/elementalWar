package me.kasturez.elementalwar.events;

import me.kasturez.elementalwar.guild.commands.FlyCMD;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageEvent implements Listener {

    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = (Player) event.getEntity();
            if (!(FlyCMD.getFlyingPlayersList().contains(player))) {
                return;
            }
            if (event.getDamage() >= 0) {
                if (event.getCause() == EntityDamageEvent.DamageCause.FALL) {
                    return;
                }
                FlyCMD.setFlyFalse(player);
            }
        }
    }
}
