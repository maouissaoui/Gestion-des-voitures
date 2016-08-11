package fr.gestion.location.service.impl;

import org.springframework.stereotype.Service;

import fr.gestion.location.model.entity.Location;
import fr.gestion.location.service.ILocationService;


/**
 * Implementation de service interface pour l'acc�s � Location.
 * 
 * @author maouissaoui
 *
 * @param <T>
 *            classe de type DataObject
 */
@Service("locationService")
public class LocationServiceImpl extends AbstractGenericService<Location> implements ILocationService {

}
