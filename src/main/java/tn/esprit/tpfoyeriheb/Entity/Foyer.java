package tn.esprit.tpfoyeriheb.Entity;
import  jakarta.persistence.Entity ;
import jakarta.persistence.*;

@Entity
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    @Column (nullable = false)
    private String nomfoyer ;

    @Column (nullable = false)

    private Long capaciteFoyer;
    @OneToOne(mappedBy = "foyer")
    private Universite universite;



}
