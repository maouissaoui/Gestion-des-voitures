package fr.gestion.location.dao.impl;

import org.springframework.stereotype.Repository;

import fr.gestion.location.dao.IVoitureDAO;
import fr.gestion.location.model.entity.Voiture;

/**
 * Implementation de la DAO interface pour l'acc�s � Voiture.
 * 
 * @author maouissaoui
 *
 * @param <T>
 *            classe de type DataObject
 */
@Repository("voitureDao")
public class VoitureDAOImpl extends AbstractCommonDAOImpl<Voiture> implements IVoitureDAO {

}
