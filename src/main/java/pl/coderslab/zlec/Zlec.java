package pl.coderslab.zlec;


import javax.persistence.*;


@Entity
public class Zlec {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numberDMS;
    private String numberFV;


    private Long nip;




}
