package fr.efrei.views;

import java.util.Scanner;

public class Menu {
    private Boolean run = true;
    private Scanner scan = new Scanner(System.in);
    private int answer;

    public void loadMenu() {
        System.out.println("Welcome to Startup employees management system.");
        while (run) {
            System.out.println("┌────────────────────┐");
            System.out.printf("│%-20s│%n", "Options menu :");
            System.out.println("└────────────────────┘");
            System.out.println("┌──────────────────────────────────┐");
            System.out.printf("│%-34s│%n", "(1) Add Employee");
            System.out.printf("│%-34s│%n", "(2) Delete Employee");
            System.out.printf("│%-34s│%n", "(3) Update Employee");
            System.out.printf("│%-34s│%n", "(4) Search for an Employee by ID");
            System.out.printf("│%-34s│%n", "(5) Display all Employees");
            System.out.printf("│%-34s│%n", "(6) Exit the program");
            System.out.println("└──────────────────────────────────┘");
            System.out.print("Your choice : ");

            try {
                answer = scan.nextInt();
            } catch (Exception e) {
                answer = -1;
            }

            switch (answer) {
                case 1: // Add Employee
                    System.out.println("Not available for the moment");
                    run = false;
                    break;
                case 2: // Delete Employee
                    System.out.println("Not available for the moment");
                    run = false;
                    break;
                case 3: // Update Employee
                    System.out.println("Not available for the moment");
                    run = false;
                    break;
                case 4: // Search Employee by ID
                    System.out.println("Not available for the moment");
                    run = false;
                    break;
                case 5: // Display all employee
                    System.out.println("Not available for the moment");
                    run = false;
                    break;
                case 6: // Exit
                    System.out.println("Thank you for using our program.");
                    run = false;
                    break;
                default:
                    System.out.printf("Please enter a number between 1 and 6.\n");
                    break;
            }
        }
    }
}