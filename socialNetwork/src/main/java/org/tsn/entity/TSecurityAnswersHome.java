package org.tsn.entity;

// Generated Jul 23, 2015 8:29:33 PM by Hibernate Tools 4.3.1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TSecurityAnswers.
 * @see org.tsn.entity.TSecurityAnswers
 * @author Hibernate Tools
 */
@Stateless
public class TSecurityAnswersHome
{

	private static final Log	log	= LogFactory.getLog(TSecurityAnswersHome.class);

	@PersistenceContext
	private EntityManager		entityManager;

	public void persist(TSecurityAnswers transientInstance)
	{
		log.debug("persisting TSecurityAnswers instance");
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

	public void remove(TSecurityAnswers persistentInstance)
	{
		log.debug("removing TSecurityAnswers instance");
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

	public TSecurityAnswers merge(TSecurityAnswers detachedInstance)
	{
		log.debug("merging TSecurityAnswers instance");
		try
		{
			TSecurityAnswers result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		}
		catch(RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public TSecurityAnswers findById(int id)
	{
		log.debug("getting TSecurityAnswers instance with id: " + id);
		try
		{
			TSecurityAnswers instance = entityManager.find(
					TSecurityAnswers.class, id);
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
