package org.tsn.controller;

import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.tsn.resources.SessionConstants;

public class BaseController {
	final static Logger logger = Logger.getLogger(BaseController.class);

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