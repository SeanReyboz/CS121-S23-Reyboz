/** *************************************************************************
 *                      File Input & Output
 *
 *  Name: Sean REYBOZ
 *  Date: 01/31/23
 *  Last modified: 01/31/23
 *
 *  Summary:
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO
{
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("courses.txt");

        try {
            Scanner input = new Scanner(inputFile);

            String header = input.nextLine();
            System.out.println(header);

            // iterate over each line of the file
            while (input.hasNextLine()) {
                String course = input.next();
                int credits = Integer.parseInt(input.next());
                int score = Integer.parseInt(input.next());

                System.out.printf("%-6s %3d %7d\n", course, credits, score);
            }

            input.close();
        } catch (FileNotFoundException e) {
            System.err.println("Err: File not found");
            e.printStackTrace();
        }
    }
}
