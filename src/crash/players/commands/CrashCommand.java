package crash.players.commands;

import crash.players.Main;
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
        if (!sender.hasPermission("core.crash")) {
            sender.sendMessage(Main.PREFIX + "§cInsufficient permissions!");
            return false;
        }

        if (args.length == 2) {
            Player target = Bukkit.getPlayer(args[0]);

            if (target == null) {
                sender.sendMessage(Main.PREFIX + "§cPlayer you specified is offline!");
                return false;
            }

            String method = args[1];

            // Handle crashing with all methods
            if (method.equalsIgnoreCase("all")) {
                for (CrashType crashType : CrashType.values()) {
                    CrashUtils.crashPlayer(sender, target, crashType);

                }
                return true;
            }

            // Handle crashing with specific method
            CrashType type = CrashType.getFromString(method.toUpperCase());

            if (type != null) {
                CrashUtils.crashPlayer(sender, target, type);
                return true;
            } else {
                sender.sendMessage(Main.PREFIX + "§cMethod " + method + " doesn't exist!");
                return false;
            }


        } else {
            sender.sendMessage(Main.PREFIX + "§cUsage: §b/crash <player> <explosion/position/all>!");
        }

        return true;
    }
}
