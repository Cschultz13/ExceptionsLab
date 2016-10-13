package lab0;

/**
 *
 * @author Instlogin
 */
public class Startup {

    public static void main(String[] args) {
        String fullNameInCaps = "null";
        try {
            Employee emp = new Employee("Jim", "Smith", "3333333333", 28);
            fullNameInCaps
                    = emp.getFirstName().toUpperCase()
                    + " " + emp.getLastName().toUpperCase();
        } catch (IllegalArgumentException ia) {
            System.out.println(ia.getMessage());
        }
        System.out.println(fullNameInCaps);
    }
}
