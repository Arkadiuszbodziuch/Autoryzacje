package pl.coderslab.status;

import javax.persistence.*;

@Entity
@Table(name = "status")

public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
