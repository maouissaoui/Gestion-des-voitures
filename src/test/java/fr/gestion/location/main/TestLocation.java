//package fr.gestion.location.main;
//import java.util.Date;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
//
//import fr.gestion.location.dao.exception.PersistenceException;
//import fr.gestion.location.model.entity.Location;
//import fr.gestion.location.model.entity.User;
//import fr.gestion.location.model.entity.Voiture;
//import fr.gestion.location.serivce.exception.BusinessException;
//import fr.gestion.location.service.ILocationService;
//import fr.gestion.location.service.IUserService;
//import fr.gestion.location.spring.config.HibernateConfiguration;
//
//public class TestLocation {
//
//	public static void main(String[] args) {
//		AbstractApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfiguration.class);
//
//		IUserService service = (IUserService) context.getBean("userService");
//		
//		/*
//		 * Create user
//		 */
//		User user2=new User();
//
//		try {
//			User user1=new User();
//			user1.setNomUser("ISSAOUI");
//			user1.setPrenomUser("Nadia");
//			user1.setCinUser(1234);
//			user1.setLoginUser("login");
//			user1.setPasswordUser("password");
//			service.saveOrUpdate(user1);
//		} catch (BusinessException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		} catch (PersistenceException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//
//		/*
//		 * Create voiture
//		 */
//		Voiture voiture1 = new Voiture(1);
//		Voiture voiture2 = new Voiture(2);
//		
//		
//		/*
//		 * Get all location list from database
//		 */
//		
//
//		try {
//			Set<Voiture> voitures = new HashSet<Voiture>();
//			voitures.add(voiture1);
//			voitures.add(voiture2);
////			user2.setVoitures(voitures);
//			service.saveOrUpdate(user2);
//			}
//			catch (BusinessException | PersistenceException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally{
//		
//		
//
//		context.close();
//
//		}
//		
//		
//	}
//
//}
