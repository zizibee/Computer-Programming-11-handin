import java.util.ArrayList;

// Main class to run program
public class Main {
    public static void main(String[] args) {

        // New instance of School
        ArrayList<School> school = new ArrayList<>();
        School school1 = new School();

        // Add 10 students to school1
        for(int i=0;i<10;i++) {
            school1.addStudent();
        }

        // Add 3 teachers to school1
        for(int i=0;i<3;i++) {
            school1.addTeacher();
        }

        // Show all students and teachers in school1
        school1.showStudents();
        school1.showTeachers();

        // Modify student and teacher lists
        school1.removeStudent(0);
        school1.removeStudent(0);
        school1.removeTeacher(0);

        // Show students and teachers
        school1.showStudents();
        school1.showTeachers();
    }
}
