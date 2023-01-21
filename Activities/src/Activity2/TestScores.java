//  ***************************************************************************
//                  Activity 2 - Conditionals
//                        Test Scores
//
//  Name: Sean REYBOZ
//  Data Structures Date: 01/19/23
//  ***************************************************************************
//  This class prompts the user for 3 test scores before calculating the
//  average grade and the corresponding letter grade.
//  ***************************************************************************

import java.util.Scanner;

public class TestScores
{
    public static void main(String[] args) {
        // Variables declaration
        int scoreOne, scoreTwo, scoreThree;
        double averageScore;
        char letterGrade;

        Scanner input = new Scanner(System.in);

        // Variables initialization
        System.out.print("Please enter the first test score: ");
        scoreOne = input.nextInt();
        System.out.print("Please enter the second test score: ");
        scoreTwo = input.nextInt();
        System.out.print("Please enter the third test score: ");
        scoreThree = input.nextInt();

        averageScore = (double)(scoreOne + scoreTwo + scoreThree) / 3;

        if (averageScore >= 90) {
            letterGrade = 'A';
        } else if (averageScore >= 80) {
            letterGrade = 'B';
        } else if (averageScore >= 70) {
            letterGrade = 'C';
        } else if (averageScore >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        // Display result
        System.out.printf("Average: %.2f\nLetter grade: %c\n", averageScore, letterGrade);
    }
}
