package org.tsn.utility;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.tsn.entity.TSecurityQuestions;
import org.tsn.tos.SecurityQuestion;
import org.tsn.tos.UserProfile;

public class UserProfileConversionUtility
{

	final static Logger							logger	= Logger.getLogger(UserProfileConversionUtility.class);

	public static UserProfileConversionUtility	shared	= new UserProfileConversionUtility();

	private UserProfileConversionUtility()
	{
	}

	public void updateSecurityQuestions(
			UserProfile result,
			List<TSecurityQuestions> securityQuestions)
	{

		List<SecurityQuestion> questions = new ArrayList<SecurityQuestion>();

		for (int i = 0; i < securityQuestions.size(); i++)
		{
			questions.add(new SecurityQuestion(securityQuestions.get(i)
					.getQuestionId(), securityQuestions.get(i)
					.getQuestionText()));
		}
		result.setSecurityQuestions(questions);
	}

	public boolean updateUserProfile(
			UserProfile updatedProfileData,
			UserProfile sessionProfile)
	{
		if (null == sessionProfile || null == updatedProfileData)
		{
			return false;
		}

		sessionProfile.setGender(updatedProfileData.getGender());

		return true;
	}
}
