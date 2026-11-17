import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PayrollRunner {
    public static void main(String[] args) {
        String inputFile = "src/pay.csv";
        String outputFile = "src/output.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            boolean isFirstLine = true;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    writer.write(line + ",Weekly Pay\n");
                    isFirstLine = false;
                    continue;
                }

                // Splits CSV row by commas
                String[] parts = line.split(",");
                if (parts.length < 3) {
                    continue;
                }

                String empId = parts[0].trim();
                double payRate = Double.parseDouble(parts[1].trim());
                double hoursWorked = Double.parseDouble(parts[2].trim());

                double weeklyPay = 0.0;

                // Calculate pay with overtime rule
                if (hoursWorked > 40) {
                    double regularPay = 40 * payRate;
                    double overtimeHours = hoursWorked - 40;
                    double overtimePay = overtimeHours * (payRate * 1.5);
                    weeklyPay = regularPay + overtimePay;
                } else {
                    weeklyPay = hoursWorked * payRate;
                }

                // Formats weekly pay as currency
                String formattedWeeklyPay = String.format("$%,.2f", weeklyPay);

                // Write the original data plus the calculated weekly pay to output.csv
                writer.write(empId + "," + payRate + "," + hoursWorked + "," + formattedWeeklyPay + "\n");
            }

            System.out.println("Payroll processing complete! Check output.csv.");

        } catch (IOException e) {
            System.out.println("An error occurred during file processing: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error parsing number from CSV: " + e.getMessage());
        }
    }
}