package com.bridgelabz.ListInterface;

import java.util.*;

public class Rotate_List {
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

        // Input rotation count
        System.out.print("Enter the number of positions to rotate: ");
        int k = sc.nextInt();
        k = k % n; // Handle cases where k > n

        // Rotate the array manually
        System.out.println("Rotated List:");
        for (int i = k; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
