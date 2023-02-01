/** *************************************************************************
 *                     Activity 10 — File Reading and Writing
 *
 *  Name: Sean REYBOZ
 *  Date: 02/01/23
 *  Last modified: 02/01/23
 *
 *  Summary:
 *  This class creates a plaintext file called "newFile.txt" at the root of
 *  the project, prompts the user for information about his courses, and
 *  writes it to the new file.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class FileWrite
{
    public static void main(String[] args) {
        File outputFile = new File("newFile.txt");

        String course, credits, score;


        try {
            PrintWriter output = new PrintWriter(outputFile);

            // Write the header of the file
            output.printf("%s %s %s\n", "Course", "Credits", "Score");

            for (int i = 0; i < 3; i++) {
                course = JOptionPane.showInputDialog("Enter your course name");
                credits = JOptionPane.showInputDialog("Enter the credits of this course");
                score = JOptionPane.showInputDialog("Enter your score for this course");

                output.printf("%s %s %s\n", course, credits, score);
            }

            output.close();

        } catch (FileNotFoundException e) {
            System.err.println("Err: File not found");
            e.printStackTrace();
        }
    }
}
