package org.tsn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.tsn.dao.interfaces.IProjectDAO;
import org.tsn.service.interfaces.IProjectMovement;
import org.tsn.tos.ProjectMovement;

public class ProjectMovementManager implements IProjectMovement
{
	@Autowired
	private IProjectDAO	fProjectDAO;

	@Override
	public void addMovement(ProjectMovement movement)
	{
		// TODO Auto-generated method stub
		fProjectDAO.addMovement(movement);

	}

	@Override
	public ProjectMovement getMovement(ProjectMovement movement)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateMovement(ProjectMovement movement)
	{
		// TODO Auto-generated method stub

	}

}
