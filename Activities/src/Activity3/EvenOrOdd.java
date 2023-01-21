/** **************************************************************************
 *                  Activity 3 - Logical operators
 *                          Even or Odd
 *
 *  Name: Sean REYBOZ
 *  Date: 01/21/23
 *  Last modified: 01/21/23
 *
 *  Summary:
 *  This class prompts the user for a number and displays to stdout whether
 *  the number is even or odd.
 */

package Activity3;

import java.util.Scanner;

public class EvenOrOdd
{
    public static void main(String[] args) {
        // Variables declaration
        Scanner input = new Scanner(System.in);
        int num;

        // Variables initialization
        System.out.print("Please enter a number: ");
        num = input.nextInt();

        if (num % 2 == 0) {
            System.out.printf("%d is even\n", num);
        } else {
            System.out.printf("%d is odd\n", num);
        }
    }
}
