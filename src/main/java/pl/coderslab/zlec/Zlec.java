package pl.coderslab.zlec;


import org.springframework.data.repository.cdi.Eager;
import pl.coderslab.acctions.Actions;
import pl.coderslab.car.Car;
import pl.coderslab.price.Price;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
//@Table(name = "order")

public class Zlec {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String numberDMS;
    private String numberFV;
    @ManyToOne
    private Car car;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "zlec_actions", joinColumns = @JoinColumn(name = "zlec_id"), inverseJoinColumns = @JoinColumn(name = "actions_id"))
    private List<Actions> actions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumberDMS() {
        return numberDMS;
    }

    public void setNumberDMS(String numberDMS) {
        this.numberDMS = numberDMS;
    }

    public String getNumberFV() {
        return numberFV;
    }

    public void setNumberFV(String numberFV) {
        this.numberFV = numberFV;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Actions> getActions() {
        return actions;
    }

    public void setActions(List<Actions> actions) {
        this.actions = actions;
    }

    @Override
    public String toString() {
        return "Zlec{" +
                "id=" + id +
                ", numberDMS='" + numberDMS + '\'' +
                ", numberFV='" + numberFV + '\'' +
                ", car=" + car +
                ", actions=" + actions +
                '}';
    }
}