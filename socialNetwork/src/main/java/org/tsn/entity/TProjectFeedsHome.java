package org.tsn.entity;

// Generated Apr 23, 2015 9:21:54 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TProjectFeeds.
 * @see org.tsn.entity.TProjectFeeds
 * @author Hibernate Tools
 */
@Stateless
public class TProjectFeedsHome
{

	private static final Log	log	= LogFactory.getLog(TProjectFeedsHome.class);

	@PersistenceContext
	private EntityManager		entityManager;

	public void persist(TProjectFeeds transientInstance)
	{
		log.debug("persisting TProjectFeeds instance");
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

	public void remove(TProjectFeeds persistentInstance)
	{
		log.debug("removing TProjectFeeds instance");
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

	public TProjectFeeds merge(TProjectFeeds detachedInstance)
	{
		log.debug("merging TProjectFeeds instance");
		try
		{
			TProjectFeeds result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		}
		catch(RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public TProjectFeeds findById(int id)
	{
		log.debug("getting TProjectFeeds instance with id: " + id);
		try
		{
			TProjectFeeds instance = entityManager.find(TProjectFeeds.class, id);
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
