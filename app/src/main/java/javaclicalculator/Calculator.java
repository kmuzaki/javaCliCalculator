package javaclicalculator;

import java.util.Scanner;

public class Calculator extends Operations {
    // Variable to store the result of calculations
    private double result;
    
    // Scanner for user input
    Scanner scanner = new Scanner(System.in);
    String input;

    // Clear screen method
    public void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    double subtract(double a, double b) {
        return a - b;
    }

    @Override
    double multiply(double a, double b) {
        return a * b;
    }

    @Override
    double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public void mainMenu(){
        
        while (true){
            System.out.println("=============================");
            System.out.println("Please select your selection:");
            System.out.println("1. Add new student");
            System.out.println("2. View all students");
            System.out.println("3. Edit student information");
            System.out.println("4. Search student by ID");
            System.out.println("5. Remove student");
            System.out.println("0. Exit");
            System.out.println("=============================");

            try {
                System.out.print("Type in selection> ");
                input = scanner.nextLine();

                clearScreen();
                switch (input) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        gettAllStudents();
                        break;
                    case 3:
                        updateStudent();
                        break;
                    case 4:
                        // getStudentById();
                        break;
                    case 5:
                        removeStudent();
                        break;
                    case 0:
                        System.out.println("See you next time!");
                        scanner.close();
                        break;
                    default:
                        System.out.println("Invalid Input! Please check your input again.");
                        System.out.println("");
                        break;
                }
                if (input == "0") {
                    break;
                }
            } catch (Exception e) {
                System.out.println("");
                // System.out.println("Invalid Input! Please check your input again.");
                // clearScreen();
                scanner.nextLine();
            }
        }
    }

}
