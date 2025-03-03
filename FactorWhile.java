// class FactorWhile to find factors of a given number using while loop
import java.util.Scanner;

public class FactorWhile {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the number
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is positive
        if (number > 0) {
            System.out.println("Factors of " + number + " are:");
            // Loop through numbers from counter 1 to the number
			int counter = 1;
            while (counter < number) {
                // Check if counter is a factor of the number
                if (number % counter == 0) {
                    System.out.println(counter);
                }
				counter++; //Increment counter
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        scanner.close();	// Close the scanner
    }
}
