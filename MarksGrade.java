// class MarksGrade calculate grade and print remarks based on the grade

import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter marks for 3 subjects
        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = scanner.nextInt();
        
        // Calculate total marks and percentage
        int total = physics + chemistry + maths;
        double percentage = (total / 3.0);
        
        // Determine the grade based on the percentage
        String grade = "";
		String remarks = "";
        if (percentage >= 80) {
			grade = "A";
            remarks = "Level 4 above agency-normalized standards";
        } else if (percentage >= 70) {
			grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
			grade = "C";
            remarks = "Level 2, well below but approaching agency-normalized standards";
        } else if (percentage >= 50) {
			grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
			grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
		} else {
			grade = "R";
            remarks = "Remedial standards";
        }
        
        // Display results
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        scanner.close();  // Close the scanner
    }
}
