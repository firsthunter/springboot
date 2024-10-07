package tn.esprit.tpfoyeriheb.Entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Bloc")
public class Bloc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Idbloc")
    private long idBloc; // Changed to follow Java naming conventions

    @Column(name = "NomBloc")
    private String nomBloc;

    @Column(name = "Capacitebloc")
    private long capaciteBloc;

    @ManyToOne
    private Foyer foyer;

    @OneToMany(mappedBy = "bloc") // Corrected mappedBy to refer to the 'bloc' property in Chambre
    private Set<Chambre> chambre;

    // Getters and Setters (optional, but recommended)
    public long getIdBloc() {
        return idBloc;
    }

    public void setIdBloc(long idBloc) {
        this.idBloc = idBloc;
    }

    public String getNomBloc() {
        return nomBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public long getCapaciteBloc() {
        return capaciteBloc;
    }

    public void setCapaciteBloc(long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }

    public Foyer getFoyer() {
        return foyer;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }

    public Set<Chambre> getChambre() {
        return chambre;
    }

    public void setChambre(Set<Chambre> chambre) {
        this.chambre = chambre;
    }
}