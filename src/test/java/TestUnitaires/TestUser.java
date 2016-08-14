package TestUnitaires;


import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import fr.gestion.location.dao.IManagerDAO;
import fr.gestion.location.dao.IUserDAO;
import fr.gestion.location.dao.exception.PersistenceException;
import fr.gestion.location.model.entity.Manager;
import fr.gestion.location.model.entity.User;

public class TestUser {
	private static AbstractApplicationContext context;
//	@Autowired  
	private IUserDAO userDAO;
	@Before
	public void setUp() throws Exception {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(fr.gestion.location.spring.config.HibernateConfiguration.class);
		 userDAO = (IUserDAO) context.getBean("userDAO");
	}

	@After
	public void tearDown() throws Exception {
		context.close();

	}

	@Test
	public void testDelete() throws PersistenceException {
		User user = new User(1);
		user=userDAO.find(user);
		userDAO.delete(user);
	}

	@Test
	public void testSaveOrUpdate() {
		User user = new User(2);
		try {
			userDAO.saveOrUpdate(user);
			System.out.println(1);
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		
	}

	@Test
	public void testFindAll() {
		Set <User> users = new HashSet<User>();
		users.add(new User());
		users.add(new User());
		try {
			userDAO.findAll();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		
	}

}
