package com.sungjujjand.nofireball;

import org.bukkit.plugin.java.JavaPlugin;

public final class Nofireball extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        //start plugin message
        System.out.println("Nofireball plugin is enabled");
        //register event
        getServer().getPluginManager().registerEvents(new event(), this);
        //register command
        getCommand("nofireball").setExecutor(new eventcommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        //stop plugin message
        System.out.println("Nofireball plugin is disabled");
    }
}
