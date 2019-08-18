package pl.coderslab.zlec;


import javax.persistence.*;


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
    private String actions;





}
