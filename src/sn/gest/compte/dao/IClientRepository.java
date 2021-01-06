package sn.gest.compte.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.gest.compte.domaine.Client;
import sn.gest.compte.domaine.Compte;

@Repository
public interface IClientRepository extends JpaRepository<Client, Long> {
	
	//Les methodes
	public List<Client> findByNom(String nom);
	public List<Client> findByPrenom(String prenom);
	public List<Client> findByAdresse(String adresse);
	public Client findById(long id);
	public Client findByCompte(Compte compte);

}
