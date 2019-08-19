package pl.coderslab.acctions;


import pl.coderslab.zlec.Zlec;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "actions")
public class Actions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany
    @JoinColumn(name="id", nullable=false)
    private Set<Zlec> zlec;

}
