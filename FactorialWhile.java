// FactorialWhile class to find the factorial of a number using a while loop
import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scan.nextInt();
        
        if (number < 0) {
            System.out.println("Please enter a positive number.");
        } else {
            // Calculate factorial using a while loop
            int factorial = 1;
            while (number > 1) {
                factorial *= number; // Multiply current value of factorial by number
                number--; // Decrement number
            }
            // Print the result
            System.out.println("Factorial: " + factorial);
        }
        
        scan.close(); // Close the scanner object
    }
}
