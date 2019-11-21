package project;

import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		// scanner will let the students enter number of classes
			        String grade = "";
			        String[] letters = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D", "F"};
			        // Creates strings above and the GPA values below
			        double[] grades = {4.33, 4.00, 3.67, 3.33, 3.00, 2.67, 2.33, 2.00, 1.67, 1.00, 0.00};
			        double credit1;
			        double credit2;
			        double credit3;
			        double credit4;
			        double gradeValue = 0;
			        // Creates 4 credits
			        double totPtsClass1 = 0;
			        double totPtsClass2 = 0;
			        double totPtsClass3 = 0;
			        double totPtsClass4 = 0;
			        double totPts = 0;
			        double totalCredits = 0;
			        double gpa;
			        // Points in classes, GPA
			        System.out.println("Welcome to the CU GPA Calculator!");
			        String message;

			        Scanner scan = new Scanner(System.in);
			        System.out.println("Enter your first name: ");
			        message = scan.nextLine();
			        System.out.println("Enter your last name: ");
			        message = scan.nextLine();
			        System.out.println("Enter your major: ");
			        message = scan.nextLine();

			        Scanner console = new Scanner(System.in);

			        System.out.println("Please enter the number of credit hours for your first class");
			        credit1 = console.nextDouble();
			        System.out.println("Please enter your letter grade for the first class");
			        grade = console.next();

			        if (grade.equals("A")) gradeValue = 4.00;
			        else if (grade.equals("A-")) gradeValue = 3.67;
			        else if (grade.equals("B+")) gradeValue = 3.33;
			        else if (grade.equals("B")) gradeValue = 3.00;
			        else if (grade.equals("B-")) gradeValue = 2.67;
			        else if (grade.equals("C+")) gradeValue = 2.33;
			        else if (grade.equals("C")) gradeValue = 2.00;
			        else if (grade.equals("D+")) gradeValue = 1.33;
			        else if (grade.equals("D")) gradeValue = 1.00;
			        else if (grade.equals("F")) gradeValue = 0;

			        else System.out.println("Invalid Grade");

			        totPtsClass1 = gradeValue * credit1;

			        System.out.println("Please enter the number of credit hours for your second class");
			        credit2 = console.nextDouble();
			        System.out.println("Please enter letter grade for the second class");
			        grade = console.next();

			        if (grade.equals("A")) gradeValue = 4.00;
			        else if (grade.equals("A-")) gradeValue = 3.67;
			        else if (grade.equals("B+")) gradeValue = 3.33;
			        else if (grade.equals("B")) gradeValue = 3.00;
			        else if (grade.equals("B-")) gradeValue = 2.67;
			        else if (grade.equals("C+")) gradeValue = 2.33;
			        else if (grade.equals("C")) gradeValue = 2.00;
			        else if (grade.equals("D+")) gradeValue = 1.33;
			        else if (grade.equals("D")) gradeValue = 1.00;
			        else if (grade.equals("F")) gradeValue = 0;

			        else System.out.println("Invalid Grade");

			        totPtsClass2 = gradeValue * credit2;

			        System.out.println("Please enter the number of credit hours for your third class");
			        credit3 = console.nextDouble();
			        System.out.println("Please enter letter grade for your third class");
			        grade = console.next();

			        if (grade.equals("A")) gradeValue = 4.00;
			        else if (grade.equals("A-")) gradeValue = 3.67;
			        else if (grade.equals("B+")) gradeValue = 3.33;
			        else if (grade.equals("B")) gradeValue = 3.00;
			        else if (grade.equals("B-")) gradeValue = 2.67;
			        else if (grade.equals("C+")) gradeValue = 2.33;
			        else if (grade.equals("C")) gradeValue = 2.00;
			        else if (grade.equals("D+")) gradeValue = 1.33;
			        else if (grade.equals("D")) gradeValue = 1.00;
			        else if (grade.equals("F")) gradeValue = 0;

			        else System.out.println("Invalid Grade");

			        totPtsClass3 = gradeValue * credit3;

			        System.out.println("\"Please enter the number of credit hours for your fourth class");
			        credit4 = console.nextDouble();
			        System.out.println("Please enter letter grade for the fourth class");
			        grade = console.next();

			        if (grade.equals("A")) gradeValue = 4.00;
			        else if (grade.equals("A-")) gradeValue = 3.67;
			        else if (grade.equals("B+")) gradeValue = 3.33;
			        else if (grade.equals("B")) gradeValue = 3.00;
			        else if (grade.equals("B-")) gradeValue = 2.67;
			        else if (grade.equals("C+")) gradeValue = 2.33;
			        else if (grade.equals("C")) gradeValue = 2.00;
			        else if (grade.equals("D+")) gradeValue = 1.33;
			        else if (grade.equals("D")) gradeValue = 1.00;
			        else if (grade.equals("F")) gradeValue = 0;
			  
			        else System.out.println("Inval0id Grade");
			        totPtsClass4 = gradeValue * credit4;

			        totPts = totPtsClass1 + totPtsClass2 + totPtsClass3 + totPtsClass4;
			        totalCredits = credit1 + credit2 + credit3 + credit4;
			        gpa = totPts / totalCredits;

			        System.out.printf("Your GPA is: %.2f\n", +gpa);
			        
			        
	}

}
