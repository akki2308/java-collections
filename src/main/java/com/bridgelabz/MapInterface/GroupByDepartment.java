package com.bridgelabz.MapInterface;

import java.util.*;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name; // For clean output
    }
}

public class GroupByDepartment {
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            // If department exists, add to the list; otherwise, create a new list
            departmentMap.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }

        return departmentMap;
    }

    public static void main(String[] args) {
        // Example employee list
        List<Employee> employees = Arrays.asList(
                new Employee("Akshit", "HR"),
                new Employee("Harshit", "IT"),
                new Employee("Harsh", "IT"),
                new Employee("Srishti", "HR"),
                new Employee("Prathna", "Finance")
        );

        // Grouping employees by department
        Map<String, List<Employee>> groupedEmployees = groupByDepartment(employees);

        // Output the grouped result
        System.out.println("Employees grouped by department:");
        for (Map.Entry<String, List<Employee>> entry : groupedEmployees.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
