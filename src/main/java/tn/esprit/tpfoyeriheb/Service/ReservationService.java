package tn.esprit.tpfoyeriheb.Service;

import tn.esprit.tpfoyeriheb.Entity.Reservation;
import tn.esprit.tpfoyeriheb.Reposotories.ReservationRepository;

public class ReservationService implements IReservationService {
    ReservationRepository reservationRepository;

    public Reservation addReservation(Reservation reservation){
        return  reservationRepository.save(reservation);
    }
    public Reservation updatereservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public void deletReservation(Reservation reservation) {
        reservationRepository.delete(reservation);
    }

    public void deleteReservationbyid(String id) {
        reservationRepository.deleteById(id);
    }

    public void deletall() {
        reservationRepository.deleteAll();
    }

}
