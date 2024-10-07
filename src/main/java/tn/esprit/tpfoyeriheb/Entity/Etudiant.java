package tn.esprit.tpfoyeriheb.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "Etudiant")

public class Etudiant implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDEtudiant")

    long IdEtudiant;
    @Column(name = "nomEt")

    String nomEt;
    @Column(name = "prenomEt")

    String prenomEt;
    @Column(name = "cin")

//git
    long cin;
    @Column(name = "ecole")

    String ecole;
    @Column(name = "Date naissance")

    LocalDate datedenaissance;

    @ManyToMany
    @JoinTable(
            name = "Etudiant_Reservation", // Nom de la table de jointure
            joinColumns = @JoinColumn(name = "etudiant_id"), // Clé étrangère vers Etudiant
            inverseJoinColumns = @JoinColumn(name = "reservation_id") // Clé étrangère vers Reservation
    )
    private Set<Reservation> etRes;


}