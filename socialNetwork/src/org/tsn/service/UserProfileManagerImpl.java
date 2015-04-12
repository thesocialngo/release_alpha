package org.tsn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.tsn.dao.interfaces.IMasterDataDAO;
import org.tsn.dao.interfaces.IUserProfileDAO;
import org.tsn.service.interfaces.IUserProfileManager;
import org.tsn.tos.UserProfile;

public class UserProfileManagerImpl implements IUserProfileManager {
	@Autowired
	private IUserProfileDAO profileDAO ;

	@Override
	public UserProfile getUserProfile(UserProfile profile) {
		// TODO Auto-generated method stub
		return profileDAO.getUserProfile(profile);
	}

	@Override
	public void addUserProfile(UserProfile profile) {
		// TODO Auto-generated method stub
		
		  profileDAO.addUserProfile(profile);
		}

	 
}
