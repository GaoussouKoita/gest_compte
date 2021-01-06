package sn.gest.compte.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.gest.compte.dao.ICompteRepository;
import sn.gest.compte.domaine.Compte;


@Service
public class CompteServiceImpl implements ICompteService {

	@Autowired
	ICompteRepository compteDao;
	@Override
	public void enregistre(Compte compte) {
		compteDao.save(compte);

	}

	@Override
	public void supprimer(Compte compte) {
		compteDao.delete(compte);
	}

	@Override
	public void update(Compte compte) {
		compteDao.save(compte);
	}

	@Override
	public Compte rechercherParId(long id) {
		
		return compteDao.findById(id);
	}

	@Override
	public List<Compte> rechercherParTypeCompte(String typeCompte) {
		// TODO Auto-generated method stub
		return compteDao.findByTypeCompte(typeCompte);
	}

}
