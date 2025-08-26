package javaclicalculator;

public class Result {
    // Variable to store the result of calculations
    private double result;

    // Constructor
    public Result() {
        this.result = 0;
    } 

    // Getter and setter for result
    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void resetResult() {
        this.result = 0;
    }
}
