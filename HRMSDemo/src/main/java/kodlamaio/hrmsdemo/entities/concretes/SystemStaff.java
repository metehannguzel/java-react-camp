package kodlamaio.hrmsdemo.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="system_staff")
@Data
public class SystemStaff {
    @Id
    @GeneratedValue
    @Column(name="staff_id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;


}
