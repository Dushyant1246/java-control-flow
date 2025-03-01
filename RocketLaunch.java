// RocketLaunch class to countdown from a given number to 1 using a while loop
import java.util.Scanner;

class RocketLaunch {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter countdown number
        System.out.print("Enter countdown number: ");
        int counter = scan.nextInt();
        
        // Countdown using a while loop
        while (counter > 0) {
            System.out.println(counter); // Print the current countdown number
            counter--; // Decrement the counter
        }
        
        scan.close(); // Close the scanner object
    }
}
