package tn.esprit.tpfoyeriheb.Reposotories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyeriheb.Entity.Etudiant;
@Repository

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
