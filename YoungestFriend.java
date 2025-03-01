// YoungestFriend class to find the youngest and tallest person among Amar, Akbar and Anthony
import java.util.Scanner;

class YoungestFriend{
	public static void main(String[] args){
		// Create Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter age of Amar, Akbar and Anthony
        System.out.print("Enter Amar's age: ");
        int amarAge = scan.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scan.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scan.nextInt();
		
		// Prompt user to enter height of Amar, Akbar and Anthony
        System.out.print("Enter Amar's height: ");
        int amarHeight = scan.nextInt();
        System.out.print("Enter Akbar's height: ");
        int akbarHeight = scan.nextInt();
        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = scan.nextInt();
		
		System.out.println();
		
		String youngest = "none", tallest = "none";
		int youngestAge = amarAge, tallestHeight = amarHeight;
		
		// check who is the youngest and display
		if(amarAge < akbarAge && amarAge < anthonyAge){
			youngest = "Amar";
			youngestAge = amarAge;
		}else if(akbarAge < amarAge && akbarAge < anthonyAge){
			youngest = "Akbar";
			youngestAge = akbarAge;
		}else if(anthonyAge < amarAge && anthonyAge < akbarAge){
			youngest = "Anthony";
			youngestAge = anthonyAge;
		}
		
		// check who is the tallest and display
		if(amarHeight > akbarHeight && amarHeight > anthonyHeight){
			tallest = "Amar";
			tallestHeight = amarHeight;
		}else if(akbarHeight > amarHeight && akbarHeight > anthonyHeight){
			tallest = "Akbar";
			tallestHeight = akbarHeight;
		}else if(anthonyHeight > amarHeight && anthonyHeight > akbarHeight){
			tallest = "Anthony";
			tallestHeight = anthonyHeight;
		}
		
		System.out.println("Youngest person is " + youngest + " with age " + youngestAge);
		System.out.println("Tallest person is " + tallest + " with height " + tallestHeight);
        
        scan.close(); // Close the scanner object
	}
}