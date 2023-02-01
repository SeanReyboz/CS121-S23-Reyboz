/** *************************************************************************
 *                      Project 1 - Pokemon Battle
 *
 *  Name: Sean REYBOZ
 *  Date: 01/23/23
 *  Last modified: 01/30/23
 *
 *  Summary:
 *
 */

import java.util.Random;
import java.util.Scanner;

public class PokemonBattle
{
    public static void main(String[] args) {
        // Variables declaration
        int maxRounds, currRound = 1;
        Random random = new Random();

        String player1Name, player2Name;
        int player1HP, player2HP;
        String player1Move, player2Move;
        int player1MovePwr, player2MovePwr;
        int player1attackSpd, player2attackSpd;

        int player1WinCount = 0, player2WinCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("POKEMON BATTLE");
        System.out.println("Enter odd number of rounds: ");
        maxRounds = Integer.parseInt(input.nextLine());

        while (maxRounds % 2 == 0) {
            System.out.println("The number of rounds must be an odd number.");
            System.out.println("Please enter a valid number: ");
            maxRounds = Integer.parseInt(input.nextLine());
        }

        while (currRound <= maxRounds) {
            System.out.printf("\nRound %d\n---------\n", currRound);
            System.out.println("Player 1: Select a Pokemon and enter its stats.");

            // FIXME: 27/01/2023 - Somehow Scanner.nextLine() doesn't work !
            System.out.println("Enter a name:");
            player1Name = input.nextLine();

            System.out.println("Enter HP:");
            player1HP = Integer.parseInt(input.nextLine());

            System.out.println("Enter move:");
            player1Move = input.nextLine();

            System.out.println("Enter move's power:");
            player1MovePwr = Integer.parseInt(input.nextLine());

            System.out.println("Enter attack speed:");
            player1attackSpd = Integer.parseInt(input.nextLine());

            System.out.println("Player 2: Select a Pokemon and enter its stats.");
            System.out.println("Enter a name:");
            player2Name = input.nextLine();

            System.out.println("Enter HP:");
            player2HP = Integer.parseInt(input.nextLine());

            System.out.println("Enter move:");
            player2Move = input.nextLine();

            System.out.println("Enter move's power:");
            player2MovePwr = Integer.parseInt(input.nextLine());

            System.out.println("Enter attack speed:");
            player2attackSpd = Integer.parseInt(input.nextLine());

            while (player1HP > 0 && player2HP > 0) {
                if (player1attackSpd > player2attackSpd) {
                    player2HP -= player1MovePwr;
                } else if (player2attackSpd > player1attackSpd) {
                    player1HP -= player2MovePwr;
                } else {
                    int rand =  random.nextInt(2);

                    if (rand == 1) {
                        player2HP -= player1MovePwr;
                    }
                }

                if (player1HP <= 0) {
                    System.out.printf("\nPlayer 2's %s wins this round!\n", player2Name);
                    player2WinCount++;
                } else if (player2HP <= 0) {
                    System.out.printf("\nPlayer 1's %s wins this round!\n", player1Name);
                    player1WinCount++;
                }
            }

            System.out.println("\nWINS\n-----");
            System.out.println("Player 1: " + player1WinCount);
            System.out.println("Player 2: " + player2WinCount);

            currRound++;
        }
    }
}
