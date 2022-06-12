package com.github.tsuoihito.loginmessage;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class LoginMessage extends JavaPlugin implements Listener {

    private String message;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        message = getConfig().getString("message");
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
    }

    @EventHandler(priority = EventPriority.NORMAL)
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage(message);
    }
}
