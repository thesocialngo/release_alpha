package org.tsn.entity;

// Generated Feb 19, 2015 10:13:36 PM by Hibernate Tools 4.0.0

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class TSecurityQuestions.
 * @see org.tsn.entity.TSecurityQuestions
 * @author Hibernate Tools
 */
@Stateless
public class TSecurityQuestionsHome {

	private static final Log log = LogFactory
			.getLog(TSecurityQuestionsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TSecurityQuestions transientInstance) {
		log.debug("persisting TSecurityQuestions instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TSecurityQuestions persistentInstance) {
		log.debug("removing TSecurityQuestions instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TSecurityQuestions merge(TSecurityQuestions detachedInstance) {
		log.debug("merging TSecurityQuestions instance");
		try {
			TSecurityQuestions result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TSecurityQuestions findById(Integer id) {
		log.debug("getting TSecurityQuestions instance with id: " + id);
		try {
			TSecurityQuestions instance = entityManager.find(
					TSecurityQuestions.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
