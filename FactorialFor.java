// FactorialFor class to find the factorial of a number using a for loop
import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scan.nextInt();
        
        if (number < 0) {
            System.out.println("Please enter a positive number.");
        } else {
            // Calculate factorial using a for loop
            int factorial = 1;
            for (int i = number; i > 1; i--) {
                factorial *= i; // Multiply current value of factorial by i
            }
            // Print the result
            System.out.println("Factorial: " + factorial);
        }
        
        scan.close(); // Close the scanner object
    }
}
