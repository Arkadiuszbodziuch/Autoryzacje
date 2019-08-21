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
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }



    @Override
    public String toString() {
        return "Actions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", zlec=" +
                '}';
    }


}
