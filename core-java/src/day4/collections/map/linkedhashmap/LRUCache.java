package day4.collections.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private final int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.6f, true);
        this.capacity = capacity;
    }

    // a, b, c, m, gr
    // b -> a, c, m, gr, b
    // O -> c, m, gr, b, O
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return this.size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> lruCache = new LRUCache<>(5);
        lruCache.put("Apple", 5);
        lruCache.put("Banana", 2);
        lruCache.put("Cherry", 4);
        lruCache.put("Dry Fruits", 7);
        lruCache.put("Mongo", 5);

        System.out.println(lruCache);

        lruCache.get("Banana");


        System.out.println(lruCache);

        lruCache.put("Orange", 10);

        System.out.println(lruCache);
    }


}
