package kodlamaio.hrmsdemo.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="users")
@Data
public class User {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="email_address")
    private String emailAddress;

    @Column(name="password")
    private String password;

}
