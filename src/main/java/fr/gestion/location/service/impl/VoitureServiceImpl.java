package fr.gestion.location.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.gestion.location.dao.ICommonDAO;
import fr.gestion.location.dao.exception.PersistenceException;
import fr.gestion.location.model.entity.Voiture;
import fr.gestion.location.serivce.exception.BusinessException;
import fr.gestion.location.service.IVoitureService;

/**
 * Implementation de service interface pour l'acc�s � Voiture.
 * 
 * @author maouissaoui
 *
 * @param <T>
 *            classe de type DataObject
 */
@Service("voitureService")
public class VoitureServiceImpl extends AbstractGenericService<Voiture> implements IVoitureService  {


	@Autowired
	private ICommonDAO<Voiture> tDao;

	/**
	 * @param tDao
	 *            the tDao to set
	 */
	public void settDao(ICommonDAO<Voiture> tDao) {
		this.tDao = tDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.business.serivce.IGenericService#create(tn.outil.gestion
	 * .model.entity.AbstractDataObject)
	 */
	public void create(Voiture obj) throws BusinessException, PersistenceException {
		this.tDao.create(obj);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.business.serivce.IGenericService#find(tn.outil.gestion.
	 * model.entity.AbstractDataObject)
	 */
	public Voiture find(Voiture obj) throws BusinessException, PersistenceException {
		return this.tDao.find(obj);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.business.serivce.IGenericService#delete(tn.outil.gestion
	 * .model.entity.AbstractDataObject)
	 */
	public void delete(Voiture obj) throws BusinessException, PersistenceException {
		this.tDao.delete(obj);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.business.serivce.IGenericService#update(tn.outil.gestion
	 * .model.entity.AbstractDataObject)
	 */
	public void update(Voiture obj) throws BusinessException, PersistenceException {
		this.tDao.update(obj);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.business.serivce.IGenericService#merge(tn.outil.gestion.
	 * model.entity.AbstractDataObject)
	 */
	public void merge(Voiture obj) throws BusinessException, PersistenceException {
		this.tDao.merge(obj);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.business.serivce.IGenericService#saveOrUpdate(tn.outil.
	 * gestion.model.entity.AbstractDataObject)
	 */
	public void saveOrUpdate(Voiture obj) throws BusinessException, PersistenceException {
		this.tDao.saveOrUpdate(obj);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see tn.outil.gestion.serivce.IGenericService#findAll()
	 */
	public List<Voiture> findAll() throws BusinessException, PersistenceException {
		return this.tDao.findAll();
	}
	
	
}

	
	

