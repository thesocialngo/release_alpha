package org.tsn.dao;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.tsn.dao.interfaces.IProjectDAO;
import org.tsn.entity.TLogin;
import org.tsn.entity.TProject;
import org.tsn.tos.ProjectMovement;
import org.tsn.tos.UserProfile;
import org.tsn.utility.DatabaseConversionUtility;

public class ProjectDAOImpl implements IProjectDAO
{

	@Autowired
	private SessionFactory	sessionFactory;

	final static Logger		logger	= Logger.getLogger(ProjectDAOImpl.class);

	@Transactional
	@Override
	public void addMovement(ProjectMovement movement, UserProfile profile)
	{
		// TODO Auto-generated method stub
		System.out.println(movement);
		try
		{
			TProject project = DatabaseConversionUtility.shared.geTProject(
					movement, profile);

			if (null != project && null != project.getTLogin())
			{
				TLogin login = findById(project.getTLogin().getLoginId());
				if (null != login)
				{
					project.setTLogin(login);
				}
			}
			// findById(projects.getTLogin() )
			logger.info("persisting project :" + project);
			this.sessionFactory.getCurrentSession().save(project);

			logger.info("persist successful");
		}
		catch(RuntimeException re)
		{
			logger.error("FAILED TO ADD RECORD", re);
		}
	}

	@Transactional
	@Override
	public ProjectMovement getMovement(ProjectMovement movement)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void updateMovement(ProjectMovement movement)
	{
		// TODO Auto-generated method stub

	}

	public TLogin findById(Integer id)
	{
		logger.debug("getting TLogin instance with id: " + id);
		try
		{
			TLogin instance = (TLogin) this.sessionFactory.getCurrentSession()
					.get(TLogin.class, id);
			// this.sessionFactory.getCurrentSession().g find(TLogin.class, id);
			logger.debug("get successful");
			return instance;
		}
		catch(RuntimeException re)
		{
			logger.error("get failed", re);
			throw re;
		}
	}
}
