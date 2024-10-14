package tn.esprit.tpfoyeriheb.Service;

import tn.esprit.tpfoyeriheb.Entity.Reservation;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    Reservation updatereservation(Reservation reservation);

    void deletReservation(Reservation reservation);
    void deleteReservationbyid(String id);
    void deletall();
}
