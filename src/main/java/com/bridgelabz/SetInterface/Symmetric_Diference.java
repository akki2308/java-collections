package com.bridgelabz.SetInterface;

import java.util.*;

public class Symmetric_Diference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Input first set
        System.out.print("Enter number of elements in Set 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements of Set 1:");
        for (int i = 0; i < n1; i++) {
            set1.add(sc.nextInt());
        }

        // Input second set
        System.out.print("Enter number of elements in Set 2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of Set 2:");
        for (int i = 0; i < n2; i++) {
            set2.add(sc.nextInt());
        }

        // Compute Symmetric Difference
        Set<Integer> symmetricDiff = new HashSet<>(set1);
        symmetricDiff.addAll(set2); // Union of both sets
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // Intersection of both sets
        symmetricDiff.removeAll(intersection); // Remove common elements

        // Print result
        System.out.println("Symmetric Difference: " + symmetricDiff);

        sc.close();
    }
}
