package org.tsn.entity;

// Generated Feb 19, 2015 10:13:36 PM by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TCauses.
 * @see org.tsn.entity.TCauses
 * @author Hibernate Tools
 */
@Stateless
public class TCausesHome  {

	private static final Log log = LogFactory.getLog(TCausesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TCauses transientInstance) {
		log.debug("persisting TCauses instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TCauses persistentInstance) {
		log.debug("removing TCauses instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TCauses merge(TCauses detachedInstance) {
		log.debug("merging TCauses instance");
		try {
			TCauses result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TCauses findById(int id) {
		log.debug("getting TCauses instance with id: " + id);
		try {
			TCauses instance = entityManager.find(TCauses.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
