/** ************************************************************************
 *                      Activity 7 - Guessing Game
 *
 *  Name: Sean REYBOZ
 *  Date: 01/30/23
 *  Last modified: 01/30/23
 *
 *  Summary:
 *  This class prompts the user to guess a number between 1 and 100 until
 *  it's correct, or the player decides to exit the game.
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        String guess;
        int randomNbr, guessedNbr, guessesCount;

        guessesCount = 0;
        randomNbr = random.nextInt(1, 101);

        System.out.println("Guess a number between 1 and 100, or enter \"q\" to give up");

        do {
            guess = input.nextLine();

            if (guess.equals("q")) {
                System.out.printf("Quitter! The number was %d\n", randomNbr);
                break;
            } else {
                guessedNbr = Integer.parseInt(guess);
                guessesCount++;
            }

            if (guessedNbr > randomNbr) {
                System.out.println("Too high, guess again:");
                continue;
            } else if (guessedNbr < randomNbr) {
                System.out.println("Too low, try again:");
                continue;
            } else {
                System.out.println("Correct!");
                System.out.printf("Number of guesses: %d\n", guessesCount);
                break;
            }
        } while (guessedNbr != randomNbr);

    }
}
