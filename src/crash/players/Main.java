package crash.players;

import crash.players.commands.CrashCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * Hello!
 * Welcome to my Crasher Plugin XD
 * You can do anything you want to do with it :D
 * Just don't crash good people, only these bad ^^
 * Have fun!
 * Marcelektro
 */

public class Main extends JavaPlugin {
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
