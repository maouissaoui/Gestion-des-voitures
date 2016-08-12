package fr.gestion.location.rest;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.gestion.location.model.entity.Manager;
import fr.gestion.location.service.IManagerService;
import  fr.gestion.location.dao.exception.PersistenceException;
import  fr.gestion.location.serivce.exception.BusinessException;

/**
 * @Consumes et @Produces permettent de configurer respectivement les valeurs
 *           des headers Content-Type et Accept autorisées,
 * @Component permet de déclarer que le bean courant doit être géré par Spring,
 * @Autowired permet d’injecter le bean UserService, défini dans notre classpath
 *            et annoté de @Service (par exemple).
 */
@Path("managers")
@Consumes({ APPLICATION_JSON, APPLICATION_XML })
@Produces({ APPLICATION_JSON, APPLICATION_XML })
@Component
public class ManagerRessource {
	@Autowired
	IManagerService managerService;
	
	
	@GET
	public List<Manager> listAllManagers() {
		List<Manager> managers = null;
		try {
			managers = managerService.findAll();
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}

		return managers;
	}
	@GET
	@Path("{id}")
	public Manager getManagerById(@PathParam("id") int id) {
		try {
			return managerService.find(new Manager(id));
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

	@POST
	public void create(Manager manager) {
		try {
			managerService.create(manager);
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
	}

	@PUT
	public void update(Manager manager) {
		try {
			managerService.update(manager);
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
	}

	@DELETE
	@Path("{id}")
	public void remove(@PathParam("id") int id) {
		try {
			managerService.delete(new Manager(id));
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
	}

}
