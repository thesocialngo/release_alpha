package org.tsn.entity;

// Generated Jul 23, 2015 8:29:33 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TProjectMilestones.
 * @see org.tsn.entity.TProjectMilestones
 * @author Hibernate Tools
 */
@Stateless
public class TProjectMilestonesHome
{

	private static final Log	log	= LogFactory.getLog(TProjectMilestonesHome.class);

	@PersistenceContext
	private EntityManager		entityManager;

	public void persist(TProjectMilestones transientInstance)
	{
		log.debug("persisting TProjectMilestones instance");
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

	public void remove(TProjectMilestones persistentInstance)
	{
		log.debug("removing TProjectMilestones instance");
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

	public TProjectMilestones merge(TProjectMilestones detachedInstance)
	{
		log.debug("merging TProjectMilestones instance");
		try
		{
			TProjectMilestones result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		}
		catch(RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public TProjectMilestones findById(int id)
	{
		log.debug("getting TProjectMilestones instance with id: " + id);
		try
		{
			TProjectMilestones instance = entityManager.find(
					TProjectMilestones.class, id);
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
