package tn.esprit.tpfoyeriheb.Reposotories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.tpfoyeriheb.Entity.Chambre;
import org.springframework.stereotype.Repository;
@Repository


public interface ChambreRepository extends JpaRepository<Chambre, Long> {
}
