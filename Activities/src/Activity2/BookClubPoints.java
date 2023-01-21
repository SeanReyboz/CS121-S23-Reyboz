//  ***************************************************************************
//                  Activity 2 - Conditionals
//                       Book Club Points
//
//  Name: Sean REYBOZ
//  Data Structures Date: 01/19/23
//  ***************************************************************************
//  This class prompts the user for the number of books he/she bought the last
//  month and determines the number of awarded points accordingly.
//  ***************************************************************************


import java.util.Scanner;

public class BookClubPoints
{
    /**
     * BookClubPoints::main
     *
     * @param args Arguments of the method
     */
    public static void main(String[] args) {
        // Variables declaration
        int readBookCount, awardedPoints;

        Scanner input = new Scanner(System.in);

        // Variables initialization
        System.out.print("How many books have you purchased this month?: ");
        readBookCount = input.nextInt();

        // Exit program if input number is negative
        if (readBookCount < 0) {
            System.out.println("Wrong number");
            System.exit(1);
        }

        if (readBookCount == 0) {
            awardedPoints = 0;
        } else if (readBookCount == 1) {
            awardedPoints = 5;
        } else if (readBookCount == 2) {
            awardedPoints = 15;
        } else if (readBookCount == 3) {
            awardedPoints = 30;
        } else {
            awardedPoints = 60;
        }

        // Display result
        System.out.printf("You have earned a total of %d point(s).\n", awardedPoints);
    }
}
