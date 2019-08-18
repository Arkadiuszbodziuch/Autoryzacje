package pl.coderslab.acctions;


import javax.persistence.*;

@Entity
@Table(name = "actions")
public class Actions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
