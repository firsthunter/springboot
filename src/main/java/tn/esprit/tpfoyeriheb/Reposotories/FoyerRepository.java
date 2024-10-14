package tn.esprit.tpfoyeriheb.Reposotories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyeriheb.Entity.Foyer;

@Repository

public interface FoyerRepository extends JpaRepository<Foyer, Long> {
}
