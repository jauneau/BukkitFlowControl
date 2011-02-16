package com.evilplatypus.bukkit.flow;

import java.io.File;
import java.util.logging.Logger;

import org.bukkit.Server;
import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * FlowControl for Bukkit
 *
 * @author Jauneau Vincent
 */
public class FlowControl extends JavaPlugin {
    private final WaterFlowListener waterListener = new WaterFlowListener();
    private final LavaFlowListener lavaListener = new LavaFlowListener();
    private final Logger log = Logger.getLogger("Minecraft");

	public FlowControl(PluginLoader pluginLoader, Server instance, PluginDescriptionFile desc, File folder, File plugin, ClassLoader cLoader) {
		super(pluginLoader, instance, desc, folder, plugin, cLoader);
	}

	@Override
	public void onEnable() {
		log.info(this.getDescription().getName() + " version " + this.getDescription().getVersion() + " loaded.");
		
        // Register our events
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvent(Event.Type.BLOCK_FLOW, waterListener, Priority.Normal, this);
        pm.registerEvent(Event.Type.BLOCK_FLOW, lavaListener, Priority.Normal, this);
	}

	@Override
	public void onDisable() {
		log.info(this.getDescription().getName() + " version " + this.getDescription().getVersion() + " unloaded.");
	}


}
