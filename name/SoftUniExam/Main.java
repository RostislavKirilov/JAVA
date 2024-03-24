import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());

        int topStudentsCount = 0;
        int between4And5Count = 0;
        int between3And4Count = 0;
        int failCount = 0;

        double totalGradesSum = 0;

        for (int i = 0; i < studentsCount; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            totalGradesSum += grade;

            if (grade >= 5.00) {
                topStudentsCount++;
            } else if (grade >= 4.00) {
                between4And5Count++;
            } else if (grade >= 3.00) {
                between3And4Count++;
            } else {
                failCount++;
            }
        }

        double topStudentsPercentage = (double) topStudentsCount / studentsCount * 100;
        double between4And5Percentage = (double) between4And5Count / studentsCount * 100;
        double between3And4Percentage = (double) between3And4Count / studentsCount * 100;
        double failPercentage = (double) failCount / studentsCount * 100;
        double averageGrade = totalGradesSum / studentsCount;

        System.out.printf("Top students: %.2f%%%n", topStudentsPercentage);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", between4And5Percentage);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", between3And4Percentage);
        System.out.printf("Fail: %.2f%%%n", failPercentage);
        System.out.printf("Average: %.2f", averageGrade);
    }
}
