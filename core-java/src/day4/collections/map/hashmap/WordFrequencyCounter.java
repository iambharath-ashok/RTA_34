package day4.collections.map.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        //Find the frequency of words in the given sentence

        String text = "This is java langauage, this is simple and lets a java job and i need to practise java and this is just a test.";
        String[] words = text.split("\\s+");
        Map<String, Integer> wordFrequencyMap = new HashMap<>();


        // Before 8
        for (String word: words) {
            word = word.toLowerCase();
            if(wordFrequencyMap.containsKey(word)) {
               int currentWordCount = wordFrequencyMap.get(word);
               wordFrequencyMap.put(word, currentWordCount + 1);
            } else {
                wordFrequencyMap.put(word, 1);
            }
        }
        // Display the word frequencies
        System.out.println(wordFrequencyMap);


    }
}
