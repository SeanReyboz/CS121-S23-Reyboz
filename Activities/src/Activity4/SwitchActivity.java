/** *************************************************************************
 *                      Activity 4 - Switch Statement
 *
 *  Name: Sean REYBOZ
 *  Date: 01/22/23
 *  Last modified: 01/22/23
 *
 *  Summary:
 *  This class prompts the user to select one programming language to get
 *  details about it.
 */

package Activity4;

import javax.swing.JOptionPane;

public class SwitchActivity
{
    public static void main(String[] args) {
        String question = "Select a programming language";
        Object[] languages = {"JavaScript", "PHP", "Rust", "Go"};

        Object selection = JOptionPane.showInputDialog(null, question, "Quiz", JOptionPane.QUESTION_MESSAGE, null, languages, "JavaScript");

        switch (selection.toString()) {
            case "JavaScript":
                JOptionPane.showMessageDialog(null, "JavaScript, often abbreviated as JS, is a high level \nsingle-threaded garbage collected interpreted prototype-based \ndynamic programming language with a non-blocking event loop.\n\nIt was created in just one week by Brendan Eich, with \nthe goal to adding an easy to learn scripting language \nto the NetScape browser.\n\nIt is one of the only language natively supported in \nweb browsers.", selection.toString(), JOptionPane.INFORMATION_MESSAGE, null);
                break;

            case "PHP":
                JOptionPane.showMessageDialog(null, "PHP (PHP Hypertext Preprocessing) is a dynamic scripting \nlanguage for building interactive websites on a server.\n\nIt was created in 1994 by Rasmus Lerdorf to build his \nPersonal Home Page (PHP).\n\nPHP is still one of the most popular languages for backend \ndevelopment.", selection.toString(), JOptionPane.INFORMATION_MESSAGE, null);
                break;

            case "Rust":
                JOptionPane.showMessageDialog(null, "Rust is a memory safe compiled programming language that \ndelivers high level simplicity with low level performance.\n\nIt was created in 2007 by Graydon Hoare as a side project\nand has been ranked the most loved programming language \never since 2016.", selection.toString(), JOptionPane.INFORMATION_MESSAGE, null);
                break;

            case "Go":
                JOptionPane.showMessageDialog(null, "Go is a statically typed compiled programming language that \nis often described as C for the 21st century.\n\nIt was created at Google in 2007 by Ken Thompson, one of the \ninventors of the B and C languages.\n\nIt was designed for simplicity and efficiency.", selection.toString(), JOptionPane.INFORMATION_MESSAGE, null);
                break;

            default:
                System.out.println("Invalid language");
                System.exit(1);
        }
    }
}
