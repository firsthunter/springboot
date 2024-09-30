package tn.esprit.tpfoyeriheb.Entity;

import jakarta.persistence.*;
import tn.esprit.tpfoyeriheb.Enum.TypeChamber;

@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idChambre;
    @Column(name = "numeroChambra",unique = true)
    long numeroChambre;
    String nomChambre;
    @Enumerated(EnumType.STRING)
    TypeChamber typeChambre;
}