package org.tsn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.tsn.resources.SessionConstants;
import org.tsn.service.interfaces.IUserProfileManager;
import org.tsn.tos.UserProfile;

@Controller
@RequestMapping("/")
public class TSNController extends BaseController
{
	final static Logger			logger	= Logger.getLogger(TSNController.class);

	@Autowired
	private IUserProfileManager	profileDataManager;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String doView(ModelMap map, HttpServletRequest request)
	{
		HttpSession session = request.getSession(false);
		UserProfile profile = null;
		if (null != session)
		{
			profile = (UserProfile) session.getAttribute(SessionConstants.USER_PROFILE);
		}

		return "general/index";
	}

	@RequestMapping(value = "/explore", method = RequestMethod.GET)
	public String doExplore(ModelMap map)
	{

		return "general/Explore";
	}

	@RequestMapping(value = "/howItWorks", method = RequestMethod.GET)
	public String doHowItWorks(ModelMap map)
	{

		return "general/how-it-works";
	}

	/*  @RequestMapping(value = "/StartYourMovement", method = RequestMethod.GET)
	  public String doStartYourMovement(ModelMap map)
	  {
	  	 
	  	return  "general/Start-your-movement";
	  }*/
	@RequestMapping(value = "/TermAndConditions", method = RequestMethod.GET)
	public String doTermsAndConditions(ModelMap map)
	{

		return "general/Terms-Conditions";
	}

}
