package org.tsn.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.tsn.dao.interfaces.IUserProfileDAO;
import org.tsn.entity.TProfile;
import org.tsn.entity.TSecurityQuestions;
import org.tsn.tos.UserProfile;
import org.tsn.utility.DatabaseConversionUtility;
import org.tsn.utility.JavaUtility;
import org.tsn.utility.MasterDataConversionUtility;
import org.tsn.utility.UserProfileConversionUtility;

public class UserProfileDAOImpl implements IUserProfileDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	final static Logger logger = Logger.getLogger(UserProfileDAOImpl.class);
	
	@Override
	@Transactional
	public UserProfile getUserProfile(UserProfile profile) {

 		
		logger.info("fetching from database ..");
		
		TProfile tProfile  = getProfile (profile.getEmail());// (TProfile) template.load(TProfile.class, userProfile.getId());
		
		
		
		/*Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(UserProfile.class);  
		criteria.add( Restrictions.eqProperty("email",  profile.getEmail()) );*/
 				  
		if( DatabaseConversionUtility.shared.validateUserAunthentication( profile,tProfile))
		{
			profile = DatabaseConversionUtility.shared.getUserProfile(tProfile);
			profile.setValidProfile(true);
		    return profile;
		}
				  
		
		return profile;
	}

	@Override
	@Transactional
	public void addUserProfile(UserProfile userProfile) {

		try {
			TProfile profile =   DatabaseConversionUtility.shared.geTProfile(userProfile);
			 logger.info("persisting profile :"+profile);
			this.sessionFactory.getCurrentSession().save( 
					 profile);
			
			 logger.info("persist successful");
		} catch (RuntimeException re) {
			logger.error("FAILED TO ADD RECORD", re);
		}
	}

	@Override
	@Transactional
	public void updateUserProfile(UserProfile userProfile)
	{
		try {
			TProfile profile  = getProfile (userProfile.getEmail());// (TProfile) template.load(TProfile.class, userProfile.getId());
			
			DatabaseConversionUtility.shared.getTProfile(userProfile,profile);
			
			logger.info("persisting profile :"+profile);
			this.sessionFactory.getCurrentSession().update(profile);  
			
			 logger.info("persist successful");
		} catch (RuntimeException re) {
			logger.error("FAILED TO ADD RECORD", re);
		}
	}

	private TProfile getProfile(String email)
	{
		List<TProfile> profiles = new ArrayList<TProfile>();
		 
		profiles = sessionFactory.getCurrentSession()
			.createQuery("from TProfile where emailId=?")
			.setParameter(0, email)
			.list();
 
		if (profiles.size() > 0) {
			return profiles.get(0);
		} else {
			return null;
		}
  	}
}
