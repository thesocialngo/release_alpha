package org.tsn.dao.interfaces;

import org.tsn.tos.UserProfile;

public interface IUserProfileDAO {

	public void addUserProfile(UserProfile profile);
	UserProfile getUserProfile(UserProfile profile);
	public void updateUserProfile(UserProfile profile);
}
