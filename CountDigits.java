// class CountDigits to count the number of digits in a given integer

import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Loop to count the digits
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        
        // Display the count
        System.out.println("The number has " + count + " digits.");
        
        scanner.close();  // Close the scanner
    }
}
