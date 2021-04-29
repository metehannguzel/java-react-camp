public class Course {
    private int id;
    private String courseName;
    private String courseDetail;
    private String instructorName;

    public Course() {

    }

    public Course(int id, String courseName, String courseDetail, Instructor instructor) {
        this.id = id;
        this.courseName = courseName;
        this.courseDetail = courseDetail;
        this.instructorName = instructor.getFirstName() + " " + instructor.getLastName();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDetail() {
        return this.courseDetail;
    }

    public void setCourseDetail(String courseDetail) {
        this.courseDetail = courseDetail;
    }

    public String getInstructorName() {
        return this.instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

}
