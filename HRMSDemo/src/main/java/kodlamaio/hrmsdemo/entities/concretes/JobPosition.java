package kodlamaio.hrmsdemo.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="job_positions")
@Data
public class JobPosition {
    @Id
    @GeneratedValue
    @Column(name="job_id")
    private int id;

    @Column(name="name")
    private String name;
}
