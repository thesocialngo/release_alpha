package org.tsn.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tsn.dao.interfaces.ISecurityQuestionDAO;
import org.tsn.entity.TSecurityQuestions;
import org.tsn.entity.TSecurityQuestionsHome;

@Repository
public class SecurityQuestionDaoImpl implements ISecurityQuestionDAO {

	@Autowired
	private SessionFactory sessionFactory;

	final static Logger logger = Logger.getLogger(MasterDataDAOImpl.class);
	
	// @SuppressWarnings("unchecked")

	private static final Log log = LogFactory
			.getLog(TSecurityQuestionsHome.class);

	 @Override
	 public void addSecurityQuestion(TSecurityQuestions question){
		 logger.info("SecurityQuestions is:"+question);
	        this.sessionFactory.getCurrentSession().save(question);
	    }
	 
	    @SuppressWarnings("unchecked")
	    @Override
	    public List<TSecurityQuestions> getAllSecurityQuestion(){
	        return this.sessionFactory.getCurrentSession().createQuery("from TSecurityQuestions").list();
	    }
	 
	    @Override
	    public void deleteSecurityQuestion(Integer questionId) {
	    	TSecurityQuestions question = (TSecurityQuestions) sessionFactory.getCurrentSession().load(
	    			TSecurityQuestions.class, questionId);
	        if (null != questionId) {
	            this.sessionFactory.getCurrentSession().delete(question);
	        }
	    }
	
}