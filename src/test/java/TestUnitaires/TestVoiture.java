package TestUnitaires;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.gestion.location.dao.IVoitureDAO;
import fr.gestion.location.dao.exception.PersistenceException;
import fr.gestion.location.model.entity.Voiture;

public class TestVoiture {
	private static AbstractApplicationContext context;
	private IVoitureDAO voitureDAO;

	@Before
	public void setUp() throws Exception {
		context = new AnnotationConfigApplicationContext(
				fr.gestion.location.spring.config.HibernateConfiguration.class);
		voitureDAO = (IVoitureDAO) context.getBean("voitureDAO");
	}

	@After
	public void tearDown() throws Exception {
		context.close();
	}

	@Test
	public void testCreate() throws PersistenceException {
		Voiture voiture1 = new Voiture();
		voiture1.setMatricule("mat");
		voiture1.setModele("Modele");
		voiture1.setMarque("Marque");
		voiture1.setConstructeur("Constructeur");
		voiture1.setMoteur("Moteur");
		voiture1.setPrix(500);
		voitureDAO.create(voiture1);
	}

	@Test
	public void testFind() throws PersistenceException {
		Voiture voiture2 = new Voiture(1);
		voitureDAO.find(voiture2);
	}

}
