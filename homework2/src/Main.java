public class Main {
    public static void main(String[] args) {

        Instructor instructor = new Instructor(1, 35, "Engin", "Demirog", "engin.demirog.instructor@gmail.com", "Instructor");
        Student student = new Student(2, 21, "Metehan", "Guzel", "metehan.guzel.student@gmail.com", 1234567890, "Ankara");

        Course course1 = new Course(1, "Java + React", "Learn How to Code in Java", instructor);
        Course course2 = new Course(2, "Python", "Learn How to Code in Python", instructor);
        Course course3 = new Course(3, "C#", "Learn How to Code in C#", instructor);
        Course course4 = new Course(4, "C++", "Learn How to Code in C++", instructor);
        Course course5 = new Course(5, "Go", "Learn How to Code in Go", instructor);

        Course[] courses = {course1, course2, course3, course4, course5};


        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addCourse(course1, instructor);
        instructorManager.addMultipleCourse(courses, instructor);
        instructorManager.leaveCourse(course3, instructor);
        instructorManager.leaveMultipleCourses(courses, instructor);

        StudentManager studentManager = new StudentManager();
        studentManager.registerCourse(course4, student);
        studentManager.registerMultipleCourse(courses, student);
        studentManager.leaveCourse(course5, student);
        studentManager.leaveMultipleCourses(courses, student);

    }
}
