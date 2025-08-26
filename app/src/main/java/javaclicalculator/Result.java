package javaclicalculator;

public class Result {
    // Variable to store the result of calculations
    private double result;
    private boolean isEmpty;

    // Constructor
    public Result() {
        this.result = 0;
        this.isEmpty = true;
    } 

    // Getter and setter methods
    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public boolean getisEmpty() {
        return isEmpty;
    }

    public void setIsEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public void resetResult() {
        this.result = 0;
        this.isEmpty = true;
    }
}
