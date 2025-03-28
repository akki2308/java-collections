package com.bridgelabz.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push operation
    public void push(int x) {
        q1.add(x); // Always push into q1
    }

    // Pop operation
    public int pop() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move all elements except last from q1 to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // Get the last element (which is the stack's top)
        int topElement = q1.poll();

        // Swap the queues (q2 becomes q1, q1 becomes empty)
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Top operation (Peek)
    public int top() {
        if (q1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        // Move all elements except last from q1 to q2
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }

        // Get the last element but don't remove it
        int topElement = q1.poll();
        q2.add(topElement); // Put it back into q2

        // Swap queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top()); // Output: 3
        System.out.println("Pop: " + stack.pop()); // Output: 3
        System.out.println("Top after pop: " + stack.top()); // Output: 2
    }
}
