package fr.gestion.location.service.impl;

import org.springframework.stereotype.Service;

import fr.gestion.location.model.entity.Manager;
import fr.gestion.location.service.IManagerService;

/**
 * Implementation de service interface pour l'acc�s � Manager.
 * 
 * @author maouissaoui
 *
 * @param <T>
 *            classe de type DataObject
 */
@Service("managerService")
public class ManagerServiceImpl extends AbstractGenericService<Manager> implements IManagerService {

}
