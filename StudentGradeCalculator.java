import java.util.*;

public class StudentGradeCalculator 
	{
    public static void main(String[] args)
		{
        Scanner sc = new Scanner(System.in);

        // Input: Number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = sc.nextInt();

        // Input: Marks obtained in each subject
        int[] subjectMarks = new int[numSubjects];
        int totalMarks = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            subjectMarks[i] = sc.nextInt();
            totalMarks += subjectMarks[i];
        }

        // Calculate Average Percentage
        double Avg_Percentage = (double) totalMarks / (numSubjects * 100) * 100;

        // Calculate Grade
        char grade;

        if (Avg_Percentage >= 90) 
			{
            grade = 'A';
            }
		else if (Avg_Percentage >= 80) 
			{
            grade = 'B';
            } 
		else if (Avg_Percentage >= 70) 
			{
            grade = 'C';
            }  
		else if (Avg_Percentage >= 60) 
			{
            grade = 'D';
            }  
		else 
			{
            grade = 'F';
             }

        // Display Results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Avg_Percentage: " + Avg_Percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
