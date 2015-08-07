package org.tsn.dao;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.tsn.dao.interfaces.IProjectDAO;
import org.tsn.entity.TProjects;
import org.tsn.tos.ProjectMovement;
import org.tsn.utility.DatabaseConversionUtility;

public class ProjectDAOImpl implements IProjectDAO
{

	@Autowired
	private SessionFactory	sessionFactory;

	final static Logger		logger	= Logger.getLogger(ProjectDAOImpl.class);

	@Transactional
	@Override
	public void addMovement(ProjectMovement movement)
	{
		// TODO Auto-generated method stub
		System.out.println(movement);
		try
		{
			TProjects projects = DatabaseConversionUtility.shared.geTProject(movement);
			logger.info("persisting project :" + projects);
			this.sessionFactory.getCurrentSession().save(projects);

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

}
