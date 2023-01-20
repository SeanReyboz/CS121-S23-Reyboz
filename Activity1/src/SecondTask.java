//  ***************************************************************************
//                  Activity 1 - part 2 (calculation)
//
//  Name: Sean REYBOZ
//  Data Structures Date: 01/19/23
//  ***************************************************************************
//  This class has only one method that prompts the user for 2 integers and
//  then displays the results of different calculations between/on these
//  numbers.
//  ***************************************************************************

import javax.swing.JOptionPane;

public class SecondTask
{
    /******************************************************
     * FirstTask::main
     *
     * @param args Arguments of the method
     *
     * @implNote This is the first method to run when launching the program
     */
    public static void main(String[] args) {
        // Variables declaration
        int addition, subtraction, multiplication;
        double division, power, squareRoot1, squareRoot2, logarithm1, logarithm2;

        // Variables instantiation
        int int1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer"));
        int int2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter another integer"));

        addition = int1 + int2;
        subtraction = int1 - int2;
        multiplication = int1 * int2;
        division = (double) int1 / int2;
        power = Math.pow(int1, int2);
        squareRoot1 = Math.sqrt(int1);
        squareRoot2 = Math.sqrt(int2);
        logarithm1 = Math.log(int1);
        logarithm2 = Math.log(int2);

        // Display calculation results to STDOUT
        System.out.printf("Number One: %d —— Number Two: %d\n\n", int1, int2);
        System.out.printf("%d + %d = %d \n", int1, int2, addition);
        System.out.printf("%d - %d = %d \n", int1, int2, subtraction);
        System.out.printf("%d * %d = %d \n", int1, int2, multiplication);
        System.out.printf("%d / %d = %.2f \n", int1, int2, division);
        System.out.printf("%d ^ %d = %.2f \n", int1, int2, power);
        System.out.printf("log(%d) = %.2f \n", int1, logarithm1);
        System.out.printf("log(%d) = %.2f \n", int2, logarithm2);
        System.out.printf("sqrt(%d) = %.2f \n", int1, squareRoot1);
        System.out.printf("sqrt(%d) = %.2f \n", int2, squareRoot2);
    }
}
