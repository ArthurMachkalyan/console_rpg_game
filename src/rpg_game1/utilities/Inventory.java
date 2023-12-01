package rpg_game1.utilities;

import rpg_game1.items.Item;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private int gold;
    private List<Item> items;

    public int getGold() {
        return gold;
    }

    public List<Item> getItems() {
        return items;
    }

    public Inventory() {
        this.gold = 0;
        this.items = new ArrayList<>();
    }

    public void addGold(int amount) {
        gold += amount;

    }

    public void addItems(Item item) {
        items.add(item);
    }

    public void addItems(List<Item> items) {
        items.addAll(items);
    }

    public void printInfo() {
        System.out.printf("Backpack:\nGold: %d\n", gold);
        if (items.isEmpty()) System.out.println("No things!");
        else for (Item item : items) {
            System.out.println(item.getItemName());
        }
        System.out.println();
    }
}
