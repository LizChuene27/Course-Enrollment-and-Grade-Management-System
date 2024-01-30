Student Class:

The Student class has private instance variables to store student information such as name, ID, and enrolled courses.
I implemented appropriate access modifiers and provide public getter and setter methods for accessing and updating student information.
Design a method to enroll students in courses. It accepts a Course object as a parameter and add the course to the student's enrolled courses.
I implemented a method assign grades to students.System accepts Course object and a grade for the student and update the student's grade for that course. 
Course Class:

The Course class has a  private instance variables to store course information such as course code, name, and maximum capacity.
I used appropriate access modifiers and provide public getter methods for accessing course information.
I implemented a static variable to keep track of the total number of enrolled students across all instances of the Course class.
I designed a static method to retrieve the total number of enrolled students.
CourseManagement Class:

The CourseManagement class has a private static variables to store a list of courses and the overall course grades for each student.
Use of appropriate access modifiers to control access to the variables.
Implemented static methods to add new courses, enroll students, assign grades, and calculate overall course grades for each student.
The addCourse method accepts parameters for course information and create a new Course object. It  adds the course to the list of courses.
The enrollStudent method accepts a Student object and a Course object. It enrolls the student in the course by calling the appropriate method in the Student class.
The assignGrade method accepts a Student object, a Course object, and a grade. It assigns the grade to the student for that course by calling the appropriate method in the Student class.
The calculateOverallGrade method acceptst a Student object and calculate the overall course grade for that student based on the grades assigned to them.
Administrator Interface:

Developed an interactive command-line interface for administrators to interact with the Course Enrollment and Grade Management System.
Displays a menu with options to add a new course, enroll students, assign grades, and calculate overall course grades.
Prompts the administrator for necessary inputs and call the appropriate methods in the CourseManagement and Student classes to perform the requested operations.
Implemented error handling to handle cases where invalid inputs are provided or when enrolling students in courses that have reached their maximum capacity.
Documentation:

