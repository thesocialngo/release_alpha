package org.tsn.entity;

// Generated Jul 23, 2015 8:29:33 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TEducation.
 * @see org.tsn.entity.TEducation
 * @author Hibernate Tools
 */
@Stateless
public class TEducationHome
{

	private static final Log	log	= LogFactory.getLog(TEducationHome.class);

	@PersistenceContext
	private EntityManager		entityManager;

	public void persist(TEducation transientInstance)
	{
		log.debug("persisting TEducation instance");
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

	public void remove(TEducation persistentInstance)
	{
		log.debug("removing TEducation instance");
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

	public TEducation merge(TEducation detachedInstance)
	{
		log.debug("merging TEducation instance");
		try
		{
			TEducation result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		}
		catch(RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public TEducation findById(Integer id)
	{
		log.debug("getting TEducation instance with id: " + id);
		try
		{
			TEducation instance = entityManager.find(TEducation.class, id);
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
