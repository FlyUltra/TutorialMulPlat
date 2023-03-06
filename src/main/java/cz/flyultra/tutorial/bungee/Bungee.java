package cz.flyultra.tutorial.bungee;

import net.md_5.bungee.api.plugin.Plugin;

import java.util.logging.Level;

public class Bungee extends Plugin {

    @Override
    public void onEnable() {

        getProxy().getLogger().log(Level.INFO, "Cool plugin from Bungee!");
    }

    @Override
    public void onDisable() {

    }
}
