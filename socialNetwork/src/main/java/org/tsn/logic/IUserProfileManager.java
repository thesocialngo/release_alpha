package org.tsn.logic;

import org.tsn.tos.UserProfile;

public interface IUserProfileManager {

	UserProfile getUserProfile(UserProfile profile);

	public void addUserProfile(UserProfile profile);
	
	public void updateUserProfile(UserProfile profile);

}
