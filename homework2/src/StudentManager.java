public class StudentManager extends UserManager {
    public void registerCourse(Course course, Student student) {
        System.out.println(student.getFirstName() + " " + student.getLastName() + " has registered the course:\n-" + course.getCourseName());
        System.out.println("\n");
    }

    public void registerMultipleCourse(Course[] courses, Student student) {
        System.out.println(student.getFirstName() + " " + student.getLastName() + " has registered the following courses:");
        for (Course course : courses) {
            System.out.println("-" + course.getCourseName());
        }
        System.out.println("\n");
    }

    @Override
    public void leaveCourse(Course course, User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " has stopped taking the course:\n-" + course.getCourseName());
        System.out.println("\n");
    }

    @Override
    public void leaveMultipleCourses(Course[] courses, User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " has stopped taking the following courses:");
        for (Course course : courses) {
            System.out.println("-" + course.getCourseName());
        }
        System.out.println("\n");
    }

}
