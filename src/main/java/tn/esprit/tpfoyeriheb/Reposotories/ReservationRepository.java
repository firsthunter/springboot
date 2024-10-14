package tn.esprit.tpfoyeriheb.Reposotories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyeriheb.Entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, String> {
    Reservation add(Reservation reservation);
}
