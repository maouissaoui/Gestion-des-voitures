package fr.gestion.location.dao.impl;

import org.springframework.stereotype.Repository;

import fr.gestion.location.dao.ILocationDAO;
import fr.gestion.location.model.entity.Location;

/**
 * Implementation de la DAO interface pour l'acc�s � Location.
 * 
 * @author maouissaoui
 *
 * @param <T>
 *            classe de type DataObject
 */
@Repository("locationDao")
public class LocationDAOImpl extends AbstractCommonDAOImpl<Location> implements ILocationDAO {

}
