public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int choice;
    do {
        System.out.println("Administrator Menu:");
        System.out.println("1. Add a new course");
        System.out.println("2. Enroll a student");
        System.out.println("3. Assign a grade");
        System.out.println("4. Calculate overall course grades");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");

        choice = scanner.nextInt();
        scanner.nextLine(); // The newline character

        switch (choice) {
            case 1:
                System.out.print("Enter course code: ");
                String courseCode = scanner.nextLine();
                System.out.print("Enter course name: ");
                String courseName = scanner.nextLine();
                System.out.print("Enter maximum capacity: ");
                int maxCapacity = scanner.nextInt();
                addCourse(courseCode, courseName, maxCapacity);
                break;
            case 2:
                System.out.print("Enter student name: ");
                String studentName = scanner.nextLine();
                System.out.print("Enter student ID: ");
                int studentID = scanner.nextInt();
                Student newStudent = new Student(studentName, studentID);
                System.out.print("Enter course code to enroll in: ");
                String enrollCourseCode = scanner.next();
                Course enrollCourse = findCourseByCode(enrollCourseCode);
                if (enrollCourse != null) {
                    enrollStudent(newStudent, enrollCourse);
                } else {
                    System.out.println("Course not found.");
                }
                break;
            case 3:
                System.out.print("Enter student ID: ");
                int assignGradeStudentID = scanner.nextInt();
                Student assignGradeStudent = findStudentByID(assignGradeStudentID);
                if (assignGradeStudent != null) {
                    System.out.print("Enter course code: ");
                    String assignGradeCourseCode = scanner.next();
                    Course assignGradeCourse = findCourseByCode(assignGradeCourseCode);
                    if (assignGradeCourse != null) {
                        System.out.print("Enter grade: ");
                        int grade = scanner.nextInt();
                        assignGrade(assignGradeStudent, assignGradeCourse, grade);
                    } else {
                        System.out.println("Course not found.");
                    }
                } else {
                    System.out.println("Student not found.");
                }
                break;
            case 4:
                System.out.print("Enter student ID: ");
                int calculateGradeStudentID = scanner.nextInt();
                Student calculateGradeStudent = findStudentByID(calculateGradeStudentID);
                if (calculateGradeStudent != null) {
                    calculateOverallGrade(calculateGradeStudent);
                } else {
                    System.out.println("Student not found.");
                }
                break;
            case 0:
                System.out.println("Exiting the system. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    } while (choice != 0);

    // Close the scanner when done
    scanner.close();
}

private static Course findCourseByCode(String courseCode) {
    for (Course course : courses) {
        if (course.getCourseCode().equals(courseCode)) {
            return course;
        }
    }
    return null;
}

private static Student findStudentByID(int studentID) {
    for (Map.Entry<Student, Map<Course, Integer>> entry : overallGrades.entrySet()) {
        if (entry.getKey().getStudentID() == studentID) {
            return entry.getKey();
        }
    }
    return null;
}
