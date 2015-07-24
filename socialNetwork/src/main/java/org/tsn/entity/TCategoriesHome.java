package org.tsn.entity;

// Generated Jul 23, 2015 8:29:33 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TCategories.
 * @see org.tsn.entity.TCategories
 * @author Hibernate Tools
 */
@Stateless
public class TCategoriesHome
{

	private static final Log	log	= LogFactory.getLog(TCategoriesHome.class);

	@PersistenceContext
	private EntityManager		entityManager;

	public void persist(TCategories transientInstance)
	{
		log.debug("persisting TCategories instance");
		try
		{
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		}
		catch(RuntimeException re)
		{
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TCategories persistentInstance)
	{
		log.debug("removing TCategories instance");
		try
		{
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		}
		catch(RuntimeException re)
		{
			log.error("remove failed", re);
			throw re;
		}
	}

	public TCategories merge(TCategories detachedInstance)
	{
		log.debug("merging TCategories instance");
		try
		{
			TCategories result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		}
		catch(RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public TCategories findById(Integer id)
	{
		log.debug("getting TCategories instance with id: " + id);
		try
		{
			TCategories instance = entityManager.find(TCategories.class, id);
			log.debug("get successful");
			return instance;
		}
		catch(RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}
}
