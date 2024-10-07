package tn.esprit.tpfoyeriheb.Entity;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Foyer")

public class Foyer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDFoyer")

    long idFoyer;
    @Column(name = "nomFoyer")

    String nomFoyer;
    @Column(name = "capacitefoyer")

    long capacitefoyer;

    @OneToOne(mappedBy = "foyer")
    private Universite universite;



}
