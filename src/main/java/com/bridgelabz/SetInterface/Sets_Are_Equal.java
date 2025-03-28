package com.bridgelabz.SetInterface;

import java.util.*;

public class Sets_Are_Equal {
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

        // Compare sets
        if (set1.equals(set2)) {
            System.out.println("Both sets contain the same elements.");
        } else {
            System.out.println("Sets do NOT contain the same elements.");
        }

        sc.close();
    }
}
