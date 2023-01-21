/** **************************************************************************
 *                  Activity 3 - Logical operators
 *                             Triangles
 *
 *  Name: Sean REYBOZ
 *  Date: 01/21/23
 *  Last modified: 01/21/23
 *
 *  Summary:
 *  This class prompts the user for 3 numbers representing the length of the  3
 *  sides of a triangle, before displaying the type of triangle created.
 */

package Activity3;

import java.util.Scanner;

public class Triangles
{
    public static void main(String[] args) {
        double sideOne, sideTwo, sideThree;
        String triangleType;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the triangle's first side: ");
        sideOne = input.nextDouble();
        System.out.print("Enter the length of the triangle's second side: ");
        sideTwo = input.nextDouble();
        System.out.print("Enter the length of the triangle's third side: ");
        sideThree = input.nextDouble();

        if ((sideOne == sideTwo) && (sideOne == sideThree) && (sideTwo == sideThree)) {
            triangleType = "equilateral";
        } else if ((sideOne == sideTwo) || (sideOne == sideThree) || (sideTwo == sideThree)) {
            triangleType = "isosceles";
        } else {
            triangleType = "scalene";
        }

        System.out.printf("The created triangle is %s", triangleType);
    }
}
