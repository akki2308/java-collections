package com.bridgelabz.SetInterface;


import java.util.*;

public class Find_Subsets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3)); // Subset
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4)); // Superset

        // Check if set1 is a subset of set2
        boolean isSubset = set2.containsAll(set1);

        // Print result
        System.out.println("Is Set1 a subset of Set2? " + isSubset);
    }
}
