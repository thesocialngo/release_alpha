package org.tsn.controller.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.tsn.resources.SessionConstants;
import org.tsn.tos.UserProfile;

public class LoginFilter implements Filter// extends OncePerRequestFilter
{
	final static Logger	logger	= Logger.getLogger(LoginFilter.class);

	/*@Override
	protected void doFilterInternal(
			HttpServletRequest request,
			HttpServletResponse response,
			FilterChain chain)
					throws ServletException,
					IOException*/

	@Override
	public void doFilter(
			ServletRequest request,
			ServletResponse response,
			FilterChain chain)
					throws IOException,
					ServletException
	{

		HttpServletRequest httpRequest = ((HttpServletRequest) request);
		System.out.println("URI :" + httpRequest.getRequestURI()
			+ httpRequest.getMethod());
		HttpSession session = httpRequest.getSession(true);
		UserProfile profile = (UserProfile) session.getAttribute(SessionConstants.USER_PROFILE);
		logger.info("user profile found :" + profile);

		chain.doFilter(request, response);

	}

	@Override
	public void init(FilterConfig filterConfig)
			throws ServletException
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy()
	{
		// TODO Auto-generated method stub

	}

}
