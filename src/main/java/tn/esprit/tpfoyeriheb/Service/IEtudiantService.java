package tn.esprit.tpfoyeriheb.Service;

import tn.esprit.tpfoyeriheb.Entity.Etudiant;

public interface IEtudiantService {
    Etudiant AddEtudiant(Etudiant etudiant);
    Etudiant updateEtudiant(Etudiant etudiant);
    void deletEtudiant(Etudiant etudiant);
    void deletetudiantbyid(long id);
    void deletall();
}
