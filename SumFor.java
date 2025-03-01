// SumFor class to find the sum of n natural numbers using a for loop
import java.util.Scanner;

class SumFor {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        
        // Check if it's a natural number
        if (n > 0) {
            // Using the formula n*(n+1)/2
            int formulaSum = (n * (n + 1)) / 2;
            
            // Using for loop to calculate sum
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i; // Add the current number to loopSum
            }
            
            // Compare both results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);
        } else {
            System.out.println("The number is not a natural number.");
        }
        
        scan.close(); // Close the scanner object
    }
}
