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
	    
	    @RequestMapping(value = "/", method = RequestMethod.GET)
	    public String loadUserProfile(ModelMap map)
	    {
	    	//map.addAttribute("question", "");
	    	UserProfile profile = new UserProfile();
	    	map.addAttribute("userprofile", profileDataManager.getUserProfile(profile));   
	        
	        return  "profile/updateprofile";
	    }
	    
	    @RequestMapping(value = "/edit", method = RequestMethod.POST)
	    public String editUserProfile(@ModelAttribute UserProfile profile, Model model)  
	    {
	    	logger.info("adding new profile ."+profile);
	    	
	    	model.addAttribute("userprofile", profileDataManager.getUserProfile(profile));
	    	profileDataManager.addUserProfile(profile);  
	        return  "profile/SignUp";
	    }
	    
	    @RequestMapping(value = "/add", method = RequestMethod.GET)
	    public String addUserProfile(@ModelAttribute(value="userprofile") UserProfile userProfile, BindingResult result)
	    {
	    	profileDataManager.addUserProfile(userProfile); 
	        return "redirect:/";
	    }
	 
	     
	 

}
