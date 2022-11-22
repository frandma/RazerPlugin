package me.frandma.razerplugin;

import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityDamageListener implements Listener {
    @EventHandler
    public void onEntityDamage(EntityDamageEvent e) {
        if (!(e.getEntity() instanceof Item)) return;
        e.setCancelled(true);
    }
}
