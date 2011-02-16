package com.evilplatypus.bukkit.flow;

import org.bukkit.Material;
import org.bukkit.block.Block;

/**
 * FlowControl for Bukkit
 *
 * @author Jauneau Vincent
 */
public class LavaFlowListener extends FlowListener {

	@Override
	protected boolean isLiquid(Block block) {
    	return block.getType() == Material.LAVA || block.getType() == Material.STATIONARY_LAVA;
	}
    
}
