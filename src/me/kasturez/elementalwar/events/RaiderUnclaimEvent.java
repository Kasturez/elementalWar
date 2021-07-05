package me.kasturez.elementalwar.events;

import me.kasturez.elementalwar.guild.entities.RaiderEntity;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class RaiderUnclaimEvent extends Event {

    private final RaiderEntity raiderEntity;

    private static final HandlerList HANDLER = new HandlerList();

    public RaiderUnclaimEvent(RaiderEntity raiderEntity) {
        this.raiderEntity = raiderEntity;
    }

    public RaiderEntity getRaiderEntity() {
        return raiderEntity;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER;
    }

    public static HandlerList getHandlerList() {
        return HANDLER;
    }
}
