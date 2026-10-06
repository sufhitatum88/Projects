public class Calc {
    // Private variables
    private double num1;
    private double num2;

    // Default Constructor
    public Calc() {
        this.num1 = 0.0;
        this.num2 = 0.0;
    }

    // Setters
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // Getters
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    // toString Method
    @Override
    public String toString() {
        return "Num1: " + num1 + "\nNum2: " + num2;
    }
}