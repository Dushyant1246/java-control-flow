// FizzBuzz class to print the number, 'Fizz' for multiple of 3, 'Buzz' for multiple of 5 and 'FizzBuzz' for multiple of both 3 and 5
import java.util.Scanner;

class FizzBuzz{
	public static void main(String[] args){
		// Create Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter a number
        System.out.print("Enter a positive number: ");
        int number = scan.nextInt();
        
        // Check if it's a natural number
        if (number > 0) {
            // Loop through numbers from 1 to the entered number
            for (int i = 1; i <= number; i++) {
				
				if (i % 3 == 0 && i % 5 == 0){	// Check if the number is multiple of both 3 and 5
					System.out.println("FizzBuzz");
				} else if (i % 3 == 0) {	// Check if the number is multiple of 3
                    System.out.println("Fizz");
                } else if(i % 5 == 0) {	//Check if the number is multiple of 5
                    System.out.println("Buzz");
                } else{
					System.out.println(i);
				}
            }
        } else {
            System.out.println("Please enter a positive number.");
        }
        
        scan.close(); // Close the scanner object
	}
}