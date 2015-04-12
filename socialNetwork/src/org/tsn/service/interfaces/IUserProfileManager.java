package org.tsn.service.interfaces;

import org.tsn.tos.UserProfile;

public interface IUserProfileManager {

	UserProfile getUserProfile(UserProfile profile);

	public void addUserProfile(UserProfile profile);

}
