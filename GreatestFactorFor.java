// class GreatestFactorFor to find greatest factor of a given number using for loop
import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is positive
        if (number > 0) {
			int greatestFactor = 1;
            // Loop from number - 1 to 1
            for (int i = number - 1; number > 1; i--) {
                // Check if i is a factor of the number
                if (number % i == 0) {
                    greatestFactor = i;
					break;
                }
            }
			System.out.println("Greatest factor of " + number + " is " + greatestFactor);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        scanner.close();	// Close the scanner
    }
}
