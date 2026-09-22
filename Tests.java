//Sufhi Tatum

import java.util.Scanner;

public class Tests {
    private double average;
    private int count;

    // Default Constructor
    public Tests() {
        this.average = 0.0;
        this.count = 0;
    }

    // Accessors
    public double getAverageValue() {
        return average;
    }

    public int getCount() {
        return count;
    }

    // Method to collect scores
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        count = 0;

        // Priming the loop
        System.out.print("Enter test score (-1 to quit): ");
        double score = scanner.nextDouble();

        // Ends loop when -1 is entered
        while (score != -1) {
            sum += score;
            count++;
            System.out.print("Enter test score (-1 to quit): ");
            score = scanner.nextDouble();
        }

        // Calculate average after loop finishes
        average = sum / count;
    }

    //
    @Override
    public String toString() {
        return String.format("The average of the %d scores entered is %.2f.", count, average);
    }
}
