package org.tsn.entity;

// Generated Apr 23, 2015 9:21:54 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TTeam.
 * @see org.tsn.entity.TTeam
 * @author Hibernate Tools
 */
@Stateless
public class TTeamHome
{

	private static final Log	log	= LogFactory.getLog(TTeamHome.class);

	@PersistenceContext
	private EntityManager		entityManager;

	public void persist(TTeam transientInstance)
	{
		log.debug("persisting TTeam instance");
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

	public void remove(TTeam persistentInstance)
	{
		log.debug("removing TTeam instance");
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

	public TTeam merge(TTeam detachedInstance)
	{
		log.debug("merging TTeam instance");
		try
		{
			TTeam result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		}
		catch(RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public TTeam findById(int id)
	{
		log.debug("getting TTeam instance with id: " + id);
		try
		{
			TTeam instance = entityManager.find(TTeam.class, id);
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
