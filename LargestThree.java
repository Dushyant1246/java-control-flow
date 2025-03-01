import java.util.Scanner;

//LargestThree class to check which number is the largest among the 3

class LargestThree{
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
		
		// Variable to check if number is the largest
		boolean isLargest1 = number1 > number2 && number1 > number3;
		boolean isLargest2 = number2 > number1 && number2 > number3;
		boolean isLargest3 = number3 > number1 && number3 > number2;
		
		// Print the result
		System.out.println("Is the first number the largest? " + isLargest1);
		System.out.println("Is the second number the largest? " + isLargest2);
		System.out.println("Is the third number the largest? " + isLargest3);
		
		scan.close(); // close the scanner object
	}
}