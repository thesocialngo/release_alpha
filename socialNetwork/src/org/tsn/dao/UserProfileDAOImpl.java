package org.tsn.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.tsn.dao.interfaces.IUserProfileDAO;
import org.tsn.entity.TProfile;
import org.tsn.entity.TSecurityQuestions;
import org.tsn.tos.UserProfile;
import org.tsn.utility.DatabaseConversionUtility;
import org.tsn.utility.MasterDataConversionUtility;
import org.tsn.utility.UserProfileConversionUtility;

public class UserProfileDAOImpl implements IUserProfileDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	final static Logger logger = Logger.getLogger(UserProfileDAOImpl.class);
	
	@Override
	@Transactional
	public UserProfile getUserProfile(UserProfile profile) {

		List<TSecurityQuestions>  securityQuestions = 
				this.sessionFactory.getCurrentSession().createQuery("from TSecurityQuestions").list();
		UserProfileConversionUtility.shared.updateSecurityQuestions(profile,securityQuestions);
		//return MasterDataConversionUtility.shared.getMasterRecords(securityQuestions,occupations,educations,causes,categories );
		logger.info("security questions added to profile :"+securityQuestions);
		return profile;
	}

	@Override
	@Transactional
	public void addUserProfile(UserProfile userProfile) {

		try {
			TProfile profile =   DatabaseConversionUtility.shared.getUserProfile(userProfile);
			 this.sessionFactory.getCurrentSession().save( 
					 profile);
			 logger.info("persist successful");
		} catch (RuntimeException re) {
			logger.error("FAILED TO ADD RECORD", re);
		}
	}

}
