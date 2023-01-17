package Lab1;

import java.util.Scanner;

public class StringMethods
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your home town:");
        String town = input.nextLine();

        System.out.println("Enter your home state:");
        String state = input.nextLine();

        System.out.println("Enter your home city:");
        String city = input.nextLine();

        Boolean isEqual = town.equals(city);
        Boolean isEquivalent = town.equalsIgnoreCase(city);

        System.out.println(isEqual);
        System.out.println(isEquivalent);


        String hometown = town.concat(", " + state);
        String upper = hometown.toUpperCase();
        String lower = hometown.toLowerCase();
        char letter = hometown.charAt(0);
        int size = hometown.length();
        Boolean isEmpty = hometown.isEmpty();

        System.out.printf("\nHometown: %s\n", hometown);
        System.out.printf("Upper: %s\n", upper);
        System.out.printf("Lower: %s\n", lower);
        System.out.printf("Letter: %c\n", letter);
        System.out.printf("Size: %d\n", size);
        System.out.printf("Is empty? : %b\n", isEmpty);
    }
}
