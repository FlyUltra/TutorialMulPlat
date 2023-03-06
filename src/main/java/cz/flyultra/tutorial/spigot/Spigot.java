package cz.flyultra.tutorial.spigot;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class Spigot extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getLogger().log(Level.INFO, "Cool plugin from Spigot!");
    }

    @Override
    public void onDisable() {

    }

}
