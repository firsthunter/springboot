package tn.esprit.tpfoyeriheb.Service;

import tn.esprit.tpfoyeriheb.Entity.Chambre;
import tn.esprit.tpfoyeriheb.Reposotories.ChambreRepository;

public class ChambreService implements IChambreService {
   ChambreRepository ChambreRepository;

    public Chambre addChambre(Chambre chambre){

        return ChambreRepository.save(chambre);
    }

    public Chambre updateChambre(Chambre chambre){
        return ChambreRepository.save(chambre);
    }
    public void deletChambre(Chambre chambre){
        ChambreRepository.delete(chambre);
    }
    public void deleteChambrebyid(long id){
        ChambreRepository.deleteById(id);
    }

    public void deletall(){
        ChambreRepository.deleteAll();
    }

}
