/** *************************************************************************
 *                     Activity 10 — File Reading and Writing
 *
 *  Name: Sean REYBOZ
 *  Date: 02/01/23
 *  Last modified: 02/01/23
 *
 *  Summary:
 *  This class opens the existing plaintext file "file.txt" in append mode,
 *  prompts the user for new course information and appends it to the file
 *  in the desired format.
 */

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class FileAppend
{
    public static void main(String[] args) throws IOException {
        String course, credits, score;

        try {
            // Open "file.txt" in append mode
            FileWriter outputFile = new FileWriter("file.txt", true);
            PrintWriter output = new PrintWriter(outputFile);

            course = JOptionPane.showInputDialog("Enter a course name");
            credits = JOptionPane.showInputDialog("Enter the credits for this course");
            score = JOptionPane.showInputDialog("Enter your score for this course");

            output.printf("%s %s %s\n", course, credits, score);

            output.close();
            outputFile.close();

        } catch (FileNotFoundException e) {
            System.err.println("Err: File not Found");
            e.printStackTrace();
        }
    }
}
