package fr.gestion.location.dao.impl;

import org.springframework.stereotype.Repository;

import fr.gestion.location.dao.IUserDAO;
import fr.gestion.location.model.entity.User;

/**
 * Implementation de la DAO interface pour l'acc�s � User.
 * 
 * @author maouissaoui
 *
 * @param <T>
 *            classe de type DataObject
 */
@Repository("userDao")
public class UserDAOImpl extends AbstractCommonDAOImpl<User> implements IUserDAO  {

}
