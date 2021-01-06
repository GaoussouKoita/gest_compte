package sn.gest.compte.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.gest.compte.dao.IClientRepository;
import sn.gest.compte.domaine.Client;
import sn.gest.compte.domaine.Compte;

@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	IClientRepository clientDao;
	
	@Override
	public void enregistre(Client client) {
		clientDao.save(client);

	}

	@Override
	public void supprimer(Client client) {
		clientDao.delete(client);
	}

	@Override
	public void update(Client client) {
		clientDao.save(client);
	}

	@Override
	public Client chercher(Long id) {
		
		return clientDao.findById(id);
	}

	@Override
	public List<Client> chercherParNom(String nom) {
		// TODO Auto-generated method stub
		return clientDao.findByNom(nom);
	}

	@Override
	public List<Client> chercherParPrenom(String prenom) {
		// TODO Auto-generated method stub
		return clientDao.findByPrenom(prenom);
	}

	@Override
	public List<Client> chercherParAdresse(String adresse) {
		// TODO Auto-generated method stub
		return clientDao.findByAdresse(adresse);
	}

	@Override
	public Client chercherParCompte(Compte compte) {
		// TODO Auto-generated method stub
		return clientDao.findByCompte(compte);
	}

	@Override
	public String nomCompletClient(Client client) {
		return client.getNom()+" "+client.getPrenom();
	}

	@Override
	public boolean decouvertPossible(Client client) {
		
		if(client.getCompte().getTypeCompte() == "Courant") {
			return true;
		}
		return false;
	}

}
 