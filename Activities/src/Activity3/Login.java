/** **************************************************************************
 *                  Activity 3 - Logical operators
 *                             Login
 *
 *  Name: Sean REYBOZ
 *  Date: 01/21/23
 *  Last modified: 01/21/23
 *
 *  Summary:
 *  This class prompts the user for a login and password before comparing
 *  the input to 2 constants (username & password). It then tells the user
 *  whether he/she entered the right value.
 */

package Activity3;

import javax.swing.JOptionPane;

public class Login
{
    public static void main(String[] args) {
        // Variables declaration
        final String username = "sean";
        final String password = "javascriptftw";

        String login, psswd;
        String message;

        // Variables initialization
        login = JOptionPane.showInputDialog(null, "Enter your username");
        psswd = JOptionPane.showInputDialog(null, "Enter your password");

        // check input
        if (login.equals(username) && psswd.equals(password)) {
            message = "Welcome to CS 121!";
        } else if (login.equals(username)){
            message = "Invalid password";
        } else if (psswd.equals(password)){
            message = "Invalid username";
        } else {
            message = "Invalid username and password";
        }

        // Display result
        JOptionPane.showMessageDialog(null, message);
    }
}
