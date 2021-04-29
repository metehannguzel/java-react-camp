public class Instructor extends User {
    private String job;

    public Instructor() {

    }

    public Instructor(int id, int age, String firstName, String lastName, String email, String job) {
        super(id, age, firstName, lastName, email);
        this.setJob(job);
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
