package me.frandma.razerplugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("§c/heal <player>");
                return true;
            }
            Player p = (Player) sender;
            p.setHealth(20);
            p.setSaturation(20);
            p.setFoodLevel(20);
            p.sendMessage("You have healed §byourself§f.");
        } else {
            if (args[0].equals("*")) {
                for (Player p : Bukkit.getOnlinePlayers()) {
                    p.setHealth(20);
                    p.setSaturation(20);
                    p.setFoodLevel(20);
                    p.sendMessage("You have been healed.");
                }
                sender.sendMessage("You have healed §beveryone§f.");
                return true;
            }
            Player target = Bukkit.getPlayer(args[0]);
            if (target == null) return false;
            target.setHealth(20);
            target.setSaturation(20);
            target.setFoodLevel(20);
            target.sendMessage("You have been healed.");
            sender.sendMessage("You have healed §b" + target.getName() + "§f.");
        }
        return true;
    }
}
