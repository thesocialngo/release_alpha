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
import org.tsn.utility.UserProfileConversionUtility;

 
	@Controller
	@RequestMapping("user")
	@SessionAttributes(SessionConstants.USER_PROFILE)
	public class UserController extends BaseController {
		final static Logger logger = Logger.getLogger(UserController.class);

	    @Autowired
	    private IUserProfileManager profileDataManager;
	    
	    @RequestMapping(value = "/SignUp", method = RequestMethod.GET)
	    public String loadUserProfile(ModelMap map )
	    {
	    	//map.addAttribute("question", "");
	    	UserProfile profile = new UserProfile();
	    	map.addAttribute("userprofile", profileDataManager.getUserProfile(profile));   
	        
	    	
	        //return  "profile/updateprofile";
	    	return  "profile/Profile-SignUp";//"profile/bkpSignUp";
	    }
	    
	    /*@RequestMapping(value = "/test", method = RequestMethod.GET)
	    public String testUserProfile(ModelMap map)
	    {
	    	//map.addAttribute("question", "");
	    	UserProfile profile = new UserProfile();
	    	map.addAttribute("userprofile", profileDataManager.getUserProfile(profile));   
	        
	        //return  "profile/updateprofile";
	    	return  "common/footer";//"profile/bkpSignUp";
	    }
	    */
	    @RequestMapping(value = "/SignUp", method = RequestMethod.POST)
	    public String addtUserProfile(@ModelAttribute UserProfile profile, Model model,HttpSession session)  
	    {
	    	logger.info("adding new profile ."+profile);
	    	
	    	model.addAttribute(SessionConstants.USER_PROFILE, profileDataManager.getUserProfile(profile));
	    	profileDataManager.addUserProfile(profile);  
	    	
	    	if(!model.containsAttribute(SessionConstants.USER_PROFILE)) {
	    	      model.addAttribute(SessionConstants.USER_PROFILE, profile);
	    	    }
	    	
	        return  "profile/Update-Profile";
	    }
	    //updateProfile
	    //TODO: following method to be deleted , edit profile can not be called with a get type/
	    @RequestMapping(value = "/updateProfile", method = RequestMethod.GET)
	    public String getUserProfile( Model model,HttpSession session)  
	    {
	    	UserProfile profile = (UserProfile) session.getAttribute( SessionConstants.USER_PROFILE);
	    	
	    	if(null == profile)
	    	{
	    		logError("null profile found.", TSN_Constants.RUNTIME_ERROR_PROFILE_NOT_FOUND);
	    	}
	    	
	    	logger.info(" Session data : profile ."+session.getAttribute( SessionConstants.USER_PROFILE));
	    	
	    	model.addAttribute(SessionConstants.USER_PROFILE,profile);
	        return  "profile/Update-Profile";
	    }
	    
	    


		@RequestMapping(value = "/updateProfile", method = RequestMethod.POST)
	    public String updateUserProfile(@ModelAttribute UserProfile profile, Model model,HttpSession session)  
	    {
			UserProfile sessionProfile = (UserProfile) session.getAttribute( SessionConstants.USER_PROFILE);
//			 session.getAttribute( SessionConstants.USER_PROFILE);
	//    	logger.info(" Session data : profile ."+);
	    	
			UserProfile sessionProfileData = (UserProfile) session.getAttribute( SessionConstants.USER_PROFILE);
			logger.info("  updateProfile - Session data : profile ."+session.getAttribute( SessionConstants.USER_PROFILE));
			logger.info("  updateProfile - user data : profile ."+profile);
            boolean updated = UserProfileConversionUtility.shared.updateUserProfile(profile, sessionProfileData);
	
            if(updated)
			{
            	model.addAttribute(SessionConstants.USER_PROFILE, sessionProfileData);
	
				profileDataManager.updateUserProfile(sessionProfileData);  
		    	session.setAttribute(SessionConstants.USER_PROFILE, sessionProfileData);
		    	//model.addAttribute(arg0)
		    	return  "profile/Update-Profile";
			}
	    	return "errorPage";
	    	
	    }
		/*@RequestMapping(value = "/", method = RequestMethod.GET)
	    public String listsecurityQuestions(ModelMap map)
	    {
	    	map.addAttribute("question", "");
	    	map.addAttribute("masterRecords", masterDataManager.getRecords());   
	        
	        return  "admin/index";
	    }*/
	    
	    @RequestMapping(value = "/add", method = RequestMethod.GET)
	    public String addUserProfile(@ModelAttribute(value="userprofile") UserProfile userProfile, BindingResult result)
	    {
	    	profileDataManager.addUserProfile(userProfile); 
	        return "redirect:/";
	    }
	 
	     
	    @RequestMapping(value = "/logout", method = RequestMethod.GET)
	    public String doLogout( Model model,HttpSession session)  
	    {
	    	UserProfile profile = (UserProfile) session.getAttribute( SessionConstants.USER_PROFILE);
	    	session.invalidate();
	    	 
	        return  "general/index";
	    }	 

}
