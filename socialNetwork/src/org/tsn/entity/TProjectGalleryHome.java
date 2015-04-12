package org.tsn.entity;

// Generated Feb 19, 2015 10:13:36 PM by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TProjectGallery.
 * @see org.tsn.entity.TProjectGallery
 * @author Hibernate Tools
 */
@Stateless
public class TProjectGalleryHome {

	private static final Log log = LogFactory.getLog(TProjectGalleryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TProjectGallery transientInstance) {
		log.debug("persisting TProjectGallery instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TProjectGallery persistentInstance) {
		log.debug("removing TProjectGallery instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TProjectGallery merge(TProjectGallery detachedInstance) {
		log.debug("merging TProjectGallery instance");
		try {
			TProjectGallery result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TProjectGallery findById(int id) {
		log.debug("getting TProjectGallery instance with id: " + id);
		try {
			TProjectGallery instance = entityManager.find(
					TProjectGallery.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
