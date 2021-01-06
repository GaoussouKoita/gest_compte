package sn.gest.compte.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sn.gest.compte.domaine.Client;
import sn.gest.compte.domaine.Compte;
import sn.gest.compte.services.IClientService;
import sn.gest.compte.services.ICompteService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("config_beans.xml");
		
		IClientService clientService = appContext.getBean(IClientService.class);
		ICompteService compteService = appContext.getBean(ICompteService.class);

		Compte compte1 = new Compte(1, "Courant", 5000000);
		Compte compte2 = new Compte(2, "Epargne", 40225);

		Client client1 = new Client(1, "Gaoussou", "KOITA", "fass", compte1);
		Client client2 = new Client(2, "CAMARA", "Fatim", "Bamako", compte1);
		Client client = new Client(3, "OUEDRAOGO", "Mahamadi", "DKR", compte1);

		compteService.enregistre(compte2);
//		clientService.enregistre(client1);
//		clientService.enregistre(client2);
//		clientService.enregistre(client);

	}

}
