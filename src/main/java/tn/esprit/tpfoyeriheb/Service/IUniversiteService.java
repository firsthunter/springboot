package tn.esprit.tpfoyeriheb.Service;

import tn.esprit.tpfoyeriheb.Entity.Universite;

public interface IUniversiteService {
     Universite addUniversite(Universite Universite);
     Universite updateUniversite(Universite Universite);
     void deletUniversite(Universite Universite);
     void deleteUniversitebyid(Long id);
     void deletall();

}
