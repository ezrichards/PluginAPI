package me.erichards.pluginapi.inventory;

import org.bukkit.entity.Player;

/**
 * Made by Ethan Richards
 * August 02, 2020
 */
public class InventoryUtils {

    /**
     * Check if a specified player's inventory is full
     * @param player Player who's inventory should be checked
     * @return boolean of whether or not the inventory is full
     */
    public static boolean isInventoryFull(Player player) {
        return player.getInventory().firstEmpty() < 0;
    }
}
