package org.tsn.utility;

import org.tsn.entity.TProfile;
import org.tsn.tos.UserProfile;

public class DatabaseConversionUtility extends BaseUtility {
	public static DatabaseConversionUtility shared = new DatabaseConversionUtility();
	private DatabaseConversionUtility() {
		super();
	}
	public TProfile getUserProfile(UserProfile userProfile) {

		if(null == userProfile)
			return null;
		
		TProfile profileEntity = new TProfile();
		
		/*profileEntity.setFirstName(firstName);
		profileEntity.setLastName(lastName);
		profileEntity.setGender(gender);
		profileEntity.setDob(dob);
		profileEntity.setEmailId(emailId);
		profileEntity.setPhoneNumber(phoneNumber);
		profileEntity.setProfileDescr(profileDescr);
		profileEntity.setFacebookId(facebookId);
		profileEntity.setTweeterId(tweeterId);
		profileEntity.setGoogleId(googleId);
		profileEntity.setIsAdmin(isAdmin);
		
		profileEntity.setTLogin(TLogin);
		profileEntity.setTEducation(TEducation);
		profileEntity.setTOccupation(TOccupation);
		profileEntity.setTSecurityAnswerses(TSecurityAnswerses);*/
		return null;
	}
}
