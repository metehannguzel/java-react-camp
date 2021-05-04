package Entities;

public class Gamer {
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private String nationalityId;
	
	public Gamer(String firstName, String lastName, int yearOfBirth, String natioanlityId) {
		setFirstName(firstName);
		setLastName(lastName);
		setNationalityId(natioanlityId);
		setYearOfBirth(yearOfBirth);
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

	public int getYearOfBirth() {
		return this.yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getNationalityId() {
		return this.nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
}
