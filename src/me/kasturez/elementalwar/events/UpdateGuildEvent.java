package me.kasturez.elementalwar.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class UpdateGuildEvent extends Event {

    private static final HandlerList handlerList = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }
}
