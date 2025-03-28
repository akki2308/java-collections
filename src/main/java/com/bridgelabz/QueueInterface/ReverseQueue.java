package com.bridgelabz.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> q) {
        if (q.isEmpty()) {
            return;
        }
        int front = q.poll(); // Remove front element
        reverseQueue(q); // Recur for remaining queue
        q.add(front); // Add removed element back at the end
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Original Queue: " + q);
        reverseQueue(q);
        System.out.println("Reversed Queue: " + q);
    }
}
