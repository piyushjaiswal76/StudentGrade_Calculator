
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");
        System.out.print("Enter the student's name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter the marks for Math: ");
        int mathMarks = scanner.nextInt();

        System.out.print("Enter the marks for Science: ");
        int scienceMarks = scanner.nextInt();

        System.out.print("Enter the marks for English: ");
        int englishMarks = scanner.nextInt();

        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double averagePercentage = (double) totalMarks / 3;

        System.out.println("\nResults for " + studentName + ":");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + calculateGrade(averagePercentage));

        scanner.close();
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
