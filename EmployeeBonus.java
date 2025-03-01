// EmployeeBonus class to find the bonus of employees based on their years of service
import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scan = new Scanner(System.in);
        
        // Prompt user to enter salary and years of service
        System.out.print("Enter salary: ");
        double salary = scan.nextDouble();
        
        System.out.print("Enter years of service: ");
        int years = scan.nextInt();
        
        // Calculate and print bonus if years of service is greater than 5
        if (years > 5) {
            double bonus = salary * 0.05; // 5% bonus
            System.out.println("Bonus: " + bonus);
        } else {
            System.out.println("No bonus.");
        }
        
        scan.close(); // Close the scanner object
    }
}
