public class Instructor extends User {
    private String job;

    public Instructor() {

    }

    public Instructor(int id, int age, String firstName, String lastName, String email, String job) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.job = job;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
