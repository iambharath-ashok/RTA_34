package day4.collections.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class RecentlyViewedItems {

    public static void displayRecientViews(Map<String, Item> recentlyViewedItems) {

        System.out.println("Recently View Items::");
        for (Map.Entry<String, Item> entry : recentlyViewedItems.entrySet()) {
            System.out.println("Item ID:: "+ entry.getKey() + "  - "+ entry.getValue());
        }
    }

    public static void main(String[] args) {

        Map<String, Item> recentlyViewedItems = new LinkedHashMap<>(5, 0.5f, true);

        recentlyViewedItems.put("101", new Item("item#101", "Product X", 100, "Mobile"));
        recentlyViewedItems.put("102", new Item("item#102", "Product A", 100, "Computer"));
        recentlyViewedItems.put("103", new Item("item#103", "Product B", 100, "Monitors"));
        recentlyViewedItems.put("104", new Item("item#104", "Product C", 100, "Television"));
        recentlyViewedItems.put("105", new Item("item#105", "Product Q", 100, "Utilities"));
        recentlyViewedItems.put("106", new Item("item#106", "Product I", 100, "Mobile"));

        // 101 -> 102 -> 103 -> 104 -> 105 -> 106
        displayRecientViews(recentlyViewedItems);

        recentlyViewedItems.get("103");
        // least recently used => 101 -> 102 -> 104 -> 105 -> 106 -> 103 <= most recently used
        displayRecientViews(recentlyViewedItems);
    }
}


class Item {
    private String itemId;
    private String name;
    private double price;
    private String category;

    public Item(String itemId, String name, double price, String category) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId='" + itemId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}