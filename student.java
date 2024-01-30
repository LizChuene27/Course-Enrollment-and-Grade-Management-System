import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int studentID;
    private List<Course> enrolledCourses;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        this.enrolledCourses = new ArrayList<>();
    }

    // Getters and setters

    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addEnrolledStudent();
        } else {
            System.out.println("Student is already enrolled in the course.");
        }
    }

    public void assignGrade(Course course, int grade) {
        if (enrolledCourses.contains(course)) {
            course.assignGrade(this, grade);
        } else {
            System.out.println("Student is not enrolled in the course.");
        }
    }
}
