package com.bridgelabz.QueueInterface;

import java.util.PriorityQueue;
import java.util.Comparator;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }
}

public class HospitalTriage {
    public static void main(String[] args) {
        // Custom Comparator to sort by severity in descending order
        PriorityQueue<Patient> pq = new PriorityQueue<>(Comparator.comparingInt((Patient p) -> -p.severity));

        // Adding patients
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        // Processing patients
        System.out.println("Treatment Order:");
        while (!pq.isEmpty()) {
            Patient p = pq.poll();
            System.out.println(p.name + " (Severity: " + p.severity + ")");
        }
    }
}
