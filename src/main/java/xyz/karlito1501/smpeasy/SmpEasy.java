package xyz.karlito1501.smpeasy;

import org.bukkit.plugin.java.JavaPlugin;

public final class SmpEasy extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("##################");
        System.out.println("#Starting SmpEasy#");
        System.out.println("##################");

    }

    @Override
    public void onDisable() {
        System.out.println("###########################");
        System.out.println("###Shutting down SmpEasy###");
        System.out.println("###########################");
    }
}
