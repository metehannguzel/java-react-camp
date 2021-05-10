package kodlamaio.hrmsdemo.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="employers")
@Data
public class Employer {
    @Id
    @GeneratedValue
    @Column(name="employer_id")
    private int id;

    @Column(name="company_name")
    private String companyName;

    @Column(name="website")
    private String website;

    @Column(name="phone_number")
    private String phoneNumber;

}
