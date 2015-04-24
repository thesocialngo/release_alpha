package org.tsn.entity;

// Generated Apr 23, 2015 9:21:54 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TLogin.
 * @see org.tsn.entity.TLogin
 * @author Hibernate Tools
 */
@Stateless
public class TLoginHome
{

	private static final Log	log	= LogFactory.getLog(TLoginHome.class);

	@PersistenceContext
	private EntityManager		entityManager;

	public void persist(TLogin transientInstance)
	{
		log.debug("persisting TLogin instance");
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

	public void remove(TLogin persistentInstance)
	{
		log.debug("removing TLogin instance");
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

	public TLogin merge(TLogin detachedInstance)
	{
		log.debug("merging TLogin instance");
		try
		{
			TLogin result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		}
		catch(RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public TLogin findById(Integer id)
	{
		log.debug("getting TLogin instance with id: " + id);
		try
		{
			TLogin instance = entityManager.find(TLogin.class, id);
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
