package org.tsn.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tsn.service.interfaces.IUserProfileManager;
import org.tsn.tos.UserProfile;

	@Controller
	@RequestMapping("user")
	public class UserController extends BaseController {
		final static Logger logger = Logger.getLogger(UserController.class);

	    @Autowired
	    private IUserProfileManager profileDataManager;
	    
	    @RequestMapping(value = "/SignUp", method = RequestMethod.GET)
	    public String loadUserProfile(ModelMap map)
	    {
	    	//map.addAttribute("question", "");
	    	UserProfile profile = new UserProfile();
	    	map.addAttribute("userprofile", profileDataManager.getUserProfile(profile));   
	        
	        //return  "profile/updateprofile";
	    	return  "profile/Profile-SignUp";//"profile/bkpSignUp";
	    }
	    
	    @RequestMapping(value = "/test", method = RequestMethod.GET)
	    public String testUserProfile(ModelMap map)
	    {
	    	//map.addAttribute("question", "");
	    	UserProfile profile = new UserProfile();
	    	map.addAttribute("userprofile", profileDataManager.getUserProfile(profile));   
	        
	        //return  "profile/updateprofile";
	    	return  "common/header";//"profile/bkpSignUp";
	    }
	    
	    @RequestMapping(value = "/edit", method = RequestMethod.POST)
	    public String editUserProfile(@ModelAttribute UserProfile profile, Model model)  
	    {
	    	logger.info("adding new profile ."+profile);
	    	
	    	model.addAttribute("userprofile", profileDataManager.getUserProfile(profile));
	    	profileDataManager.addUserProfile(profile);  
	        return  "profile/Update-Profile";
	    }
	    
	    //TODO: following method to be deleted , edit profile can not be called with a get type/
	    @RequestMapping(value = "/edit", method = RequestMethod.GET)
	    public String getUserProfile(@ModelAttribute UserProfile profile, Model model)  
	    {
	    	logger.info("adding new profile ."+profile);
	    	
	    	model.addAttribute("userprofile", profileDataManager.getUserProfile(profile));
	    	//profileDataManager.addUserProfile(profile);  
	        return  "profile/Update-Profile";
	    }
	    
	    @RequestMapping(value = "/add", method = RequestMethod.GET)
	    public String addUserProfile(@ModelAttribute(value="userprofile") UserProfile userProfile, BindingResult result)
	    {
	    	profileDataManager.addUserProfile(userProfile); 
	        return "redirect:/";
	    }
	 
	     
	 

}
