package lab0;

/**
 * In this challenge you need to address the probability that at some point the
 * arguments to method parameters may not be valid.
 * <p>
 * For example, String arguments may be null or empty; other objects may be
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all arguments
 * are valid. The only exception is when any argument is acceptable based on
 * requirements. Fix the code below using if logic to validate method arguments
 * and throw IllegalArgumentException or a custom exception if the validation
 * fails.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {

    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;
    private static final int MAX_NAME_LENGTH = 30;
    private static final int MIN_NAME_LENGTH = 1;
    private static final int MIN_VACATION_DAYS = 0;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.daysVacation = daysVacation;
    }

    public int getDaysVacation() {
        return daysVacation;
    }

    public void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if (daysVacation < MIN_VACATION_DAYS || daysVacation > MAX_VACATION_DAYS) {
            throw new IllegalArgumentException("Sorry the entered vacation time is invalid");
        }

        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) throws IllegalArgumentException {
        if (firstName.length() < MIN_NAME_LENGTH || firstName.length() > MAX_NAME_LENGTH || firstName == null) {
            throw new IllegalArgumentException("Sorry the entered name length is invalid");

        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws IllegalArgumentException {
        if (lastName.length() < MIN_NAME_LENGTH || lastName.length() > MAX_NAME_LENGTH || lastName == null) {
            throw new IllegalArgumentException("Sorry the entered name length is invalid");

        }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        // validation depends on requirements
        this.ssn = ssn;
    }

}
