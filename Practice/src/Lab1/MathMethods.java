package Lab1;

import java.util.Scanner;

public class MathMethods
{
    public static void main(String[] args) {
        int x, y;
        double z;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer:");
        x = input.nextInt();

        System.out.println("Please enter another integer:");
        y = input.nextInt();

        System.out.println("Please enter a double:");
        z = input.nextDouble();

        System.out.printf("Maximum of x and y is %d\n", Math.max(x, y));
        System.out.printf("Maximum of x and z is %.1f\n", Math.max(x, z));
        System.out.printf("Maximum of y and z is %.1f\n", Math.max(y, z));

    }
}
