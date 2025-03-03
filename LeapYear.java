// class LeapYear to check if a year is a Leap Year using single if statement
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Check if the year is above 1582
        if (year >= 1582) {
            // Check if the year is a leap year
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year must be greater than or equal to 1582.");
        }
        
        scanner.close();  // Close the scanner
    }
}
