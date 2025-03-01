// OddEven class to print odd and even numbers between 1 to the number entered
import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        
        // Check if it's a natural number
        if (number > 0) {
            // Loop through numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        } else {
            System.out.println("Please enter a positive number.");
        }
        
        scan.close(); // Close the scanner object
    }
}
