package fr.gestion.location.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import fr.gestion.location.dao.ICommonDAO;
import fr.gestion.location.dao.exception.PersistenceException;
import fr.gestion.location.model.entity.AbstractDataObject;


/**
 * Classe abstraite présentant les traitements communs à tous les DAO
 * 
 * @author maouissaoui
 *
 * @param <T>
 *            classe de type DataObject
 */
/**
 * @author maouissaoui
 *
 * @param <T>
 */
public abstract class AbstractCommonDAOImpl<T extends AbstractDataObject> implements ICommonDAO<T> {

	/**
	 * SessionFactory
	 */
	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * The domain class.
	 */
	private final Class<T> domainClass;
	
	/**
	 * Constructors
	 */
	@SuppressWarnings("unchecked")
	public AbstractCommonDAOImpl() {
		this.domainClass = (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	/**
	 * @param domainClass
	 *            domainClass
	 */
	public AbstractCommonDAOImpl(final Class<T> domainClass) {
		super();
		this.domainClass = domainClass;
	}
	/**
	 * Get session
	 * 
	 * @return Session
	 */
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * @param sessionFactory
	 *            the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.dao.persistence.ICommonDAO#create(tn.outil.gestion.model
	 * .entity.AbstractDataObject)
	 */
	public void create(final T obj) throws PersistenceException {
		try {
			getSession().save(obj);
		} catch (DataAccessException dae) {
			throw new PersistenceException(dae);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.dao.persistence.ICommonDAO#update(tn.outil.gestion.model
	 * .entity.AbstractDataObject)
	 */
	@Override
	public void update(T obj) throws PersistenceException {
		try {
			getSession().update(obj);
		} catch (DataAccessException dae) {
			throw new PersistenceException(dae);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.dao.persistence.ICommonDAO#find(tn.outil.gestion.model.
	 * entity.AbstractDataObject)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T find(T obj) throws PersistenceException {
		try {
			return (T) getSession().get(obj.getClass(), obj.getId());
		} catch (DataAccessException dae) {
			throw new PersistenceException(dae);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.dao.persistence.ICommonDAO#delete(tn.outil.gestion.model
	 * .entity.AbstractDataObject)
	 */
	public void delete(T obj) throws PersistenceException {
		try {
			getSession().delete(obj);
		} catch (DataAccessException dae) {
			throw new PersistenceException(dae);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.dao.persistence.ICommonDAO#merge(tn.outil.gestion.model.
	 * entity.AbstractDataObject)
	 */
	@Override
	public void merge(T obj) throws PersistenceException {
		try {
			getSession().merge(obj);
		} catch (DataAccessException dae) {
			throw new PersistenceException(dae);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * tn.outil.gestion.dao.persistence.ICommonDAO#saveOrUpdate(tn.outil.gestion
	 * .model.entity.AbstractDataObject)
	 */
	@Override
	public void saveOrUpdate(T obj) throws PersistenceException {
		try {
			getSession().saveOrUpdate(obj);
		} catch (DataAccessException dae) {
			throw new PersistenceException(dae);
		}
	}
	
	public List<T> findAll() throws PersistenceException {
		return findByCriteria();
	}
	
	/**
	 * Use this inside subclasses as a convenience method.
	 */
	protected List<T> findByCriteria(final Criterion... criterion) {
		return findByCriteria(-1, -1, criterion);
	}

	/**
	 * Use this inside subclasses as a convenience method.
	 */
	@SuppressWarnings("unchecked")
	protected List<T> findByCriteria(final int firstResult,
			final int maxResults, final Criterion... criterion) {
		Criteria crit = getSession().createCriteria(getEntityClass());
		for (final Criterion c : criterion) {
			crit.add(c);
		}

		if (firstResult > 0) {
			crit.setFirstResult(firstResult);
		}

		if (maxResults > 0) {
			crit.setMaxResults(maxResults);
		}

		final List<T> result = crit.list();
		return result;
	}
	
	public Class<T> getEntityClass() {
		return domainClass;
	}

}
