import java.util.Scanner;

// NaturalNumber class to check if number is a natural number and print the sum of natural numbers
class NaturalNumber{
	public static void main(String[] args){
		// Scanner object to take input
		Scanner scan = new Scanner(System.in);
		
		// Variable to indicate number input
		System.out.print("Enter number: ");
		int number = scan.nextInt();
		
		// Check if the number is a natural number
		if(number > 0){	// number is natural number
		
			// Calculate the sum of natural numbers
			int sum = (number * (number + 1)) / 2;
			
			// Print the sum
			System.out.println("The sum of " + number + " natural numbers is " + sum);
			
		}else{	// number is not a natural number
			
			// Print the statement
			System.out.println("The number " + number + " is not a natural number");			
		}
		
		scan.close(); // close the scanner object
	}
}