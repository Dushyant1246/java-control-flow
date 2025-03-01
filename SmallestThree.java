import java.util.Scanner;

//SmallestThree class to check if the first number is the smallest among the 3

class SmallestThree{
	public static void main(String[] args){
		//Scanner object to take input
		Scanner scan = new Scanner(System.in);
		
		//Variables to take 3 inputs
		System.out.print("Enter First number: ");
		int number1 = scan.nextInt();
		System.out.print("Enter Second number: ");
		int number2 = scan.nextInt();
		System.out.print("Enter Third number: ");
		int number3 = scan.nextInt();
		
		// Variable to check if the first number is the smallest
		boolean isSmallest1 = number1 < number2 && number1 < number3;
		
		// Print the result
		System.out.println("Is the first number the smallest? " + isSmallest1);
		
		scan.close(); // close the scanner object
	}
}