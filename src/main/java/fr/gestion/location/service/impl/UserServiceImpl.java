package fr.gestion.location.service.impl;

import org.springframework.stereotype.Service;

import fr.gestion.location.model.entity.User;
import fr.gestion.location.service.IUserService;

/**
 * Implementation de service interface pour l'acc�s � User.
 * 
 * @author maouissaoui
 *
 * @param <T>
 *            classe de type DataObject
 */
@Service("userService")
public class UserServiceImpl extends AbstractGenericService<User> implements IUserService{

}
