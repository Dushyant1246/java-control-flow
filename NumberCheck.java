// NumberCheck class to check whether a number is positive, negative, or zero
import java.util.Scanner;

class NumberCheck {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        
        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        
        scan.close(); // Close the scanner object
    }
}
