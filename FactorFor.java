// class FactorFor to find factors of a given number using for loop
import java.util.Scanner;

public class FactorFor {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is positive
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");
            // Loop through numbers from 1 to the number
            for (int i = 1; i < number; i++) {
                // Check if i is a factor of the number
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        scanner.close();	// Close the scanner
    }
}
