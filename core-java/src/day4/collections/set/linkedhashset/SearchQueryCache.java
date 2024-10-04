package day4.collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class SearchQueryCache {

    // Scenario  -
    //search a - add to cache
    // search b - add to cache
    // search c - add to cache

    // c, b, a

    // search a
    //a, c, b

    private LinkedHashSet<String> recentSearchQueries = new LinkedHashSet<>();
    private static final int MAX_CACHE_SIZE = 5;


    //Add the new Query
    public void addSearchQuery(String query) {
        // If the query is already present in cache, remove it first to update its position
        if(recentSearchQueries.contains(query)) {
            recentSearchQueries.remove(query);
        }

        // Add the new Query
        recentSearchQueries.add(query);

        // If the cache size exceeds the max size, remove the older entry
        if(recentSearchQueries.size() > MAX_CACHE_SIZE) {
            String oldestQuery = recentSearchQueries.iterator().next();
            recentSearchQueries.remove(oldestQuery);
        }
    }


    public void displaySearchQueries() {
        System.out.println("Recent Searched Queries :: "+ recentSearchQueries);
    }


    public static void main(String[] args) {

        SearchQueryCache cache = new SearchQueryCache();
        cache.addSearchQuery("java collections");
        cache.addSearchQuery("Linkedhashset example");
        cache.addSearchQuery("internal working of hashset");
        cache.addSearchQuery("hashmap vs hashset");
        cache.addSearchQuery("java 8 features");
        cache.addSearchQuery("internal working of hashset");


        cache.displaySearchQueries();// Displays the last 5 recent search queries in order

        cache.addSearchQuery("java 17 features");
        cache.displaySearchQueries();

        cache.addSearchQuery("Spring boot tutorials");
        cache.displaySearchQueries();

    }

}
