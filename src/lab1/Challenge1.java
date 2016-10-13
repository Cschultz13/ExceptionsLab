package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again. (Yes, this violates 
 * the Single Responsibility Principle, but for this lab, we'll overlook that.)
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {
    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) {
         Challenge1 app = new Challenge1();
        
        String fullName = JOptionPane.showInputDialog("Enter full name (use Format: first last):");
        

         try {
            String lastName = app.extractLastName(fullName);
            String msg = "Your last name is: " + lastName;
            JOptionPane.showMessageDialog(null, msg);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null,"Please enter a name in the correct format: First Last.");
        }
    }
    

    // write the code to extract the lastName from the fullName
    // Use exception handling to prevent a crash in the event that fullName
    // is null or empty. Throw the exception the calling method. and handle
    // it there.
    public String extractLastName(String fullName) throws IllegalArgumentException {
        if (fullName.isEmpty() || fullName == null) {
            throw new IllegalArgumentException("Please enter full name in First Last format.");
        }
        String[] name = fullName.split(" ");
        if (name.length > 2 || name.length < 2) {
            throw new IllegalArgumentException("Please enter full name in First Last format.");
        }


        return name[1];
    }

}