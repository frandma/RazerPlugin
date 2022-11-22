package me.frandma.razerplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class RazerPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new EntityDamageListener(), this);
        getCommand("heal").setExecutor(new HealCommand());
    }
}
