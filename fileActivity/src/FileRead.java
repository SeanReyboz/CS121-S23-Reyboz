/** *************************************************************************
 *                     Activity 10 — File Reading and Writing
 *
 *  Name: Sean REYBOZ
 *  Date: 02/01/23
 *  Last modified: 02/01/23
 *
 *  Summary:
 *  This class reads and prints out the contents of the file "file.txt"
 *  located at the root of this project.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead
{
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("file.txt");

        try {
            Scanner input = new Scanner(inputFile);

            String header = input.nextLine();
            System.out.println(header);

            while (input.hasNextLine()) {
                String course = input.next();
                int credits = Integer.parseInt(input.next());
                int score = Integer.parseInt(input.next());

                // format the output to look nicer
                System.out.printf("%-6s %3d %7d\n", course, credits, score);
            }

            input.close();

        } catch (FileNotFoundException e) {
            System.err.println("Err: File not found");
            e.printStackTrace();
        }
    }
}
