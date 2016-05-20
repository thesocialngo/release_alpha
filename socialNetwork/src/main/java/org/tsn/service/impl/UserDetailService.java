package org.tsn.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.tsn.logic.IUserProfileManager;
import org.tsn.service.IUserDetailService;
import org.tsn.tos.UserProfile;

@RestController
public class UserDetailService implements IUserDetailService
{

	private static final Logger	LOGGER	= Logger.getLogger(UserDetailService.class);

	@Autowired
	private IUserProfileManager	profileDataManager;

	public String loginUser(UserProfile profile
	/*Model model,	HttpSession session*/)
	{
		LOGGER.info("adding new profile ." + profile);

		UserProfile userProfile = profileDataManager.getUserProfile(profile);

		// ////model.addAttribute(SessionConstants.USER_PROFILE, userProfile);

		if (userProfile.isValidProfile())
		{

			return "redirect:/";
		}
		else
		{
			// /////model.addAttribute("loginError", true);

			return "profile/Profile-SignUp";
		}
	}
}
