package javaclicalculator;

import java.util.Scanner;

public class Calculator extends Operations {
    // Initialize Result object
    Result calcResult = new Result();
    
    // Scanner for user input
    Scanner scanner = new Scanner(System.in);
    double input;

    // Clear screen method
    public void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    // Method to handle user input for calculations

    // Implement abstract methods from Operations class
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
            if (calcResult.getisEmpty() == false){
                System.out.println("Last Result: " + calcResult.getResult());
            }

            System.out.println("=============================");
            System.out.println("Please select your selection:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            if (calcResult.getisEmpty() == false){
                System.out.println("9. Reset Result");
            }

            System.out.println("0. Exit");
            System.out.println("=============================");

            try {
                System.out.print("Type in selection> ");
                input = scanner.nextDouble();

                clearScreen();
                int selection = (int) input;
                switch (selection) {
                    case 1:
                        add();
                        break;
                    case 2:
                        subtract();
                        break;
                    case 3:
                        multiply(selection, selection)();
                        break;
                    case 4:
                        divide(selection, selection);
                        break;
                    case 9:
                        calcResult.resetResult();
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
                if (selection == 0) {
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
