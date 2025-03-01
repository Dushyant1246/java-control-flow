// CanVote class to check if a person can vote based on their age
import java.util.Scanner;

class CanVote {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Prompt the user to enter age
        System.out.print("Enter age: ");
        int age = scan.nextInt();
        
        // Check if the person can vote (age >= 18)
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
        
        scan.close(); // Close the scanner object
    }
}
