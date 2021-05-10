package kodlamaio.hrmsdemo.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="employees")
@Data
public class Employee {
    @Id
    @GeneratedValue
    @Column(name="employee_id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="nationality_id")
    private String nationalityId;

    @Column(name="birth_year")
    private int birthYear;

}
