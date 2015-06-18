package org.tsn.controller.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.filter.OncePerRequestFilter;
import org.tsn.resources.SessionConstants;
import org.tsn.tos.UserProfile;

public class LoginFilter extends OncePerRequestFilter {
	final static Logger logger = Logger.getLogger(LoginFilter.class);
	 protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws ServletException, IOException {
	  
System.out.println("xxxxxxxxxx");
		 HttpSession session = request.getSession(true);
		 UserProfile profile = (UserProfile) session.getAttribute(SessionConstants.USER_PROFILE);
		 logger.info("user profile found :"+profile);
		 

	                chain.doFilter(request, response);
	 }
	}