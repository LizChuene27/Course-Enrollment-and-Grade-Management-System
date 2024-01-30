import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private int maxCapacity;
    private static int totalEnrolledStudents = 0;
    private List<Student> enrolledStudents;

    public Course(String courseCode, String courseName, int maxCapacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getters

    public static int getTotalEnrolledStudents() {
        return totalEnrolledStudents;
    }

    public void addEnrolledStudent() {
        if (enrolledStudents.size() < maxCapacity) {
            totalEnrolledStudents++;
        } else {
            System.out.println("The course has reached its maximum capacity.");
        }
    }

    public void assignGrade(Student student, int grade) {
        // Assuming a Map to store grades for each student
        // You can modify this according to your needs
        // For simplicity, using a nested Map for demonstration
        enrolledStudents.add(student);
        student.assignGrade(this, grade);
    }
}
