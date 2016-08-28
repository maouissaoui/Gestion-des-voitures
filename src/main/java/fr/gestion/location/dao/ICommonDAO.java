package fr.gestion.location.dao;

import java.util.List;

import fr.gestion.location.dao.exception.PersistenceException;
import fr.gestion.location.model.entity.AbstractDataObject;

/**
 * Interface présentant les traitements communs à tous les DAO
 * 
 * @author aouissaoui
 *
 * @param <T>
 *            classe de type DataObject
 */
public interface ICommonDAO<T extends AbstractDataObject> {

	/**
	 * Get the Class of the entity
	 * 
	 * @return the class
	 */
	Class<T> getEntityClass();

	/**
	 * Creates a new object.
	 * 
	 * @param obj
	 *            the new object to create
	 * @throws PersistenceException
	 *             in case of a persistence problem
	 */
	public void create(final T obj) throws PersistenceException;

	/**
	 * find an object.
	 * 
	 * @param obj
	 *            object to find
	 * @throws PersistenceException
	 *             in case of a persistence problem
	 */

	public T find(T obj) throws PersistenceException;

	/**
	 * delete a new object.
	 * 
	 * @param obj
	 *            the object to delete
	 * @throws PersistenceException
	 *             in case of a persistence problem
	 */
	public void delete(final T obj) throws PersistenceException;

	/**
	 * Updates the object.
	 * 
	 * @param obj
	 *            the new value of the object
	 * @throws PersistenceException
	 *             in case of a persistence problem
	 */

	public void update(final T obj) throws PersistenceException;

	/**
	 * @param T
	 *            the object to merge
	 * @throws PersistenceException
	 *             in case of a persistence problem
	 */
	void merge(final T obj) throws PersistenceException;

	/**
	 * @param T
	 *            the object to save or update
	 * @throws PersistenceException
	 *             in case of a persistence problem
	 */
	void saveOrUpdate(final T obj) throws PersistenceException;

	/**
	 * Find ALL an object.
	 * 
	 * @return List of object
	 * @throws PersistenceException
	 *             in case of a persistence problem
	 */
	public List<T> findAll() throws PersistenceException;

}
