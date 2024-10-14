package tn.esprit.tpfoyeriheb.Service;

import tn.esprit.tpfoyeriheb.Entity.Etudiant;
import tn.esprit.tpfoyeriheb.Reposotories.EtudiantRepository;

public class EtudiantService implements IEtudiantService {
    EtudiantRepository etudiantRepository;

    public Etudiant AddEtudiant(Etudiant etudiant){

        return etudiantRepository.save(etudiant);
    }

    public Etudiant updateEtudiant(Etudiant etudiant){
        return etudiantRepository.save(etudiant);
    }
    public void deletEtudiant(Etudiant etudiant){
        etudiantRepository.delete(etudiant);
    }
    public void deletetudiantbyid(long id){
        etudiantRepository.deleteById(id);
    }

    public void deletall(){
        etudiantRepository.deleteAll();
    }
}
