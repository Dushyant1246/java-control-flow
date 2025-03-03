// class MultiplesWhile to find multiples of a given number which is less than 100 using while loop
import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the number
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();
        
        // Check if the number is positive and less than 100
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " are:");
            // Loop through numbers from 1 to the number
			int counter = 100;
            while (counter > 1) {
				counter--; // Decrement counter
                // Check if counter is a factor of the number
                if (counter % number == 0) {
                    System.out.println(counter);
					continue;
                }
            }
        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }
        
        scanner.close();	// Close the scanner
    }
}
