package dev.omochi.flyplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class FlyPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("fly").setExecutor(new flycommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
