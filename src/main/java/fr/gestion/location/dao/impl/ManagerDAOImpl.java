package fr.gestion.location.dao.impl;


import org.springframework.stereotype.Repository;

import fr.gestion.location.dao.IManagerDAO;
import fr.gestion.location.model.entity.Manager;

/**
 * Implementation de la DAO interface pour l'acc�s � Manager.
 * 
 * @author maouissaoui
 *
 * @param <T>
 *            classe de type DataObject
 */
@Repository("managerDao")
public class ManagerDAOImpl extends AbstractCommonDAOImpl<Manager> implements IManagerDAO {

}

