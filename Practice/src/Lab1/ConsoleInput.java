package Lab1;

import java.util.Scanner;

public class ConsoleInput
{
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter your first name:");
        String firstname = console.nextLine();

        System.out.println("Please enter your last name:");
        String lastname = console.nextLine();

        System.out.println("Please enter your age:");
        int age = Integer.parseInt(console.nextLine());

        System.out.printf("Full name: %s %s\nAge: %d\n", firstname, lastname, age);

        console.close();
    }
}
