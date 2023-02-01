/** *************************************************************************
 *                      File Input & Output
 *
 *  Name: Sean REYBOZ
 *  Date: 01/31/23
 *  Last modified: 01/31/23
 *
 *  Summary:
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class FileOutput
{
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("myCourses.txt");
        PrintWriter output = new PrintWriter(outputFile);

        String course, credits, score;

        output.printf("%s %s %s\n", "course", "credits", "score");

        for (int i = 0; i < 3; i++) {
            course = JOptionPane.showInputDialog("Enter a course name or ID");
            credits = JOptionPane.showInputDialog("Enter the course credits");
            score = JOptionPane.showInputDialog("Enter the course score");

            output.printf("%s %s %s\n", course, credits, score);
        }

        output.close();
    }
}
