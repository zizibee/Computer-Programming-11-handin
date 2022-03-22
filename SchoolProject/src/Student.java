// Class handles student information and how it will print
public class Student {

    // Fields for student information
    private String firstName;
    private String lastName;
    private int grade;
    // Unchanging student number
    static int studentNum = 1;
    private int idNum;

    // Constructor
    Student () {
        firstName = "";
        lastName = "";
        grade = 0;
        // Set ID number to student number
        idNum = studentNum;
        // Increase to next number for each student created
        studentNum++;
    }

    // Set fields to inputted values
    Student (String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.idNum = studentNum;
        studentNum++;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    // Describe how instance information will be printed and return String
    public String printStudent() {
        String statement = "Name: " + firstName + " " + lastName + " Grade: " + grade;
        return statement;
    }
}

