public class Main {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor("Metehan", 13579, "Python");
        Instructor instructor2 = new Instructor("Ali", 24680, "Java");

        Instructor[] instructors = {instructor1, instructor2};

        for(Instructor instructor : instructors) {
            System.out.println("Instructor Name: " + instructor.name + "\nProfession: " + instructor.profession + "\n");
        }

        System.out.println("--------------------------------------------------\n");

        Course course1 = new Course("Artifical Intelligence with Python", 8,
                "Learn How to Progress in Artificial Intelligence with Python\nInstructor: Metehan", 75);

        Course course2 = new Course("Java Programming for Complete Beginners", 10,
                "Learn How to Code in Java from Scratch\nInstructor: Ali", 100);

        Course[] courses = {course1, course2};

        for(Course course : courses) {
            System.out.println("Course Name: " + course.name + "\nDetail: " + course.detail +
                    "\nCourse Duration: " + course.courseDuration + " Weeks" + "\nPrice: ₺" + course.price + "\n");
        }

        System.out.println("--------------------------------------------------\n");

        CourseManager courseManager = new CourseManager();
        courseManager.addToCart(course1);
        System.out.println("");
        courseManager.removeFromCart(course2);

    }

}
