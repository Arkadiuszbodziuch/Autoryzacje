package pl.coderslab.car;


import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vin;
    private String brand;
    private String model;
    private Long course;
    private String registrationNumber;
    private Long nip;


    @ColumnDefault("1")
    private int enabled;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getCourse() {
        return course;
    }

    public void setCourse(Long course) {
        this.course = course;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Long getNip() {
        return nip;
    }

    public void setNip(Long nip) {
        this.nip = nip;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", vin='" + vin + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", course=" + course +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", nip=" + nip +
                ", enabled=" + enabled +
                '}';
    }
}
