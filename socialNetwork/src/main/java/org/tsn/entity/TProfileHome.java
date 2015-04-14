package org.tsn.entity;

// Generated Feb 19, 2015 10:13:36 PM by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TProfile.
 * @see org.tsn.entity.TProfile
 * @author Hibernate Tools
 */
@Stateless
public class TProfileHome {

	private static final Log log = LogFactory.getLog(TProfileHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TProfile transientInstance) {
		log.debug("persisting TProfile instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TProfile persistentInstance) {
		log.debug("removing TProfile instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TProfile merge(TProfile detachedInstance) {
		log.debug("merging TProfile instance");
		try {
			TProfile result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TProfile findById(int id) {
		log.debug("getting TProfile instance with id: " + id);
		try {
			TProfile instance = entityManager.find(TProfile.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
