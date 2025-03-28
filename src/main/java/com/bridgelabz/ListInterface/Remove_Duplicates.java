package com.bridgelabz.ListInterface;

import java.util.*;

public class Remove_Duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input list size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input list elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Remove duplicates while maintaining order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]); // LinkedHashSet maintains insertion order
        }

        // Print the result
        System.out.println("List after removing duplicates: " + set);

        sc.close();
    }
}
