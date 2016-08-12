package fr.gestion.location.test;


import static org.junit.Assert.assertEquals;

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
import fr.gestion.location.spring.config.HibernateConfiguration;

import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

import org.junit.runner.RunWith;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HibernateConfiguration.class)
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class TestManager {

	@Autowired
private IManagerDAO managerDAO;
	 @Autowired
	  private HibernateTemplate  hibernateTemplate;
	
	@Test
	public void testCreate() throws PersistenceException {
		Manager m = new Manager();
		managerDAO.saveOrUpdate(m);
		Manager manager = hibernateTemplate.get(Manager.class, 1);
	 assertEquals("Ram", manager.getNomManager());
		
	}
	
//	@Test
//	public void testList() {
//		Set <Manager> managers = new HashSet<Manager>();
//		managers.add(new Manager());
//		managers.add(new Manager());
//		try {
//			managerDAO.findAll();
//		} catch (PersistenceException e) {
//			e.printStackTrace();
//		}
//		
//	}

}
