package crash.players.commands;

import crash.players.crasher.CrashType;
import crash.players.crasher.CrashUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CrashCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.hasPermission("core.crash")) {
            if (args.length == 2) {
                if (Bukkit.getPlayer(args[0]) != null) {
                    Player p = Bukkit.getPlayer(args[0]);

                    CrashType crashMethod;
                    if (args[1].equalsIgnoreCase("explosion")) {
                        crashMethod = CrashType.EXPLOSION;
                    } else if (args[1].equalsIgnoreCase("position")) {
                        crashMethod = CrashType.POSITION;
                    } else {
                        sender.sendMessage("§3§lUwU §8» §cNo such crash method exists!");
                        return false;
                    }
                    
                    CrashUtils.sendDeadlyPacket(p, crashMethod);
                    sender.sendMessage("§3§lUwU §8» §aCrashed §2" + p.getName() + " §awith §3" + crashMethod.name() + "§a packet!");
                } else {
                    sender.sendMessage("§3§lUwU §8» §cPlayer you specified doesn't exist!");
                }
            } else {
                sender.sendMessage("§3§lUwU §8» §cUsage: §b/crash <player> <explosion/position>!");
            }
        } else {
            sender.sendMessage("§3§lUwU §8» §cNo sufficient permissions!");
        }
        return true;
    }
}
