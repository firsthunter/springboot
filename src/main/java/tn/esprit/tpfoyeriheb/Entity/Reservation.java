package tn.esprit.tpfoyeriheb.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Reservation {
    @Id
    String idReservation;
    LocalDate anneeUniversitaire;
    Boolean estValide;
}
