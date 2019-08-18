package pl.coderslab.cfm;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.validator.constraints.NotBlank;
import pl.coderslab.user.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "cfm")
public class Cfm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String street;
    private String city;
    private String postcode;
    private Long nip;
    @ColumnDefault("1")
    private int enabled;

    @ManyToOne
    private User user;


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getPostcode() { return postcode; }
    public void setPostcode(String postcode) { this.postcode = postcode; }
    public Long getNip() { return nip; }
    public void setNip(Long nip) { this.nip = nip; }
    public int getEnabled() { return enabled; }
    public void setEnabled(int enabled) { this.enabled = enabled; }



    public User getUser() { return user; }

    public void setUser (User user){ this.user = user; }

}
