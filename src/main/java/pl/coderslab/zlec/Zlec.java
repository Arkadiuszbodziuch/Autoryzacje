package pl.coderslab.zlec;


import pl.coderslab.acctions.Actions;

import javax.persistence.*;
import java.util.Set;


@Entity
//@Table(name = "order")

public class Zlec {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String numberDMS;
    private String numberFV;

    private Long nip_CFM;
    private Long nip_Serwis;
    private String registrationNumber;
    private String Vin;
    private String brand;
    private String course;
    private String numberAut;


    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "zlec_actions", joinColumns = @JoinColumn(name = "zlec_id"), inverseJoinColumns = @JoinColumn(name = "actions_id"))
    private Set<Actions> actions;


    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNumberDMS() { return numberDMS; }

    public void setNumberDMS(String numberDMS) { this.numberDMS = numberDMS; }

    public String getNumberFV() { return numberFV; }

    public void setNumberFV(String numberFV) { this.numberFV = numberFV; }

    public Long getNip_CFM() { return nip_CFM; }

    public void setNip_CFM(Long nip_CFM) { this.nip_CFM = nip_CFM; }

    public Long getNip_Serwis() { return nip_Serwis; }

    public void setNip_Serwis(Long nip_Serwis) { this.nip_Serwis = nip_Serwis; }

    public String getRegistrationNumber() { return registrationNumber; }

    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }

    public String getVin() { return Vin; }

    public void setVin(String vin) { Vin = vin; }

    public String getBrand() { return brand; }

    public void setBrand(String brand) { this.brand = brand; }

    public String getCourse() { return course; }

    public void setCourse(String course) { this.course = course; }

    public String getNumberAut() { return numberAut; }

    public void setNumberAut(String numberAut) { this.numberAut = numberAut; }

    public Set<Actions> getActions() { return actions; }

    public void setActions(Set<Actions> actions) { this.actions = actions; }
}
