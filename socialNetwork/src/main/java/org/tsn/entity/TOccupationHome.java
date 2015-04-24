package org.tsn.entity;

// Generated Apr 23, 2015 9:21:54 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TOccupation.
 * @see org.tsn.entity.TOccupation
 * @author Hibernate Tools
 */
@Stateless
public class TOccupationHome
{

	private static final Log	log	= LogFactory.getLog(TOccupationHome.class);

	@PersistenceContext
	private EntityManager		entityManager;

	public void persist(TOccupation transientInstance)
	{
		log.debug("persisting TOccupation instance");
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

	public void remove(TOccupation persistentInstance)
	{
		log.debug("removing TOccupation instance");
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

	public TOccupation merge(TOccupation detachedInstance)
	{
		log.debug("merging TOccupation instance");
		try
		{
			TOccupation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		}
		catch(RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public TOccupation findById(Integer id)
	{
		log.debug("getting TOccupation instance with id: " + id);
		try
		{
			TOccupation instance = entityManager.find(TOccupation.class, id);
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
