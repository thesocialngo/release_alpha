package org.tsn.utility;

import org.apache.commons.lang3.StringUtils;
import org.tsn.entity.TLogin;
import org.tsn.entity.TProfile;
import org.tsn.entity.TProjectType;
import org.tsn.entity.TProjects;
import org.tsn.tos.ProjectMovement;
import org.tsn.tos.ProjectType;
import org.tsn.tos.UserProfile;

public class DatabaseConversionUtility extends BaseUtility
{
	public static DatabaseConversionUtility	shared	= new DatabaseConversionUtility();

	private DatabaseConversionUtility()
	{
		super();
	}

	public TProfile geTProfile(UserProfile userProfile)
	{

		if (null == userProfile)
		{
			return null;
		}

		TProfile profileEntity = new TProfile();

		updateTprofile(userProfile, profileEntity);
		return profileEntity;
	}

	private void updateTprofile(UserProfile userProfile, TProfile profileEntity)
	{
		TLogin login = new TLogin();
		login.setUserName(userProfile.getEmail());
		login.setPassword(userProfile.getPassword());

		profileEntity.setFirstName(userProfile.getFirstName());
		profileEntity.setLastName(userProfile.getLastName());
		profileEntity.setGender(userProfile.getGender());
		profileEntity.setDob(userProfile.getDateOfBirth());
		profileEntity.setEmailId(userProfile.getEmail());
		profileEntity.setPhoneNumber(userProfile.getPhoneNumber());
		// profileEntity.setProfileDescr(userProfile);
		// profileEntity.setFacebookId();
		// profileEntity.setTweeterId(tweeterId);
		// profileEntity.setGoogleId(googleId);
		// profileEntity.setIsAdmin(isAdmin);

		profileEntity.setTLogin(login);
		// profileEntity.setTEducation( new TEducation() );
		// profileEntity.setTOccupation(new TOccupation());
		// profileEntity.setTSecurityAnswerses( new TSecurityAnswer);
	}

	public TProfile getTProfile(UserProfile userProfile, TProfile profile)
	{
		if (null == profile)
		{
			return null;
		}

		updateTprofile(userProfile, profile);

		return profile;
	}

	public UserProfile getUserProfile(TProfile profile)
	{
		if (null == profile)
		{
			return null;
		}

		UserProfile userProfile = new UserProfile();

		// userProfile.set profile.getLoginId();
		if (null != profile.getTEducation())
		{
			userProfile.setEducationID(profile.getTEducation().getEducationId());
		}
		// userProfile.set profile.getTLogin();
		if (null != profile.getTOccupation())
		{
			userProfile.setOccupationID(profile.getTOccupation()
					.getOccupationId());
		}
		userProfile.setFirstName(profile.getFirstName());
		userProfile.setLastName(profile.getLastName());
		userProfile.setGender(profile.getGender());
		userProfile.setDateOfBirth(profile.getDob());
		userProfile.setEmail(profile.getEmailId());
		userProfile.setPhoneNumber(profile.getPhoneNumber());
		// userProfile.setp profile.getProfileDescr();
		// userProfile.set profile.getProfilePhoto();
		userProfile.setFacebookID(profile.getFacebookId());
		userProfile.setTweeeterID(profile.getTweeterId());
		userProfile.setGoogleID(profile.getGoogleId());
		// userProfile.sete profile.getEducationDescr();
		// userProfile.seto profile.getOccupationDescr();
		userProfile.setAdmin(toBoolean(profile.getIsAdmin()));

		return userProfile;
	}

	public boolean validateUserAunthentication(
			UserProfile profile1,
			TProfile profile2)
	{
		if (null == profile1 || null == profile2
			|| null == profile1.getPassword() || null == profile2.getTLogin())
		{
			return false;
		}

		String dbPassword = profile2.getTLogin().getPassword();
		String password = profile1.getPassword();
		return StringUtils.equals(dbPassword, password);
	}

	public TProjects geTProject(ProjectMovement movement)
	{
		if (null == movement)
		{
			return null;
		}
		TProjects result = new TProjects();

		result.setTProjectType(getTProjectType(movement.getProjectType()));

		return result;
	}

	private TProjectType getTProjectType(ProjectType projectType)
	{
		if (null == projectType)
		{
			return null;
		}

		TProjectType result = new TProjectType();
		result.setProjectTypeId(projectType.getId());
		result.setTypeDescr(projectType.getDescription());

		return result;
	}
}
