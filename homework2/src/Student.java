public class Student extends User {
    int creditCardNumber;
    String address;

    public Student() {

    }

    public Student(int id, int age, String firstName, String lastName, String email, int creditCardNumber, String address) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.creditCardNumber = creditCardNumber;
        this.address = address;
    }

    public int getCreditCardNumber() {
        return this.creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
