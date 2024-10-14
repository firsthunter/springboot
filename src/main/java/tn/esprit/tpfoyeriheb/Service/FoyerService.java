package tn.esprit.tpfoyeriheb.Service;

import tn.esprit.tpfoyeriheb.Entity.Foyer;
import tn.esprit.tpfoyeriheb.Reposotories.FoyerRepository;

public class FoyerService implements IFoyerService{
    FoyerRepository foyerRepository;

    public Foyer addfoyer(Foyer foyer) {

        return foyerRepository.save(foyer);
    }

    public Foyer updatefoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    public void deletFoyer(Foyer foyer) {
        foyerRepository.delete(foyer);
    }

    public void deletefoyerbyid(long id) {
        foyerRepository.deleteById(id);
    }

    public void deletall() {
        foyerRepository.deleteAll();
    }
}
