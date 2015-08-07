package org.tsn.dao.interfaces;

import org.tsn.tos.ProjectMovement;

public interface IProjectDAO
{

	public void addMovement(ProjectMovement movement);

	ProjectMovement getMovement(ProjectMovement movement);

	public void updateMovement(ProjectMovement movement);
}
