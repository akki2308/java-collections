package com.bridgelabz.ListInterface;

import java.util.*;

public class Frequency_Counter {
    public static void main(String[] args) {
        // Example input list
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");

        // Create a HashMap to store frequencies
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Count frequencies
        for (String item : list) {
            if (frequencyMap.containsKey(item)) {
                frequencyMap.put(item, frequencyMap.get(item) + 1);
            } else {
                frequencyMap.put(item, 1);
            }
        }

        // Print the frequency map
        System.out.println(frequencyMap);
    }
}
