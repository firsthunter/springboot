package tn.esprit.tpfoyeriheb.Service;

import tn.esprit.tpfoyeriheb.Entity.Foyer;

public interface IFoyerService {
    Foyer addfoyer(Foyer foyer);
    Foyer updatefoyer(Foyer foyer);
    void deletFoyer(Foyer foyer);
    void deletefoyerbyid(long id);
    void deletall();
}
