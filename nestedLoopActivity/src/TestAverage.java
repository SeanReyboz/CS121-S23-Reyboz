/** *************************************************************************
 *                      Activity 8 - Nested For-Loops Activity
 *
 *  Name: Sean REYBOZ
 *  Date: 01/30/23
 *  Last modified: 01/30/23
 *
 *  Summary:
 *  This class prompts the user for the number of students and the number of
 *  test per student, before prompting for the grade received by each student
 *  on each test to then display the average grade.
 */

import java.util.Scanner;

public class TestAverage
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int studentsCount, studentsTestsCount;

        System.out.println("Enter the number of students:");
        studentsCount = Integer.parseInt(input.nextLine());

        System.out.println("Enter the number of test(s) per student:");
        studentsTestsCount = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= studentsCount; i++) {
            System.out.printf("Student number %d\n", i);
            System.out.println("------------------");

            double gradeAvg = 0.0;

            for (int j = 1; j <= studentsTestsCount; j++) {
                System.out.printf("Enter score %d: ", j);
                gradeAvg += Double.parseDouble(input.nextLine());
            }

            gradeAvg /= studentsCount;

            System.out.printf("The average for student %d is %.2f\n\n", i, gradeAvg);
        }
    }
}
