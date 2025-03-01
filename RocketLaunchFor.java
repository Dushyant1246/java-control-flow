// RocketLaunchFor class to countdown from a given number to 1 using a for loop
import java.util.Scanner;

class RocketLaunchFor {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter countdown number
        System.out.print("Enter countdown number: ");
        int counter = scan.nextInt();
        
        // Countdown using a for loop
        for (int i = counter; i > 0; i--) {
            System.out.println(i); // Print the current countdown number
        }
        
        scan.close(); // Close the scanner object
    }
}
