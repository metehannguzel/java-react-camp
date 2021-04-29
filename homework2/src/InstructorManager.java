public class InstructorManager extends UserManager {
    public void addCourse(Course course, Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " has added a new course:\n-" + course.getCourseName());
        System.out.println("\n");
    }

    public void addMultipleCourse(Course[] courses, Instructor instructor) {
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " has added the following courses:");
        for (Course course : courses) {
            System.out.println("-" + course.getCourseName());
        }
        System.out.println("\n");
    }

    @Override
    public void leaveCourse(Course course, User user) {
        System.out.println("The instructor " + user.getFirstName() + " " + user.getLastName() + " has stopped giving the course:\n-" + course.getCourseName());
        System.out.println("\n");
    }

    @Override
    public void leaveMultipleCourses(Course[] courses, User user) {
        System.out.println("The instructor " + user.getFirstName() + " " + user.getLastName() + " has stopped giving the following courses:");
        for (Course course : courses) {
            System.out.println("-" + course.getCourseName());
        }
        System.out.println("\n");
    }

}
