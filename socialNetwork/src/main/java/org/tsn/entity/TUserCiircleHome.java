package org.tsn.entity;

// Generated Apr 23, 2015 9:21:54 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TUserCiircle.
 * @see org.tsn.entity.TUserCiircle
 * @author Hibernate Tools
 */
@Stateless
public class TUserCiircleHome
{

	private static final Log	log	= LogFactory.getLog(TUserCiircleHome.class);

	@PersistenceContext
	private EntityManager		entityManager;

	public void persist(TUserCiircle transientInstance)
	{
		log.debug("persisting TUserCiircle instance");
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

	public void remove(TUserCiircle persistentInstance)
	{
		log.debug("removing TUserCiircle instance");
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

	public TUserCiircle merge(TUserCiircle detachedInstance)
	{
		log.debug("merging TUserCiircle instance");
		try
		{
			TUserCiircle result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		}
		catch(RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public TUserCiircle findById(int id)
	{
		log.debug("getting TUserCiircle instance with id: " + id);
		try
		{
			TUserCiircle instance = entityManager.find(TUserCiircle.class, id);
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
