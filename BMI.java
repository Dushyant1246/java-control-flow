// class BMI to calculate the BMI (Body Mass Index) of a person based on weight and height											
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter weight and height
        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height (in cm): ");
        double height = scanner.nextDouble();
        
        // Convert height from cm to meters
        height = height / 100;
        
        // Calculate BMI
        double bmi = weight / (height * height);
        
        // Determine weight status
        String status = "";
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 24.9) {
            status = "Normal";
        } else if (bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        // Display the BMI and status
        System.out.println("Your BMI: " + bmi);
        System.out.println("Weight Status: " + status);
        
        scanner.close();  // Close the scanner
    }
}
