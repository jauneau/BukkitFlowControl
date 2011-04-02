package com.evilplatypus.bukkit.flow;

import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.event.Event.Priority;
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
    public static Logger log;

	@Override
	public void onEnable() {
		log = Logger.getLogger("Minecraft");
		log.info(this.getDescription().getName() + " version " + this.getDescription().getVersion() + " loaded.");
		
        // Register our events
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvent(Event.Type.BLOCK_FROMTO, waterListener, Priority.Normal, this);
        pm.registerEvent(Event.Type.BLOCK_FROMTO, lavaListener, Priority.Normal, this);
	}

	@Override
	public void onDisable() {
		log.info(this.getDescription().getName() + " version " + this.getDescription().getVersion() + " unloaded.");
	}


}
