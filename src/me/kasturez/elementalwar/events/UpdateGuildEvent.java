package me.kasturez.elementalwar.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class UpdateGuildEvent extends Event {

    private static final HandlerList handlerList = new HandlerList();

    private final Player player;

    public UpdateGuildEvent(Player player) {
        this.player = player;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    public Player getPlayer() {
        return player;
    }
}
