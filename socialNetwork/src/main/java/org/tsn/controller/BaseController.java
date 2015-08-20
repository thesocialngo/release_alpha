package org.tsn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.tsn.resources.SessionConstants;
import org.tsn.tos.UserProfile;

public class BaseController
{
	final static Logger	logger	= Logger.getLogger(BaseController.class);

	protected UserProfile getUserProfile(HttpServletRequest request)
	{
		HttpSession session = request.getSession(false);
		UserProfile profile = null;
		if (null != session)
		{
			profile = (UserProfile) session.getAttribute(SessionConstants.USER_PROFILE);
		}
		return profile;
	}

	protected void logError(String message, Throwable t)
	{
		logger.error(message, t);
		// redirect to error page

	}

	protected void logError(String message, String runtimeErrorProfileNotFound)
	{
		if (null != runtimeErrorProfileNotFound)
		{
			logError(message, new Exception());
		}
	}
}
