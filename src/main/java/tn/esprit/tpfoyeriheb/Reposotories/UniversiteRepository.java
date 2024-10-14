package tn.esprit.tpfoyeriheb.Reposotories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyeriheb.Entity.Universite;

@Repository

public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}
