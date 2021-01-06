package sn.gest.compte.services;

import java.util.List;
import sn.gest.compte.domaine.Client;
import sn.gest.compte.domaine.Compte;

public interface IClientService {

	public void enregistre(Client client);

	public void supprimer(Client client);

	public void update(Client client);

	public Client chercher(Long id);

	public List<Client> chercherParNom(String nom);

	public List<Client> chercherParPrenom(String prenom);

	public List<Client> chercherParAdresse(String adresse);

	public Client chercherParCompte(Compte compte);
	
	public String nomCompletClient(Client client);
	
	public boolean decouvertPossible(Client client);

}
