// class Multiples to find multiples of a given number which is less than 100 using for loop
import java.util.Scanner;

public class MultiplesFor {
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
            for (int i = 100; i >= 1; i--) {
                // Check if i is a factor of the number
                if (i % number == 0) {
                    System.out.println(i);
					continue;
                }
            }
        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }
        
        scanner.close();	// Close the scanner
    }
}
