package com.bridgelabz.ListInterface;

import java.util.*;

public class Reverse_A_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for ArrayList
        System.out.print("Enter the number of elements for ArrayList: ");
        int n = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }

        // Reversing ArrayList manually
        System.out.print("Reversed ArrayList: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        // Taking input for LinkedList
        System.out.print("Enter the number of elements for LinkedList: ");
        int m = sc.nextInt();
        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i < m; i++) {
            linkedList.add(sc.nextInt());
        }

        // Reversing LinkedList manually
        System.out.print("Reversed LinkedList: ");
        for (int i = m - 1; i >= 0; i--) {
            System.out.print(linkedList.get(i) + " ");
        }

        sc.close();
    }
}
