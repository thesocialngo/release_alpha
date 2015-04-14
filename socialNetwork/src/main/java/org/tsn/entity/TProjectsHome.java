package org.tsn.entity;

// Generated Feb 19, 2015 10:13:36 PM by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TProjects.
 * @see org.tsn.entity.TProjects
 * @author Hibernate Tools
 */
@Stateless
public class TProjectsHome {

	private static final Log log = LogFactory.getLog(TProjectsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TProjects transientInstance) {
		log.debug("persisting TProjects instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TProjects persistentInstance) {
		log.debug("removing TProjects instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TProjects merge(TProjects detachedInstance) {
		log.debug("merging TProjects instance");
		try {
			TProjects result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TProjects findById(int id) {
		log.debug("getting TProjects instance with id: " + id);
		try {
			TProjects instance = entityManager.find(TProjects.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
