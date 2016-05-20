package org.tsn.logic.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.tsn.dao.interfaces.IUserProfileDAO;
import org.tsn.logic.IUserProfileManager;
import org.tsn.tos.UserProfile;

public class UserProfileManagerImpl implements IUserProfileManager
{
	@Autowired
	private IUserProfileDAO	profileDAO;

	@Override
	public UserProfile getUserProfile(UserProfile profile)
	{
		return profileDAO.getUserProfile(profile);
	}

	@Override
	public void addUserProfile(UserProfile profile)
	{

		profileDAO.addUserProfile(profile);
	}

	@Override
	public void updateUserProfile(UserProfile profile)
	{
		profileDAO.updateUserProfile(profile);
	}

}
