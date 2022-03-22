import java.util.ArrayList;

// Class handles school information and calls on teacher and student ArrayLists
public class School {
    // ArrayList for students and teachers
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Courses> courses = new ArrayList<Courses>();

    // Fields for school name, city and starting grade
    private String name;
    private String city;
    private int startGrade;

    // Constructor
    School () {
        name = "";
        city = "Vancouver";
        startGrade = 8;
    }

    // Set fields to variables in constructor
    School (String name, String city, int startGrade) {
        this.name = name;
        this.city = city;
        this.startGrade = startGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStartGrade() {
        return startGrade;
    }

    public void setStartGrade(int startGrade) {
        this.startGrade = startGrade;
    }

    // Method to create new instances of teachers
    public void addTeacher() {
        teachers.add(new Teacher());
    }

    // New instances of students
    public void addStudent() {
        students.add(new Student());
    }

    // Remove teachers at a specific index
    public void removeTeacher(int i) {
        teachers.remove(i);
    }

    // Remove students at specific index
    public void removeStudent(int i) {
        students.remove(i);
    }

    // Show all instances of teachers up to end of list
    public void showTeachers() {
        for (int i=0;i<teachers.size();i++) {
            System.out.println(teachers.get(i).printTeacher());
        }
    }

    // Show all instances of students
    public void showStudents() {
        for (int i=0;i<students.size();i++) {
            System.out.println(students.get(i).printStudent());
        }
    }
}
