public class User {
    private int id;
    private int age;
    private String firstName;
    private String lastName;
    private String email;

    public User() {

    }

    public User(int id, int age, String firstName, String lastName, String email) {
        this.setId(id);
        this.setAge(age);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
