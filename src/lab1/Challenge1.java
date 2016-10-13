package lab1;

import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null, "Please enter a name in the correct format: First Last.");
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
