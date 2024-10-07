package tn.esprit.tpfoyeriheb.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "Reservation")
public class Reservation {

    @Id
    @Column(name = "Idreservation")
    String idReservation;
    @Column(name = "anneuniversitaire")
    LocalDate anneuniversitaire;
    @Column(name = "estValdie")

    boolean estValdie;

    @ManyToMany(mappedBy = "etRes")
    private Set<Etudiant> etudiants;
    @ManyToOne
    @JoinColumn(name = "chambre_id") // This should match the foreign key in the database
    private Chambre chambre; // This property must exist




}
