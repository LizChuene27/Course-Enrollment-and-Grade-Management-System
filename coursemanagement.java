import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CourseManagement {
    private static Map<Student, Map<Course, Integer>> overallGrades = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void addCourse(String courseCode, String courseName, int maxCapacity) {
        Course newCourse = new Course(courseCode, courseName, maxCapacity);
        courses.add(newCourse);
        System.out.println("The course added successfully.");
    }

    public static void enrollStudent(Student student, Course course) {
        student.enrollInCourse(course);
        System.out.println("Student has been enrolled in the course successfully.");
    }

    public static void assignGrade(Student student, Course course, int grade) {
        if (overallGrades.containsKey(student)) {
            overallGrades.get(student).put(course, grade);
            System.out.println("Grade of student assigned successfully.");
        } else {
            System.out.println("Student not found in overall grades.");
        }
    }

    public static void calculateOverallGrade(Student student) {
        if (overallGrades.containsKey(student)) {
            Map<Course, Integer> grades = overallGrades.get(student);
            // Calculate overall grade logic here based on grades for each course
            int overallGrade = 0; // Placeholder for the actual calculation
            System.out.println("Overall grade for the student: " + overallGrade);
        } else {
            System.out.println("Student not found in overall grades.");
        }
    }

    public static void main(String[] args) {
        // Implement an interactive command-line interface for administrators
        // Use the above methods to perform operations based on user input

        // Example: Adding a course
        addCourse("CINF01", "Introduction to Computer Information Systems", 30);

        // Example: Enrolling a student in a course
        Student student = new Student("Katleho Maboe", 88070743435);
        Course course = courses.get(0); // Assuming there is at least one course
        enrollStudent(student, course);

        // Example: Assigning a grade
        assignGrade(student, course, 85);

        // Example: Calculating overall grade
        calculateOverallGrade(student);
    }
}