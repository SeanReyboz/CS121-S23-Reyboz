/** *************************************************************************
 *                      File Input & Output
 *
 *  Name: Sean REYBOZ
 *  Date: 01/31/23
 *  Last modified: 02/01/23
 *
 *  Summary:
 *
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
            FileWriter fileWriter = new FileWriter("mycourses.txt", true);
            PrintWriter output = new PrintWriter(fileWriter);

            course = JOptionPane.showInputDialog("Enter a course name or ID");
            credits = JOptionPane.showInputDialog("Enter the course credits");
            score = JOptionPane.showInputDialog("Enter the course score");

            output.printf("%s %s %s\n", course, credits, score);

            fileWriter.close();
            output.close();
        } catch (FileNotFoundException e) {
            System.err.println("Err: file not found");
            e.printStackTrace();
        }
    }
}
