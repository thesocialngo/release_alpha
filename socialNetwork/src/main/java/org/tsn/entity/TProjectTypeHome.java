package org.tsn.entity;

// Generated Jul 23, 2015 8:29:33 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TProjectType.
 * @see org.tsn.entity.TProjectType
 * @author Hibernate Tools
 */
@Stateless
public class TProjectTypeHome
{

	private static final Log	log	= LogFactory.getLog(TProjectTypeHome.class);

	@PersistenceContext
	private EntityManager		entityManager;

	public void persist(TProjectType transientInstance)
	{
		log.debug("persisting TProjectType instance");
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

	public void remove(TProjectType persistentInstance)
	{
		log.debug("removing TProjectType instance");
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

	public TProjectType merge(TProjectType detachedInstance)
	{
		log.debug("merging TProjectType instance");
		try
		{
			TProjectType result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		}
		catch(RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public TProjectType findById(int id)
	{
		log.debug("getting TProjectType instance with id: " + id);
		try
		{
			TProjectType instance = entityManager.find(TProjectType.class, id);
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
