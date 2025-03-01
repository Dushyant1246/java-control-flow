// MultiplicationTable class to find the multiplication table of a number from 6 to 9
import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        
        // Loop through numbers from 6 to 9 and print multiplication table
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        
        scan.close(); // Close the scanner object
    }
}
