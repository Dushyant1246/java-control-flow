// class PowerFor to find power of a number using for loop
import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the number and power
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();
		System.out.print("Enter a positive number for power: ");
        int power = scanner.nextInt();
        
        // Check if the number is positive and less than 100
        if (number > 0 && power > 0) {
			int result = 1;
            // Loop through numbers from 1 to the power
            for (int i = 1; i <= power; i++) {
                // multipluy the number again and again
                result *= number;
            }
			System.out.println(number + " to the power of " + power + " is " + result);
        } else {
            System.out.println("Please enter a positive numebrs");
        }
        
        scanner.close();	// Close the scanner
    }
}