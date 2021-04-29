public class UserManager {
    public void leaveCourse(Course course, User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " has left the course:\n-" + course.getCourseName());
        System.out.println("\n");
    }

    public void leaveMultipleCourses(Course[] courses, User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " has left the following courses:");
        for (Course course : courses) {
            System.out.println("-" + course.getCourseName());
        }
        System.out.println("\n");
    }

}
