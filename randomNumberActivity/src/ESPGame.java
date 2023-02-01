/** ************************************************************************
 *                          Activity 9 - Random Number
 *
 *  Name: Sean REYBOZ
 *  Date: 01/30/23
 *  Last modified: 01/31/23
 *
 *  Summary:
 *  This class generates a random number between 0 and 4, each representing
 *  a color. It then prompts the user to guess the color picked by the
 *  program, before displaying the number of correct guesses
 */

import java.util.Random;
import java.util.Scanner;

public class ESPGame
{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        String[] colors = {"red", "green", "blue", "orange", "yellow"};

        String chosenColor;
        int randomNbr;

        int gameCount = 1;
        int correctGuesses = 0;

        do {
            // pick a random integer between 0 and 4, representing the color picked by the computer
            randomNbr = random.nextInt(5);

            System.out.printf("%d. What color has the computer chosen?\n", gameCount);
            chosenColor = input.nextLine().toLowerCase();

            if (chosenColor.equals(colors[randomNbr])) {
                correctGuesses++;
            }

            System.out.printf("> The computer chose %s\n", colors[randomNbr]);


            gameCount++;
        } while (gameCount <= 10);

        System.out.printf("You got %d out of 10 correct guesses\n", correctGuesses);

    }
}
