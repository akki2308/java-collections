package com.bridgelabz.SetInterface;

import java.util.*;

public class Set_To_Sorted_List {
    public static void main(String[] args) {
        // Create a HashSet with elements
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        // Convert HashSet to List
        List<Integer> sortedList = new ArrayList<>(set);

        // Sort the List
        Collections.sort(sortedList);

        // Print result
        System.out.println("Sorted List: " + sortedList);
    }
}
