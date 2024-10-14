package tn.esprit.tpfoyeriheb.Service;


import tn.esprit.tpfoyeriheb.Entity.Universite;
import tn.esprit.tpfoyeriheb.Reposotories.UniversiteRepository;

public class UniversiteService implements IUniversiteService{
     UniversiteRepository universiteRepository;

            public Universite addUniversite(Universite Universite){
            return  universiteRepository.save(Universite);
        }
        public Universite updateUniversite(Universite Universite) {
            return universiteRepository.save(Universite);
        }

        public void deletUniversite(Universite Universite) {
            universiteRepository.delete(Universite);
        }

        public void deleteUniversitebyid(Long id) {
            universiteRepository.deleteById(id);
        }

        public void deletall() {
            universiteRepository.deleteAll();
        }

    }




