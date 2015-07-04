package org.tsn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.tsn.resources.SessionConstants;
import org.tsn.resources.TSN_Constants;
import org.tsn.service.interfaces.IUserProfileManager;
import org.tsn.tos.UserProfile;
import org.tsn.utility.JavaUtility;
import org.tsn.utility.UserProfileConversionUtility;

@Controller
@RequestMapping("user")
@SessionAttributes(SessionConstants.USER_PROFILE)
public class UserController extends BaseController
{
	final static Logger			logger	= Logger.getLogger(UserController.class);

	@Autowired
	private IUserProfileManager	profileDataManager;

	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public String loginUser(
			@ModelAttribute UserProfile profile,
			Model model,
			HttpSession session)
	{
		logger.info("adding new profile ." + profile);

		/*map.addAttribute("userprofile",
				profileDataManager.getUserProfile(profile));*/
		
		//profile.setValidProfile(true);

		UserProfile userProfile = profileDataManager.getUserProfile(profile);
		
		model.addAttribute(SessionConstants.USER_PROFILE,userProfile);

		if(userProfile.isValidProfile())
		{
			//return "profile/Update-Profile";
			//http://localhost:8080/socialNetwork/
//			return "general/index";
			return "redirect:/";
		}
		else
		{
			model.addAttribute("loginError",true);
			
			return "profile/Profile-SignUp";
		}
	}
	
	@RequestMapping(value = "/SignUp", method = RequestMethod.GET)
	public String loadUserProfile(ModelMap map,HttpServletRequest request)
	{
		boolean login = JavaUtility.shared.toBoolean(request.getParameter("login"))  ;
		UserProfile profile = new UserProfile();
		
		map.addAttribute("userprofile",
				profileDataManager.getUserProfile(profile));

		map.addAttribute("login",login);
				 
		return "profile/Profile-SignUp";// "profile/bkpSignUp";
	}

	/*
	 * @RequestMapping(value = "/test", method = RequestMethod.GET) public
	 * String testUserProfile(ModelMap map) { //map.addAttribute("question",
	 * ""); UserProfile profile = new UserProfile();
	 * map.addAttribute("userprofile",
	 * profileDataManager.getUserProfile(profile));
	 * 
	 * //return "profile/updateprofile"; return
	 * "common/footer";//"profile/bkpSignUp"; }
	 */
	@RequestMapping(value = "/SignUp", method = RequestMethod.POST)
	public String addtUserProfile(
			@ModelAttribute UserProfile profile,
			Model model,
			HttpSession session)
	{
		logger.info("adding new profile ." + profile);

		profile.setValidProfile(true);
		profileDataManager.addUserProfile(profile);
		model.addAttribute(SessionConstants.USER_PROFILE,
				profileDataManager.getUserProfile(profile));

		return "profile/Update-Profile";
	}

	// updateProfile
	// TODO: following method may be deleted , edit profile can not be called
	// with a get type/
	@RequestMapping(value = "/updateProfile", method = RequestMethod.GET)
	public String getUserProfile(Model model, HttpServletRequest request)
	{
		HttpSession session = request.getSession(false);
		UserProfile profile = (UserProfile) session.getAttribute(SessionConstants.USER_PROFILE);

		if (null == profile)
		{
			logError("null profile found.",
					TSN_Constants.RUNTIME_ERROR_PROFILE_NOT_FOUND);
		}

		logger.info(" Session data : profile ." + profile);

		model.addAttribute(SessionConstants.USER_PROFILE, profile);
		return "profile/Update-Profile";
	}

	@RequestMapping(value = "/updateProfile", method = RequestMethod.POST)
	public String updateUserProfile(
			@ModelAttribute UserProfile profile,
			Model model,
			HttpSession session)
	{

		UserProfile sessionProfileData = (UserProfile) session.getAttribute(SessionConstants.USER_PROFILE);
		logger.info("  updateProfile - Session data : profile ."
			+ session.getAttribute(SessionConstants.USER_PROFILE));
		logger.info("  updateProfile - user data : profile ." + profile);
		boolean updated = UserProfileConversionUtility.shared.updateUserProfile(
				profile, sessionProfileData);

		if (updated)
		{
			model.addAttribute(SessionConstants.USER_PROFILE,
					sessionProfileData);

			profileDataManager.updateUserProfile(sessionProfileData);
			session.setAttribute(SessionConstants.USER_PROFILE,
					sessionProfileData);
			return "profile/Update-Profile";
		}
		return "general/errorPage";

	}

	/*
	 * @RequestMapping(value = "/", method = RequestMethod.GET) public String
	 * listsecurityQuestions(ModelMap map) { map.addAttribute("question", "");
	 * map.addAttribute("masterRecords", masterDataManager.getRecords());
	 * 
	 * return "admin/index"; }
	 */

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUserProfile(
			@ModelAttribute(value = "userprofile") UserProfile userProfile,
			BindingResult result)
	{
		profileDataManager.addUserProfile(userProfile);
		return "redirect:/";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String doLogout(Model model, HttpSession session)
	{

		session.invalidate();
		if (model.containsAttribute(SessionConstants.USER_PROFILE))
			model.asMap().remove(SessionConstants.USER_PROFILE);

		//return "general/index";
		return "redirect:/";
	}

}
