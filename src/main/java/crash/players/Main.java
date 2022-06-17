package crash.players;

import crash.players.commands.CrashCommand;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Hello! :D
 * Welcome to my Crasher Plugin XD
 *
 * You can do anything you want to do with it :D
 *
 * Just don't crash good people, only these bad ^^
 *
 * Have fun!
 * Marcelektro
 */

@Getter
public class Main extends JavaPlugin {
    @Getter
    private static Main instance;
    public static final String PREFIX = "§3§lUwU §8» ";

    public static Main getInstance() {return instance;}

    @Override
    public void onEnable() {
        // Setting the instance
        instance = this;

        Bukkit.getLogger().info("§cEnabled PlayerCrasher by Marcelektro, UwU");
        getCommand("crash").setExecutor(new CrashCommand());
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("§cDisabled PlayerCrasher by Marcelektro! Have a good day ^^");
    }
}