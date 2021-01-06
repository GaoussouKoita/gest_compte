package sn.gest.compte.services;

import java.util.List;

import sn.gest.compte.domaine.Compte;

public interface ICompteService {

	public void enregistre(Compte compte);

	public void supprimer(Compte compte);

	public void update(Compte compte);

	public Compte rechercherParId(long id);

	public List<Compte> rechercherParTypeCompte(String Compte);

}
