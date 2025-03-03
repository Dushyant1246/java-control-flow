// class HarshadNumber to check if a given number is a Harshad number
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize sum variable
        int sum = 0;
        int originalNumber = number;
        
        // Calculate sum of digits
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        
        // Check if number is divisible by sum of digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number.");
        }
        
        scanner.close();  // Close the scanner
    }
}
