package fr.gestion.location.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;






import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.gestion.location.model.entity.Manager;
import fr.gestion.location.model.entity.Voiture;
import fr.gestion.location.service.IVoitureService;
import fr.gestion.location.dao.exception.PersistenceException;
import fr.gestion.location.model.entity.Voiture;
import fr.gestion.location.service.IVoitureService;
import fr.gestion.location.serivce.exception.BusinessException;
import fr.gestion.location.spring.config.HibernateConfiguration;


public class TestMainVoiture {
	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfiguration.class);

		IVoitureService service = (IVoitureService) context.getBean("voitureService");


		/*
		 * Create Voiture
		 */
		Voiture voiture1=new Voiture();
		voiture1.setMatricule("mat");
		voiture1.setModele("Modele");
		voiture1.setMarque("Marque");
		voiture1.setConstructeur("Constructeur");
		voiture1.setMoteur("Moteur");
		voiture1.setPrix(500);

		
		
		/*
		 * Persist both Managers
		 */
		try {
			service.saveOrUpdate(voiture1);
		} catch (BusinessException | PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		/*
		 * Create Manager
		 */
		Manager manager1 = new Manager();
//		manager1.setNomManager("ISSAOUI");
//		manager1.setPrenomManager("Nadia");
//		manager1.setCinManager(1234);
//		manager1.setPermisConduite("permi");
//		manager1.setnCarteCredit(12345);
//		manager1.setLogin("login");
//		manager1.setPassword("password");
		
		/*
		 * Get all Managers list from database
		 */
		List<Voiture> voitures;
		try {
			voitures = service.findAll();
			for (Voiture voi1 : voitures) {
				System.out.println(voi1);
//				voiture1.setManager(manager1);
			}}
			catch (BusinessException | PersistenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
		
		
	
		
	
		

		context.close();

		}
}}
