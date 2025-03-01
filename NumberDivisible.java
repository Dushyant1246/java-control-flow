import java.util.Scanner;

// NumberDivisible class to check if number is divisible by 5
class NumberDivisible{
	public static void main(String[] args){
		// Scanner object to take input
		Scanner scan = new Scanner(System.in);
		
		// Variable to indicate number input
		System.out.print("Enter number: ");
		int number = scan.nextInt();
		
		
		// Variable to show if the input number is divisible by 5
		boolean check = (number % 5 == 0);
		
		//Print the output
		System.out.println("Is the number " + number + " divisible by 5? " + check);
		
		scan.close(); // close the scanner object
	}
}