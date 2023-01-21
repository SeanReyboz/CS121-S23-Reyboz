//  ***************************************************************************
//                  Activity 1 - part 1 (name)
//
//  Name: Sean REYBOZ
//  Data Structures Date: 01/19/23
//  ***************************************************************************
//  This class prompts the user for his/her first and last name, before
//  printing out the full name in different formats.
//  ***************************************************************************


import java.util.Scanner;

public class FirstTask
{
    /********************************************************
     * FirstTask::main
     *
     * @param args Arguments of the method
     *
     * @implNote This is the first method to run when launching the program
     */
    public static void main(String[] args) {
        // Variables declaration
        String firstname, lastname, fullname;
        String nameToUpper, nameToLower, reversedName;
        Scanner input = new Scanner(System.in);

        // Variables initialization
        System.out.print("Please enter your firstname: ");
        firstname = input.nextLine();

        System.out.print("Please enter your lastname: ");
        lastname = input.nextLine();

        fullname = firstname + " " + lastname;

        nameToUpper = fullname.toUpperCase();
        nameToLower = fullname.toLowerCase();
        reversedName = FirstTask.reverse(fullname);

        // Display the result to STDOUT
        System.out.println();
        System.out.println(fullname);
        System.out.println(nameToLower);
        System.out.println(nameToUpper);
        System.out.println(reversedName);
    }

    /********************************************************
     * FirstTask::reverse
     *
     * @param str The string to reverse
     * @return A new string equal to the reversed input string
     *
     * @implNote Use this method to reverse a string
     */
    public static String reverse(String str) {
        String reversedStr = "";
        int len = str.length(); // Get the length of the string

        reversedStr.equals("");

        for (int i = len - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        return reversedStr;
    }
}
