package com.classwork1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Employee implements Comparable<Employee> {
    String name;
    int id;
    double salary;

    public Employee(String n, int i, double s) {
        this.name = n;
        this.id = i;
        this.salary = s;
    }

    @Override
    public String toString() {
        return name + " " + id + " " + salary;
    }

    // Default comparison for sorting by ID (ascending)
    @Override
    public int compareTo(Employee e) {
        return this.id - e.id;
    }
}

// Comparator for sorting by Name (descending)
class NameComparatorDesc implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.name.compareTo(e1.name); // e2 vs e1 for descending order
    }
}

// Comparator for sorting by Salary (descending)
class SalaryComparatorDesc implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        // Use Double.compare for accurate double comparison
        return Double.compare(e2.salary, e1.salary); // e2 vs e1 for descending order
    }
}

public class MenuDriven {
    // Initialize emplist here so methods can access it
    ArrayList<Employee> emplist = new ArrayList<>();

    public MenuDriven() {
        // Initial employee added in the constructor
        emplist.add(new Employee("anuja", 2, 2000));
    }

    public static void main(String[] args) {
        MenuDriven m = new MenuDriven();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("*******Welcome to menu********");
            System.out.println("1. Add an Employee\r\n" +
                               "2. display all emps\r\n" +
                               "3. display emps on id in asc order\r\n" +
                               "4. display emps on name in desc order\r\n" +
                               "5. display emps on sal in desc order");
            System.out.println("6. Exit");
            System.out.println("enter your choice");

            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); // Consume the remaining newline character
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // Consume the invalid input
                choice = 0; // Set choice to 0 to re-enter loop
            }

            switch (choice) {
                case 1:
                    m.addEmployee(sc);
                    break;
                case 2:
                    m.displayEmployees();
                    break;
                case 3:
                    m.orderById();
                    break;
                case 4:
                    m.orderByName();
                    break;
                case 5:
                    m.orderBySalary(); // Changed to orderBySalary
                    break;
                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    if (choice != 0) { // Avoid displaying this for initial 0 case
                         System.out.println("Invalid choice, please enter between 1 and 6.");
                    }
            }
        } while (choice != 6);

        sc.close();
    }

    public void addEmployee(Scanner sc) {
        System.out.println("enter name of employee ");
        // Read name correctly after consuming newline
        String name = sc.nextLine();

        System.out.println("enter id of employee ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline after int

        System.out.println("enter salary of employee ");
        Double salary = sc.nextDouble();
        sc.nextLine(); // Consume newline after double

        if (emplist.add(new Employee(name, id, salary))) {
            System.out.println("Employee added successfully!");
        }
    }

    public void displayEmployees() {
        System.out.println("--- Employee List ---");
        for (Employee e : emplist) {
            System.out.println(e);
        }
        System.out.println("---------------------");
    }

    public void orderById() {
        // Uses the Employee class's compareTo (Comparable)
        Collections.sort(emplist);
        System.out.println("Employees sorted by ID in ascending order.");
        displayEmployees();
    }

    public void orderByName() {
        // Uses the custom NameComparatorDesc (Comparator)
        Collections.sort(emplist, new NameComparatorDesc());
        System.out.println("Employees sorted by Name in descending order.");
        displayEmployees();
    }

    public void orderBySalary() {
        // Uses the custom SalaryComparatorDesc (Comparator)
        Collections.sort(emplist, new SalaryComparatorDesc());
        System.out.println("Employees sorted by Salary in descending order.");
        displayEmployees();
    }
}
