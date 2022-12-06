package fr.efrei.views;

import java.util.Scanner;

public class Menu {
    private Boolean run = true;
    private Scanner scan = new Scanner(System.in);
    private int answer;
    public void loadMenu(){
        System.out.println("Welcome to Startup employees management system.");
        while (run){
            System.out.println("Options menu :");
            System.out.println("(1) Add Employee");
            System.out.println("(2) Delete Employee");
            System.out.println("(3) Update Employee");
            System.out.println("(4) Search for an Employee by ID");
            System.out.println("(5) Display all Employees");
            System.out.println("(6) Exit the program");
            System.out.println("Your choice : ");
            answer = scan.nextInt();


            switch(answer) {
                case 1:
                    System.out.println("Not available for the moment");
                    break;
                case 2:
                    System.out.println("Not available for the moment");
                    break;
                case 3:
                    System.out.println("Not available for the moment");
                    break;
                case 4:
                    System.out.println("Not available for the moment");
                    break;
                case 5:
                    System.out.println("Not available for the moment");
                    break;
                case 6:
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
