package me.angeschossen.lands.api.events;

import me.angeschossen.lands.api.land.Land;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;


public class LandChatEvent extends Event implements Cancellable {
    public static HandlerList handlerList = new HandlerList();
    private boolean cancelled;

    private final String message;
    private final Player sender;
    private final Land land;

    public LandChatEvent(Land land, Player sender, String message) {
        this.land = land;
        this.sender = sender;
        this.message = message;
    }

    public Land getLand() {
        return land;
    }

    public Player getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }
}
