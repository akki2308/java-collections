package com.bridgelabz.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbersQueue {
    public static void generateBinaryNumbers(int N) {
        Queue<String> q = new LinkedList<>();
        q.add("1"); // Start with "1"

        for (int i = 0; i < N; i++) {
            String current = q.poll(); // Get the front element
            System.out.print(current + " "); // Print the binary number

            // Generate the next two numbers and enqueue them
            q.add(current + "0");
            q.add(current + "1");
        }
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println("First " + N + " Binary Numbers:");
        generateBinaryNumbers(N);
    }
}
