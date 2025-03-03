// class GreatestFactorWhile to find greatest factor of a given number using while loop
import java.util.Scanner;

public class GreatestFactorWhile {
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
			int counter = number - 1;
            while (counter > 1) {
                // Check if counter is a factor of the number
                if (number % counter == 0) {
                    greatestFactor = counter;
					break;
                }
				counter--; // Decrement counter
            }
			System.out.println("Greatest factor of " + number + " is " + greatestFactor);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        scanner.close();	// Close the scanner
    }
}
