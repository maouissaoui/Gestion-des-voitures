package fr.gestion.location.test;


import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import fr.gestion.location.dao.IManagerDAO;
import fr.gestion.location.dao.exception.PersistenceException;
import fr.gestion.location.model.entity.Manager;

//@RunWith(SpringJUnit4ClassRunner.class)  
//@TransactionConfiguration(defaultRollback=true,transactionManager="transactionManager")
public class TestManager {
private static AbstractApplicationContext context;
//	@Autowired  
private IManagerDAO managerDAO;
	@Before 
	public void setUp() throws Exception {
		 context = new AnnotationConfigApplicationContext(fr.gestion.location.spring.config.HibernateConfiguration.class);
		 managerDAO = (IManagerDAO) context.getBean("managerDao");

	}

	@After
	public void tearDown() throws Exception {
		context.close();
	}

	
	@Test
	public void testSaveOrUpdate() {
		Manager m = new Manager(3);
		try {
			managerDAO.saveOrUpdate(m);
			System.out.println(1);
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testList() {
		Set <Manager> managers = new HashSet<Manager>();
		managers.add(new Manager());
		managers.add(new Manager());
		try {
			managerDAO.findAll();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		
	}

}
