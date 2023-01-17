package Lab1;

import javax.swing.JOptionPane;

public class IntegerDivision
{
    public static void main(String[] args) {
        System.out.println("Week Two");
        System.out.println("------------------\n");

        IntegerDivision.integerDivision();
    }

    public static void integerDivision() {
        int a = 18;
        int b = 5;

        int res = a / b;
        System.out.printf("1. Dividing int by int: %d\n", res);

        double dblRes;
        dblRes = a / b;
        System.out.printf("2. Assigning the quotient to a double: %.3f\n", dblRes);

        dblRes = (double) a / b;
        System.out.printf("3. Dividing double by int: %.3f\n", dblRes);

        dblRes = a / (double) b;
        System.out.printf("3. Dividing int by double: %.3f\n", dblRes);

        dblRes = (double) a / (double) b;
        System.out.printf("3. Dividing double by double: %.3f\n", dblRes);

        JOptionPane.showMessageDialog(null, "Hello there!");
    }
}
