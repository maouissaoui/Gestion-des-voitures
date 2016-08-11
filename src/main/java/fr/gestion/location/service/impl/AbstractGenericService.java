package fr.gestion.location.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import fr.gestion.location.dao.ICommonDAO;
import fr.gestion.location.dao.exception.PersistenceException;
import fr.gestion.location.model.entity.AbstractDataObject;
import fr.gestion.location.service.IGenericService;
import fr.gestion.location.serivce.exception.BusinessException;

/**
 * Interface présentant les traitements communs à tous les services
 * 
 * @author maouissaoui
 *
 * @param <T>
 *            classe de type DataObject
 */
@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
public abstract class AbstractGenericService<T extends AbstractDataObject> implements IGenericService<T> {

	@Autowired
	private ICommonDAO<T> tDao;

	/**
	 * @param tDao
	 *            the tDao to set
	 */
	public void settDao(ICommonDAO<T> tDao) {
		this.tDao = tDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.business.serivce.IGenericService#create(tn.outil.gestion
	 * .model.entity.AbstractDataObject)
	 */
	public void create(T obj) throws BusinessException, PersistenceException {
		this.tDao.create(obj);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.business.serivce.IGenericService#find(tn.outil.gestion.
	 * model.entity.AbstractDataObject)
	 */
	public T find(T obj) throws BusinessException, PersistenceException {
		return this.tDao.find(obj);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.business.serivce.IGenericService#delete(tn.outil.gestion
	 * .model.entity.AbstractDataObject)
	 */
	public void delete(T obj) throws BusinessException, PersistenceException {
		this.tDao.delete(obj);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.business.serivce.IGenericService#update(tn.outil.gestion
	 * .model.entity.AbstractDataObject)
	 */
	public void update(T obj) throws BusinessException, PersistenceException {
		this.tDao.update(obj);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.business.serivce.IGenericService#merge(tn.outil.gestion.
	 * model.entity.AbstractDataObject)
	 */
	public void merge(T obj) throws BusinessException, PersistenceException {
		this.tDao.merge(obj);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.business.serivce.IGenericService#saveOrUpdate(tn.outil.
	 * gestion.model.entity.AbstractDataObject)
	 */
	public void saveOrUpdate(T obj) throws BusinessException, PersistenceException {
		this.tDao.saveOrUpdate(obj);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see tn.outil.gestion.serivce.IGenericService#findAll()
	 */
	public List<T> findAll() throws BusinessException, PersistenceException {
		return this.tDao.findAll();
	}
	
	
}
