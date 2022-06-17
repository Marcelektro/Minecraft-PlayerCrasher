package crash.players;

import crash.players.commands.CrashCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Hello! :D
 * Welcome to my Crasher Plugin XD
 * <p>
 * You can do anything you want to do with it :D
 * <p>
 * Just don't crash good people, only these bad ^^
 * <p>
 * Have fun!
 * Marcelektro
 */

public class Main extends JavaPlugin {
    public static final String PREFIX = "§3§lUwU §8» ";

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("§cEnabled PlayerCrasher by Marcelektro, UwU");
        getCommand("crash").setExecutor(new CrashCommand());
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("§cDisabled PlayerCrasher by Marcelektro! Have a good day ^^");
    }
}
