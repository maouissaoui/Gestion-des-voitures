package fr.gestion.location.service;

import java.util.List;



import fr.gestion.location.dao.exception.PersistenceException;
import fr.gestion.location.model.entity.AbstractDataObject;
import fr.gestion.location.serivce.exception.BusinessException;

public interface IGenericService<T extends AbstractDataObject>{
	/**
	 * @param obj
	 * @throws BusinessException,
	 *             PersistenceException
	 */
	public void create(final T obj) throws BusinessException, PersistenceException;

	/**
	 * @param obj
	 * @return
	 * @throws BusinessException,
	 *             PersistenceException
	 */
	public T find(T obj) throws BusinessException, PersistenceException;

	/**
	 * @param obj
	 * @throws BusinessException,
	 *             PersistenceException
	 */
	public void delete(final T obj) throws BusinessException, PersistenceException;

	/**
	 * @param obj
	 * @throws BusinessException,
	 *             PersistenceException
	 */
	public void update(final T obj) throws BusinessException, PersistenceException;

	/**
	 * @param obj
	 * @throws BusinessException,
	 *             PersistenceException
	 */
	void merge(final T obj) throws BusinessException, PersistenceException;

	/**
	 * @param obj
	 * @throws BusinessException,
	 *             PersistenceException
	 */
	void saveOrUpdate(final T obj) throws BusinessException, PersistenceException;

	/**
	 * Find ALL an object.
	 * 
	 * @return List of object
	 * @throws PersistenceException
	 *             in case of a persistence problem
	 * @throws BusinessException
	 *             in case of a Business problem
	 */
	public List<T> findAll() throws BusinessException, PersistenceException;
	
	
}
