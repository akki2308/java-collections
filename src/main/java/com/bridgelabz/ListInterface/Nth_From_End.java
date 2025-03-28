package com.bridgelabz.ListInterface;

import java.util.*;

public class Nth_From_End {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        // Input list size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input list elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Input N value
        System.out.print("Enter N (Nth element from end): ");
        int N = sc.nextInt();

        // Find the Nth element from the end
        Integer result = findNthFromEnd(list, N);

        // Print the result
        if (result != null) {
            System.out.println("Nth element from end: " + result);
        } else {
            System.out.println("Invalid N value!");
        }

        sc.close();
    }

    public static Integer findNthFromEnd(LinkedList<Integer> list, int N) {
        int size = list.size();

        // Check if N is valid
        if (N <= 0 || N > size) {
            return null;
        }

        // Get the Nth element from the end
        return list.get(size - N);
    }
}
