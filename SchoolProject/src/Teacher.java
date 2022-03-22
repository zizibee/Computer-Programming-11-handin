// Class handles teacher information and how it will print
public class Teacher {

    // Fields for teacher information
    private String firstName;
    private String lastName;
    private String subject;

    // Constructor
    Teacher () {
        firstName = "";
        lastName = "";
        subject = "";
    }

    // Set fields to inputted values
    Teacher (String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Create variable to describe how instance information will be printed
    public String printTeacher() {
        String statement = "Name: " + firstName + " " + lastName + " Subject: " + subject;
        return statement;
    }
}
