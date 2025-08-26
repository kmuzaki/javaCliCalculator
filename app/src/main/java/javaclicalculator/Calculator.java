package javaclicalculator;

import java.util.Scanner;

public class Calculator extends Operations {
    // Variable to store the result of calculations
    private double result;
    
    // Scanner for user input
    Scanner scanner = new Scanner(System.in);

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

    // Getter and setter for result
    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
