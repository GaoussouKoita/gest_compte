package sn.gest.compte.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.gest.compte.domaine.Compte;

@Repository
public interface ICompteRepository  extends JpaRepository<Compte, Long> {
	
	public Compte findById(Long id);
	public List<Compte> findByTypeCompte(String typeCompte);

}
