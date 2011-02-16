package com.evilplatypus.bukkit.flow;

import org.bukkit.Material;
import org.bukkit.block.Block;

/**
 * FlowControl for Bukkit
 *
 * @author Jauneau Vincent
 */
public class WaterFlowListener extends FlowListener {

	@Override
	protected boolean isLiquid(Block block) {
    	return block.getType() == Material.WATER || block.getType() == Material.STATIONARY_WATER;
	}
    
}
