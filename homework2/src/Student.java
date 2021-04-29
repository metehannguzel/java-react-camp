public class Student extends User {
    private int creditCardNumber;
    private String address;

    public Student() {

    }

    public Student(int id, int age, String firstName, String lastName, String email, int creditCardNumber, String address) {
        super(id, age, firstName, lastName, email);
        this.setCreditCardNumber(creditCardNumber);
        this.setAddress(address);
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
