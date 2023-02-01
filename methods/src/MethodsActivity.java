import java.util.Scanner;

/** *************************************************************************
 *                      Activity 11 — Methods
 *
 *  Name: Sean REYBOZ
 *  Date: 02/01/23
 *  Last modified: 02/01/23
 *
 *  Summary:
 *  This class prompts the user for a rectangle length and width to
 *  calculate the area, and then print out all the rectangle information to
 *  standard output.
 */

public class MethodsActivity
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double width, length, area;

        width = getWidth();
        length = getLength();
        area = getArea(width, length);

        displayData(width, length, area);

        scanner.close();
    }

    //// Methods
    public static double getLength() {
        double length;

        System.out.println("Enter the length of a rectangle");
        length = Double.parseDouble(scanner.nextLine());

        return length;
    }

    public static double getWidth() {
        double width;

        System.out.println("Enter the width of a rectangle");
        width = Double.parseDouble(scanner.nextLine());

        return width;
    }

    public static double getArea(double length, double width) {
        return width * length;
    }

    public static void displayData(double length, double width, double area) {
        System.out.printf("Rectangle length: %.1f\n", length);
        System.out.printf("Rectangle width: %.1f\n", width);
        System.out.printf("Rectangle area: %.1f\n", area);
    }
}
