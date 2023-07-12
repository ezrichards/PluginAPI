package me.erichards.pluginapi.item;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

/**
 * Made by Ethan Richards
 * June 03, 2020
 */
public class ItemBuilder {

    private ItemStack itemStack;
    private ItemMeta itemMeta;
    private Material material;
    private int amount;

    public ItemBuilder(Material material, int amount) {
        this.material = material;
        this.amount = amount;
        this.itemStack = new ItemStack(material, amount);
        this.itemMeta = itemStack.getItemMeta();
    }

    public ItemBuilder setDisplayName(Component name) {
        itemMeta.displayName(name);
        return this;
    }

    public ItemBuilder setLore(List<Component> lore) {
        itemMeta.lore(lore);
        return this;
    }

    public ItemBuilder addFlags(ItemFlag... itemFlags) {
        itemMeta.addItemFlags(itemFlags);
        return this;
    }

    public ItemBuilder setUnbreakable(boolean unbreakable) {
        itemMeta.setUnbreakable(unbreakable);
        return this;
    }

    public ItemStack build() {
        itemStack.setItemMeta(itemMeta);
        return itemStack;
    }
}
