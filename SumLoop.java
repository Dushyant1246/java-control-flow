// SumLoop class to find the sum of numbers until the user enters 0
import java.util.Scanner;

class SumLoop {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Initialize total sum variable
        double total = 0.0;
        
        // Loop to sum numbers until 0 is entered
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            double number = scan.nextDouble();
            
            if (number == 0) {
                break; // Exit the loop if 0 is entered
            }
            
            total += number; // Add the entered number to the total
        }
        
        // Print the total sum
        System.out.println("Total sum: " + total);
        
        scan.close(); // Close the scanner object
    }
}
