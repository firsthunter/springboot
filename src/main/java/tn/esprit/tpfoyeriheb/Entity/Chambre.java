package tn.esprit.tpfoyeriheb.Entity;

import jakarta.persistence.*;
import tn.esprit.tpfoyeriheb.Enum.TypeChamber;
import java.util.List;

@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;

    @Column(name = "numeroChambre", unique = true)
    private long numeroChambre;

    private String nomChambre;

    @Enumerated(EnumType.STRING)
    private TypeChamber typeChambre;

    @ManyToOne
    @JoinColumn(name = "bloc_id", nullable = false) // This property is now correctly mapped
    private Bloc bloc;

    @OneToMany(mappedBy = "chambre")
    private List<Reservation> reservations;

    // Getters and Setters (optional, but recommended)
    public long getIdChambre() {
        return idChambre;
    }

    public void setIdChambre(long idChambre) {
        this.idChambre = idChambre;
    }

    public long getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(long numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public String getNomChambre() {
        return nomChambre;
    }

    public void setNomChambre(String nomChambre) {
        this.nomChambre = nomChambre;
    }

    public TypeChamber getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(TypeChamber typeChambre) {
        this.typeChambre = typeChambre;
    }

    public Bloc getBloc() {
        return bloc;
    }

    public void setBloc(Bloc bloc) {
        this.bloc = bloc;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}